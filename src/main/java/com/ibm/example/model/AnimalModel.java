package com.ibm.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class AnimalModel {
	private String nombre;
	private String fecha_nacimiento;
	private String raza;
	private String tamanio;
	private String color;
	private Double peso;
}
