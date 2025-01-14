package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import model.Demo1Model;

import repository.Demo1Repository;

@Service
public class Demo1Service {
	
	@Autowired
	private Demo1Repository dr;

	public List<Demo1Model> getAll() {
		return dr.findAll();
	}

}
