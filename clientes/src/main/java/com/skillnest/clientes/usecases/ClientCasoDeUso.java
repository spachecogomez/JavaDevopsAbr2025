package com.skillnest.clientes.usecases;

import com.skillnest.clientes.adapters.dto.ClientDTO;
import com.skillnest.clientes.adapters.mappers.ClientMapper;
import com.skillnest.clientes.entities.Client;
import com.skillnest.clientes.entities.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ClientService implements IClienteCasoUso {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<Client> getAllClients() {

        return StreamSupport.stream(clientRepository.findAll().spliterator(), false).toList();
    }

    @Override
    public Client getClientById(Long id) {
        return clientRepository.findById(id).orElse(null);
    }

    @Override
    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client updateClient(Client client) {
        return clientRepository.save(client);
    }
}
