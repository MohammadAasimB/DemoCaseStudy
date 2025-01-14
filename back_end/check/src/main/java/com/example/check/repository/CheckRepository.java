package com.example.check.repository;

import com.example.check.model.Check;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckRepository extends MongoRepository<Check,String> {
	
	Optional<Check> findByName(String name);
}
