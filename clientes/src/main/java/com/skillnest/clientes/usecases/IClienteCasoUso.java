package com.skillnest.clientes.usecases;

import com.skillnest.clientes.adapters.dto.ClientDTO;
import com.skillnest.clientes.entities.Client;
//import com.skillnest.clientes.entities.ClientDTO;

import java.util.ArrayList;
import java.util.List;

public interface IClienteCasoUso  {

    List<ClientDTO> getAllClients();
    ClientDTO getClientById(Long id);
    ClientDTO saveClient(ClientDTO clientDTO);
    ClientDTO updateClient(ClientDTO clientDTO);
}
