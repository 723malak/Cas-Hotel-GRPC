package ma.emsi.grpchotels.controllers;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import ma.emsi.grpchotels.services.ReservationService;
import ma.emsi.grpchotels.stub.reservation.Reservation;
import ma.emsi.grpchotels.stub.reservation.ReservationServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import ma.emsi.grpchotels.stub.reservation.Reservation.reservationResponse;

import java.util.List;

@RequiredArgsConstructor
@GrpcService
public class ReservationController extends ReservationServiceGrpc.ReservationServiceImplBase {
    private final ReservationService service;
    @Override
    public void findById(Reservation.FindByIdRequest request, StreamObserver<Reservation.reservationResponse> responseObserver) {
        reservationResponse  response=service.findById(request.getId()).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
        super.findById(request, responseObserver);
    }

    @Override
    public void findAll(Reservation.FindByRequest request, StreamObserver<Reservation.FindAllResponse> responseObserver) {
        List<reservationResponse> res=service.findAll();
        Reservation.FindAllResponse list = Reservation.FindAllResponse.newBuilder().addAllReservations(res).build();
        responseObserver.onNext(list);
        responseObserver.onCompleted();    }

    @Override
    public void delete(Reservation.FindByIdRequest request, StreamObserver<Reservation.reservationResponse> responseObserver) {
        reservationResponse response=service.delete(request.getId()).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void update(Reservation.reservationRequestUpd request, StreamObserver<Reservation.reservationResponse> responseObserver) {
        reservationResponse response=service.update(request.getReservation(),request.getId()).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void create(Reservation.reservationRequest request, StreamObserver<Reservation.reservationResponse> responseObserver) {
        reservationResponse response=service.save(request).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();    }
}
