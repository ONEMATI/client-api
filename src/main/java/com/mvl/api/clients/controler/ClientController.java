package com.mvl.api.clients.controler;

import com.mvl.api.clients.domain.Client;
import com.mvl.api.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @GetMapping(value = "/get")
    public ResponseEntity<List<Client>> getClients(){
        List<Client> clients = clientService.getAllClients();

        return new ResponseEntity <> (clients, HttpStatus.OK);
    }
    @PostMapping(value = "/")
    public ResponseEntity<Client> save(Client client){
        Client saveClient = clientService.save(client);
        return new ResponseEntity<>(saveClient, HttpStatus.CREATED);
    }
}
