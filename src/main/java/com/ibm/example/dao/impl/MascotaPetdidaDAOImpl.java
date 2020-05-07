package com.ibm.example.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.example.dao.MascotaPerdidaDAO;
import com.ibm.example.entity.MascotaPerdida;
import com.ibm.example.model.MascotaPerdidaModel;
import com.ibm.example.repository.MascotaPerdidaRepository;

@Repository
public class MascotaPetdidaDAOImpl implements MascotaPerdidaDAO{
	@Autowired
	MascotaPerdidaRepository repository;
	
	@Override
	public MascotaPerdidaModel findMascotaByName(String nombre) {
		Optional<MascotaPerdida> mascota = Optional.ofNullable(repository.findByNombre(nombre));
		if(!mascota.isPresent()) {
			return new MascotaPerdidaModel();
		}
		return createModel(mascota.get());
	}

	public MascotaPerdidaModel createModel(MascotaPerdida mascota) {
		MascotaPerdidaModel model = new MascotaPerdidaModel();

		model.setNombre(mascota.getNombre());
		model.setFecha_nacimiento(mascota.getFecha_nacimiento());
		model.setRaza(mascota.getRaza());
		model.setTamanio(mascota.getTamanio());
		model.setColor(mascota.getColor());
		model.setPeso(mascota.getPeso());
		model.setEncontrado(mascota.getEncontrado());
		model.setMensaje(mascota.getMensaje());
		
		return model;
	}
}
