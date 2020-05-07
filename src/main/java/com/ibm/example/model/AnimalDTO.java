package com.ibm.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AnimalDTO {
	
	private String nombre;
	private String raza;
	private String tamanio;
	private String color;
	private Boolean encontrado;
	private String mensaje;
}
