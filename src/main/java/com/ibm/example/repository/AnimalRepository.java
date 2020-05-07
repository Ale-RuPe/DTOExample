package com.ibm.example.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.example.entity.Animal;

public interface AnimalRepository extends MongoRepository<Animal, String>  {
	Animal  findByNombre(String nombre);
}
