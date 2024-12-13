package ma.emsi.grpchotels.services;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import ma.emsi.grpchotels.stub.client.Client.clientRequest;
import ma.emsi.grpchotels.stub.client.Client.clientResponse;
import ma.emsi.grpchotels.entities.Client;
import ma.emsi.grpchotels.entities.Reservation;
import ma.emsi.grpchotels.mapper.ClientMapper;
import ma.emsi.grpchotels.repositories.ClientRepository;
import ma.emsi.grpchotels.repositories.ReservationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
@Slf4j
public class ClientService implements ServiceMetier<Client, clientResponse, clientRequest> {

    private final ClientRepository clientRepository;
    private final ReservationRepository reservationRepository;

    @Override
    public Optional<clientResponse> findById(Long id) {
        log.info("Fetching client with id: {}", id);
        Client client = clientRepository.findById(id).orElseThrow(() -> {
            log.warn("Client with id {} not found", id);
            return new RuntimeException("Client not found");
        });
        log.info("Client found: {}", client.getId());
        return Optional.of(ClientMapper.toResponseDTO(client));
    }

    public List<clientResponse> findByEmailOrName(String keyword) {
        log.info("Searching clients by name or email with keyword: {}", keyword);
        List<Client> clients = clientRepository.findByNomContainingIgnoreCaseOrEmailContainingIgnoreCase(keyword, keyword);
        if (clients.isEmpty()) {
            log.warn("No clients found for keyword: {}", keyword);
        } else {
            log.info("{} client(s) found for keyword: {}", clients.size(), keyword);
        }
        return clients.stream()
                .map(ClientMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<clientResponse> findAll() {
        log.info("Fetching all clients");
        List<Client> clients = clientRepository.findAll();
        log.info("Found {} clients", clients.size());
        return clients.stream()
                .map(ClientMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<clientResponse> save(clientRequest clientRequestDTO) {
        log.info("Attempting to save client: {}", clientRequestDTO);
        Client client = ClientMapper.toEntity(clientRequestDTO);
        Client savedClient = clientRepository.save(client);
        log.info("Client saved successfully: {}", savedClient);
        return Optional.of(ClientMapper.toResponseDTO(savedClient));
    }

    @Override
    public Optional<clientResponse> update(clientRequest clientRequestDTO, Long id) {
        log.info("Attempting to update client with id: {}", id);
        Client existingClient = clientRepository.findById(id).orElseThrow(() -> {
            log.error("Client with id {} not found for update", id);
            return new RuntimeException("Client not found");
        });
        if(!clientRequestDTO.getNom().isEmpty()){
            existingClient.setNom(clientRequestDTO.getNom());
        }
        if(!clientRequestDTO.getEmail().isEmpty()){
            existingClient.setEmail(clientRequestDTO.getEmail());
        }
        if(!clientRequestDTO.getTel().isEmpty()){
            existingClient.setTel(clientRequestDTO.getTel());
        }

        Client updatedClient = clientRepository.save(existingClient);
        log.info("Client updated successfully: {}", updatedClient);
        return Optional.of(ClientMapper.toResponseDTO(updatedClient));
    }

    @Override
    public Optional<clientResponse> delete(Long id) {
        log.info("Attempting to delete client with id: {}", id);

        Client client = clientRepository.findById(id).orElseThrow(() -> {
            log.error("Client with id {} not found for deletion", id);
            return new RuntimeException("Client not found");
        });

        List<Reservation> reservations = reservationRepository.findByClient(client);
        log.info("Found {} reservations associated with client id: {}", reservations.size());

        // Suppression des réservations associées
        for (Reservation reservation : reservations) {
            log.info("Deleting reservation with id: {}", reservation.getId());
            reservationRepository.delete(reservation);
        }

        clientRepository.delete(client);
        log.info("Client deleted successfully: {}", client);
        return Optional.of(ClientMapper.toResponseDTO(client));
    }
}
