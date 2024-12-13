package ma.emsi.grpchotels.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse;
import ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest;
import ma.emsi.grpchotels.entities.Chambre;
import ma.emsi.grpchotels.entities.Client;
import ma.emsi.grpchotels.entities.Reservation;
import ma.emsi.grpchotels.mapper.ReservationMapper;
import ma.emsi.grpchotels.repositories.ChambreRepository;
import ma.emsi.grpchotels.repositories.ClientRepository;
import ma.emsi.grpchotels.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ReservationService implements ServiceMetier<Reservation, reservationResponse, reservationRequest> {

    private final ReservationRepository reservationRepository;
    private final ChambreRepository chambreRepository;
    private final ClientRepository clientRepository;

    @Override
    public Optional<reservationResponse> findById(Long id) {
        log.info("Fetching reservation with id: {}", id);
        Reservation reservation = reservationRepository.findById(id).orElseThrow(() -> {
            log.warn("Reservation with id {} not found", id);
            return new RuntimeException("Reservation with id " + id + " does not exist");
        });
        return Optional.of(ReservationMapper.toResponseDTO(reservation));
    }

    @Override
    public List<reservationResponse> findAll() {
        log.info("Fetching all reservations");
        return reservationRepository.findAll().stream()
                .map(ReservationMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<reservationResponse> save(reservationRequest reservationRequestDTO) {
        log.info("Saving new reservation: {}", reservationRequestDTO);

        Chambre chambre = chambreRepository.findById(reservationRequestDTO.getChambreId())
                .orElseThrow(() -> {
                    log.error("Chambre with id {} not found", reservationRequestDTO.getChambreId());
                    return new RuntimeException("Chambre with id " + reservationRequestDTO.getChambreId() + " does not exist");
                });

        if (!chambre.getDisponible()) {
            log.error("Chambre with id {} is not available", chambre.getId());
            throw new RuntimeException("Chambre with id " + chambre.getId() + " is not available");
        }
        Client client = clientRepository.findById(reservationRequestDTO.getClientId()).orElseThrow(() -> {
            log.error("client with id {} not found", reservationRequestDTO.getClientId());
            return new RuntimeException("client with id " + reservationRequestDTO.getClientId() + " does not exist");
        });
        Reservation reservation = Reservation.builder()
                .client(client)
                .chambre(chambre)
                .datedebut(LocalDate.parse(reservationRequestDTO.getDateDebut()))
                .datefin(LocalDate.parse(reservationRequestDTO.getDateFin()))
                .preferences(reservationRequestDTO.getPreferences())
                .build();

        chambre.setDisponible(false);
        chambreRepository.save(chambre);

        Reservation savedReservation = reservationRepository.save(reservation);
        log.info("Reservation saved successfully: {}", savedReservation);
        return Optional.of(ReservationMapper.toResponseDTO(savedReservation));
    }

    @Override
    public Optional<reservationResponse> update(reservationRequest reservationRequestDTO, Long id) {
        log.info("Updating reservation with id: {}", id);

        Reservation existingReservation = reservationRepository.findById(id).orElseThrow(() -> {
            log.error("Reservation with id {} not found", id);
            return new RuntimeException("Reservation with id " + id + " does not exist");
        });

        Chambre chambre = null;
        if (reservationRequestDTO.getChambreId() != existingReservation.getChambre().getId()) {
            chambre = chambreRepository.findById(reservationRequestDTO.getChambreId())
                    .orElseThrow(() -> {
                        log.error("Chambre with id {} not found", reservationRequestDTO.getChambreId());
                        return new RuntimeException("Chambre with id " + reservationRequestDTO.getChambreId() + " does not exist");
                    });

            if (!chambre.getDisponible()) {
                log.error("Chambre with id {} is not available", chambre.getId());
                throw new RuntimeException("Chambre with id " + chambre.getId() + " is not available");
            }
            existingReservation.setChambre(chambre);
        }

        existingReservation.setDatedebut(LocalDate.parse(reservationRequestDTO.getDateDebut()));
        existingReservation.setDatefin(LocalDate.parse(reservationRequestDTO.getDateFin()));
        existingReservation.setPreferences(reservationRequestDTO.getPreferences());

        if (chambre != null) {
            chambre.setDisponible(false);
            chambreRepository.save(chambre);
        }

        Reservation updatedReservation = reservationRepository.save(existingReservation);
        log.info("Reservation with id {} updated successfully", id);
        return Optional.of(ReservationMapper.toResponseDTO(updatedReservation));
    }

    @Override
    public Optional<reservationResponse> delete(Long id) {
        log.info("Deleting reservation with id: {}", id);

        Reservation reservation = reservationRepository.findById(id).orElseThrow(() -> {
            log.error("Reservation with id {} not found", id);
            return new RuntimeException("Reservation with id " + id + " does not exist");
        });

        // Mark the associated chambre as available when the reservation is deleted
        Chambre chambre = reservation.getChambre();
        if (chambre != null) {
            chambre.setDisponible(true);
            chambreRepository.save(chambre);
            log.info("Chambre with id {} marked as available", chambre.getId());
        }

        reservationRepository.delete(reservation);
        log.info("Reservation with id {} deleted successfully", id);
        return Optional.of(ReservationMapper.toResponseDTO(reservation));
    }
}
