package ma.emsi.grpchotels;

import lombok.RequiredArgsConstructor;
import ma.emsi.grpchotels.services.ChambreService;
import ma.emsi.grpchotels.services.ClientService;
import ma.emsi.grpchotels.services.ReservationService;
import ma.emsi.grpchotels.stub.chambre.Chambre;
import ma.emsi.grpchotels.stub.client.Client;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import ma.emsi.grpchotels.stub.reservation.Reservation.reservationRequest;

@SpringBootApplication
@RequiredArgsConstructor
public class GrpcHotelsMainApp {
	private final ClientService clientService;
	private final ChambreService chambreService;
	private final ReservationService reservationService;


	public static void main(String[] args) {
		SpringApplication.run(GrpcHotelsMainApp.class, args);
	}
	@Bean
	public CommandLineRunner run() {
		return args -> {
			// Insérer un client exemple
			clientService.save(Client.clientRequest.newBuilder()
					.setNom("Ahmed Benali")
					.setEmail("ahmed.benali@example.ma")
					.setTel("0612345678")
					.build());
			System.out.println("Client exemple inséré avec succès.");
			// Insérer une chambre exemple
			chambreService.save(Chambre.ChambreRequest.newBuilder()
					.setId(1)
					.setPrix(350.0)
					.setType("DOUBLE")
					.setDisponible(true)
					.build());
			System.out.println("Chambre exemple insérée avec succès.");
			// Insérer une réservation exemple
			reservationService.save(reservationRequest.newBuilder()
					.setChambreId(1)
					.setClientId(1)
					.setDateDebut("2024-12-01")
					.setDateFin("2024-12-07")
					.setPreferences("Chambre Double avec vue sur mer")
					.build());
			System.out.println("Réservation exemple insérée avec succès.");
		};
	}

}
