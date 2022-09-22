package com.mvl.api.clients.controler;

import com.mvl.api.clients.domain.Client;
import com.mvl.api.clients.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;
   //Obtener todos lo clientes
    @GetMapping(value = "/all")
    public ResponseEntity<List<Client>> getClients(){
        List<Client> clients = clientService.getAllClients();
        return new ResponseEntity <> (clients, HttpStatus.OK);
    }
    // Obtener Cliente por ID
    @GetMapping(value = "/{id}")
    public ResponseEntity<Client> getClient(@PathVariable(name = "id") Long id) {
        Client client = clientService.findById(id);
        return new ResponseEntity<>(client, HttpStatus.OK);
    }
    //Obtener cliente por Email
    @GetMapping(value = "email/{email}")
    public ResponseEntity<Client> getClientByEmail(@PathVariable (name = "email") String email){
        return null;
    }

    //Guarda Nuevo Cliente
    @PostMapping(value = "/")
    public ResponseEntity<Client> save(@RequestBody Client client){
        Client saveClient = clientService.save(client);
        return new ResponseEntity<>(saveClient, HttpStatus.CREATED);
    }
}
