package com.skillnest.clientes.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Table(name = "cliente")
@Entity
@Data
public class Client {

	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	@Column(name = "ID")
	@Id
	private Long id;

	@Column(name = "NOMBRE")
	@NotNull
	private String nombre;

	@Column(name = "EMAIL")
	@NotNull
	private String email;

}
