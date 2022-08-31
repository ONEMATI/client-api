package com.mvl.api.clients.service;

import com.mvl.api.clients.domain.Client;
import com.mvl.api.clients.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;
    public List<Client> getAllClients() {
        List<Client> clients = clientRepository.findAll();
        return clients;
    }
    public Client save (Client client){
        Client saveClient = clientRepository.save(client);
        return saveClient;
    }
}
