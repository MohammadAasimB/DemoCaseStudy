package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Demo1Model;
import service.Demo1Service;

@RestController
@RequestMapping("/demo")
public class Demo1Controller {
	
	@Autowired
	private Demo1Service ds;

	@GetMapping("/allData")
	public List<Demo1Model> getAllData(){
		return ds.getAll();
	}
	
	@GetMapping("/all")
	public String getAll(){
		return "Wel";
	}

}
