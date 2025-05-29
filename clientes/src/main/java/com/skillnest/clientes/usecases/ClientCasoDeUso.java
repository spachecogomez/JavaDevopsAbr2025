package com.skillnest.clientes.usecases;

import com.skillnest.clientes.adapters.dto.ClientDTO;
import com.skillnest.clientes.adapters.mappers.ClientMapper;
import com.skillnest.clientes.entities.Client;
import com.skillnest.clientes.entities.repositories.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.StreamSupport;

@Service
@RequiredArgsConstructor
public class ClientCasoDeUso implements IClienteCasoUso {

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;

    @Override
    public List<ClientDTO> getAllClients() {

        return StreamSupport.stream(clientRepository.findAll().spliterator(), false)
                .toList().stream().map(clientMapper::clientToClientDTO).toList();
    }

    @Override
    public ClientDTO getClientById(Long id) {
        Client client = clientRepository.findById(id).orElse(null);
        return client == null ? null : clientMapper.clientToClientDTO(client);
    }

    @Override
    public ClientDTO saveClient(ClientDTO clientDTO) {
        Client client = clientMapper.clientDTOToClient(clientDTO);
        client = clientRepository.save(client);
        return clientMapper.clientToClientDTO(client);
    }

    @Override
    public ClientDTO updateClient(ClientDTO clientDTO) {
        Client client = clientMapper.clientDTOToClient(clientDTO);
        client = clientRepository.save(client);
        return clientMapper.clientToClientDTO(client);
    }
}
