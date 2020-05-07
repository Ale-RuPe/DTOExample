package com.ibm.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class MascotaPerdidaModel {
	private String nombre;
	private String fecha_nacimiento;
	private String raza;
	private String tamanio;
	private String color;
	private Double peso;
	private Double latitud;
	private Double longitud;
	private Boolean encontrado;
	private String mensaje;
	private String usuario;
	private String foto;
}
