package com.ibm.example.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Document("animals")
public class Animal {
	@Id
	private Integer id;
	
	private String nombre;
	private String fecha_nacimiento;
	private String raza;
	private String tamanio;
	private String color;
	private Double peso;
	private Double latitud;
	private Double longitud;
	private String comportamiento;
	private String observaciones;
	private String historia;
}
