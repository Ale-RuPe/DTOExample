package com.ibm.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="mascotas_perdidas")
public class MascotaPerdida {
	@Id
    @GeneratedValue()
	@Column(name = "id")
    private Integer id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;
	
	@Column(name = "raza")
	private String raza;
	
	@Column(name = "tamanio")
	private String tamanio;
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "peso")
	private Double peso;
	
	@Column(name = "latitud")
	private Double latitud;
	
	@Column(name = "longitud")
	private Double longitud;
	
	@Column(name = "encontrado")
	private Boolean encontrado;
	
	@Column(name = "mensaje")
	private String mensaje;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "usuario")
	private String usuario;
	
}

