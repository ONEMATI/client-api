package com.mvl.api.clients.controler;

import com.mvl.api.clients.domain.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @GetMapping(value = "/get")
    public ResponseEntity <Client> getClient () {
        Client client = new Client();
        client.setName("Matias");
        client.setLastName("Vera");
        client.setEmail("matias.vera.lima@gmail.com");

        return new ResponseEntity <> (client, HttpStatus.OK);
    }
}
