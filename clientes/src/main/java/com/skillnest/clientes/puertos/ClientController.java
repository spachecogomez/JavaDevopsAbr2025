package com.skillnest.clientes.puertos;

import com.skillnest.clientes.adapters.dto.ClientControladorDTO;
import com.skillnest.clientes.adapters.dto.ClientDTO;
import com.skillnest.clientes.adapters.mappers.ClientMapper;
import com.skillnest.clientes.usecases.ClientCasoDeUso;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClientController {

    private final ClientCasoDeUso clientCasoDeUso;
    private final ClientMapper clientMapper;


    @GetMapping("/{id}")
    public ResponseEntity<ClientControladorDTO> getClient(@PathVariable Long id){
        ClientDTO clientDTO = clientCasoDeUso.getClientById(id);
        return clientDTO == null ? null : ResponseEntity.ok(clientMapper.clientDTOToClientControladorDTO(clientDTO));

    }
}
