package ma.emsi.grpchotels.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.emsi.grpchotels.entities.Chambre;
import ma.emsi.grpchotels.entities.Reservation;
import ma.emsi.grpchotels.entities.TypeChambre;
import ma.emsi.grpchotels.mapper.ChambreMapper;
import ma.emsi.grpchotels.repositories.ChambreRepository;
import ma.emsi.grpchotels.repositories.ReservationRepository;
import org.springframework.stereotype.Service;
import ma.emsi.grpchotels.stub.chambre.Chambre.ChambreResponse;
import ma.emsi.grpchotels.stub.chambre.Chambre.ChambreRequest;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ChambreService implements ServiceMetier<Chambre,  ChambreResponse,  ChambreRequest> {

    private final ChambreRepository chambreRepository;
    private final ReservationRepository reservationRepository;

    @Override
    public Optional< ChambreResponse> findById(Long id) {
        log.info("Fetching chambre with id: {}", id);
        Chambre result=chambreRepository.findById(id).orElseThrow(() -> {
            log.error("Chambre with id {} not found", id);
            return new RuntimeException("Chambre with id " + id + " does not exist");
        });
        return Optional.of(ChambreMapper.toResponseDTO(result));
    }

    @Override
    public List< ChambreResponse> findAll() {
        log.info("Fetching all chambres");
        return chambreRepository.findAll().stream().map(ChambreMapper::toResponseDTO).collect(Collectors.toList());
    }

    @Override
    public Optional< ChambreResponse> save( ChambreRequest chambre) {
        if (chambreRepository.existsById(chambre.getId())) {
            log.error("Chambre with id {} already exists", chambre.getId());
            throw new RuntimeException("Chambre with id " + chambre.getId() + " already exists");
        }
        Chambre saved =ChambreMapper.toEntity(chambre);
        log.info("Saving new chambre: {}", chambre);
        Chambre result=chambreRepository.save(saved);
        return Optional.of(ChambreMapper.toResponseDTO(result));
    }

    @Override
    public Optional< ChambreResponse> update( ChambreRequest chambre, Long id) {
        log.info("Updating chambre with id: {}", id);
        Chambre existingChambre = chambreRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Chambre with id {} not found", id);
                    return new RuntimeException("Chambre with id " + id + " does not exist");
                });
        if ( chambre.getPrix() != existingChambre.getPrix()){
            existingChambre.setPrix(chambre.getPrix());

        }
        if (chambre.getDisponible()!= existingChambre.getDisponible()){
            existingChambre.setDisponible(chambre.getDisponible());

        }
        if (chambre.getType() != null){
            existingChambre.setType(TypeChambre.valueOf(chambre.getType()));

        }
        log.info("Chambre with id {} updated successfully", id);
        Chambre result=chambreRepository.save(existingChambre);
        return Optional.of(ChambreMapper.toResponseDTO(result));
    }

    @Override
    public Optional< ChambreResponse> delete(Long id) {
        log.info("Deleting chambre with id: {}", id);
        Chambre existingChambre = chambreRepository.findById(id)
                .orElseThrow(() -> {
                    log.error("Chambre with id {} not found", id);
                    return new RuntimeException("Chambre with id " + id + " does not exist");
                });
        List<Reservation> reservations = reservationRepository.findByChambre(existingChambre);
        log.info("Found {} reservations associated with chambre id: {}", reservations.size(), id);
        for (Reservation reservation : reservations) {
            log.info("Deleting reservation with id: {}", reservation.getId());
            reservationRepository.delete(reservation);
        }
        chambreRepository.delete(existingChambre);
        log.info("Chambre with id {} deleted successfully", id);
        return Optional.of(ChambreMapper.toResponseDTO(existingChambre));
    }

    public List< ChambreResponse> findByDisponibilite(boolean isDisponible) {
        log.info("Fetching chambres with disponibilité: {}", isDisponible);
        List<Chambre> chambres = chambreRepository.findByDisponible(isDisponible);
        log.info("Found {} chambres with disponibilité: {}", chambres.size(), isDisponible);
        return chambres.stream().map(ChambreMapper::toResponseDTO).collect(Collectors.toList());
    }
}
