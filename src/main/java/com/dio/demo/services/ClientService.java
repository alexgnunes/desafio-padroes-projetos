package com.dio.demo.services;

import com.dio.demo.entities.Client;
import com.dio.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public List<Client> buscarTodos() {
        return clientRepository.findAll();
    }
    @Transactional
    public void inserir(Client client) {
        clientRepository.save(client);
    }
}
