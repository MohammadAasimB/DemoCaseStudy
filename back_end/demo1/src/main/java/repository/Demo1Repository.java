package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Demo1Model;

public interface Demo1Repository extends MongoRepository<Demo1Model,String>{

}
