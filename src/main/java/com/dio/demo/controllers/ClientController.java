package com.dio.demo.controllers;

import com.dio.demo.entities.Client;
import com.dio.demo.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    public ResponseEntity<List<Client>> buscarTodos() {
        return ResponseEntity.ok(clientService.buscarTodos());
    }
    @PostMapping
    public ResponseEntity<Client> inserir(@RequestBody Client client){
        clientService.inserir(client);
        return ResponseEntity.ok(client);
    }
}
