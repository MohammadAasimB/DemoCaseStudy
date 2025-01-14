package com.example.check.service;

import com.example.check.model.Check;
import com.example.check.model.CheckTwo;
import com.example.check.repository.CheckRepository;
import com.example.check.repository.CheckTwoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CheckService {

    @Autowired
    private CheckRepository checkRepository;
    
    @Autowired
    private CheckTwoRepository checkTwoRepository;
    
    public List<Check> getAllData() {
        return checkRepository.findAll();
    }

    public Check addData(Check check) {
        return checkRepository.save(check);
    }

    public Optional<Check> getById(String id) {
        return checkRepository.findById(id);
    }

    public Optional<Check> updateData(Check Newcheck, String id) {
        Check existingCheck = checkRepository.findById(id).get();

        existingCheck.setName(Newcheck.getName());
        existingCheck.setAge(Newcheck.getAge());
        existingCheck.setSalary(Newcheck.getSalary());
        existingCheck.setDepartment(Newcheck.getDepartment());

        checkRepository.save(existingCheck);
        return Optional.of(existingCheck);
    }

    public String deleteData(String id) {
        checkRepository.deleteById(id);
        return "Data Deleted";
    }

	public CheckTwo addDataToCheckTwo(CheckTwo checkTwo) {
		
		return checkTwoRepository.save(checkTwo);
	}

	public Optional<Check> getByName(String name) {
		return checkRepository.findByName(name);
	}
}
