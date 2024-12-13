package ma.emsi.grpchotels.controllers;

import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import ma.emsi.grpchotels.services.ClientService;
import ma.emsi.grpchotels.stub.client.Client;
import ma.emsi.grpchotels.stub.client.ClientServiceGrpc;
import net.devh.boot.grpc.server.service.GrpcService;
import ma.emsi.grpchotels.stub.client.Client.clientResponse;

import java.util.List;


@RequiredArgsConstructor
@GrpcService
public class ClientController extends ClientServiceGrpc.ClientServiceImplBase {
    private final ClientService service;
    @Override
    public void findById(Client.FindByIdRequest request, StreamObserver<Client.clientResponse> responseObserver) {
        clientResponse response=service.findById(request.getId()).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void findAll(Client.FindByRequest request, StreamObserver<Client.FindAllResponse> responseObserver) {
        List<clientResponse> res=service.findAll();
        Client.FindAllResponse list = Client.FindAllResponse.newBuilder().addAllClients(res).build();
        responseObserver.onNext(list);
        responseObserver.onCompleted();
    }

    @Override
    public void findByemail(Client.FindByRequestbyemailornom request, StreamObserver<Client.FindAllResponse> responseObserver) {
        List<clientResponse>res=service.findByEmailOrName(request.getData());
        Client.FindAllResponse list = Client.FindAllResponse.newBuilder().addAllClients(res).build();
        responseObserver.onNext(list);
        responseObserver.onCompleted();
    }

    @Override
    public void delete(Client.FindByIdRequest request, StreamObserver<Client.clientResponse> responseObserver) {
        clientResponse response=service.delete(request.getId()).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }



    @Override
    public void create(Client.clientRequest request, StreamObserver<Client.clientResponse> responseObserver) {
        clientResponse response=service.save(request).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }

    @Override
    public void update(Client.clientRequestUpd request, StreamObserver<clientResponse> responseObserver) {
        clientResponse response=service.update(request.getClient(),request.getId()).orElseThrow(()->new RuntimeException("client not found"));
        responseObserver.onNext(response);
        responseObserver.onCompleted();
    }
}
