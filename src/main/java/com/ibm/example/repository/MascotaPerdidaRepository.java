package com.ibm.example.repository;

import org.springframework.data.repository.CrudRepository;

import com.ibm.example.entity.MascotaPerdida;

public interface MascotaPerdidaRepository extends CrudRepository<MascotaPerdida, Integer>{
	MascotaPerdida findByNombre(String nombre);
}
