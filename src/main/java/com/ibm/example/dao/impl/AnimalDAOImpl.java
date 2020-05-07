package com.ibm.example.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.example.dao.AnimalDAO;
import com.ibm.example.entity.Animal;
import com.ibm.example.model.AnimalModel;
import com.ibm.example.repository.AnimalRepository;

@Repository
public class AnimalDAOImpl implements AnimalDAO{
	@Autowired
	AnimalRepository repository;
	
	@Override
	public AnimalModel findAnimalByName(String nombre) {
		Optional<Animal> animal = Optional.ofNullable(repository.findByNombre(nombre));
		if(!animal.isPresent()) {
			return new AnimalModel();
		}
		return createModel(animal.get());
	}
	
	public AnimalModel createModel(Animal animal) {
		AnimalModel model = new AnimalModel();
		
		model.setNombre(animal.getNombre());
		model.setFecha_nacimiento(animal.getFecha_nacimiento());
		model.setRaza(animal.getRaza());
		model.setTamanio(animal.getTamanio());
		model.setColor(animal.getColor());
		model.setPeso(animal.getPeso());
		
		return model;
	}

}
