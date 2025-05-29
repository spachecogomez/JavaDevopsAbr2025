package com.skillnest.clientes.adapters.mappers;

import com.skillnest.clientes.adapters.dto.ClientControladorDTO;
import com.skillnest.clientes.adapters.dto.ClientDTO;
import com.skillnest.clientes.entities.Client;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ClientMapper {

    @Mapping(source="identificacion", target="id")
    @Mapping(source="nombreCompleto", target="nombre")
    @Mapping(source="correo", target="email")
    Client clientToClientControladorDTO (ClientControladorDTO clientControladorDTO);

    @Mapping(source="id", target="identificacion")
    @Mapping(source="nombre", target="nombreCompleto")
    @Mapping(source="email", target="correo")
    ClientControladorDTO clientControladorDTOToClient (Client client);

    Client clientDTOToClient (ClientDTO clientDTO);

    ClientDTO clientToClientDTO (Client client);

    @Mapping(source="id", target="identificacion")
    @Mapping(source="nombre", target="nombreCompleto")
    @Mapping(source="email", target="correo")
    ClientControladorDTO clientDTOToClientControladorDTO (ClientDTO clientDTO);

}
