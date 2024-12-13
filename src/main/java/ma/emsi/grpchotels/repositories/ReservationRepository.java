package ma.emsi.grpchotels.repositories;

import ma.emsi.grpchotels.entities.Chambre;
import ma.emsi.grpchotels.entities.Client;
import ma.emsi.grpchotels.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {
    List<Reservation> findByChambre(Chambre chambre);
    List<Reservation> findByClient(Client chambre);

}
