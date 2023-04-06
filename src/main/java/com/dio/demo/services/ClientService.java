package com.dio.demo.services;

import com.dio.demo.entities.Client;
import com.dio.demo.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    @Transactional(readOnly = true)
    public List<Client> buscarTodos() {
        return clientRepository.findAll();
    }

    public Client buscarId(Integer id) {
        Optional<Client> cliente = clientRepository.findById(id);
        return cliente.get();
    }
    @Transactional
    public void inserir(Client client) {
        clientRepository.save(client);
    }


}
