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

    @GetMapping("/{id}")
    public ResponseEntity<Client> buscarId(@PathVariable Integer id) {
        return ResponseEntity.ok(clientService.buscarId(id));
    }

    @PostMapping
    public ResponseEntity<Client> inserir(@RequestBody Client client){
        clientService.inserir(client);
        return ResponseEntity.ok(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> atualizar(@PathVariable Integer id, @RequestBody Client client){
        clientService.atualizar(id, client);
        return ResponseEntity.ok(client);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Client> atualizar(@PathVariable Integer id){
        clientService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
