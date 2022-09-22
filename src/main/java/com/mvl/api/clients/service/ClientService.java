package com.mvl.api.clients.service;

import com.mvl.api.clients.domain.Client;
import com.mvl.api.clients.exceptions.ClientNotFoundExceptions;
import com.mvl.api.clients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }
    public Client findById (Long id){
        return clientRepository.findById(id).orElseThrow(() -> new ClientNotFoundExceptions("Clinte Not Fount"));
        //       Optional<Client> client = clientRepository.findById(id);
        //       Client c = client.orElseThrow(()-> new ClientNotFoundExceptions("Client Not Found"));
        //       return c;
    }
    public Client save (Client client){
        Client saveClient = clientRepository.save(client);
        return saveClient;
    }
}
