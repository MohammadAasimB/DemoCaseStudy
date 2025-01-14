package demoRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import demoModel.DemoModel;


@Repository
public interface DemoRepository extends MongoRepository<DemoModel,String>{

}
