package com.example.check.controller;

import com.example.check.model.Check;
import com.example.check.model.CheckTwo;
import com.example.check.service.CheckService;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@Slf4j
public class CheckController {

    @Autowired
    private CheckService checkService;

    @GetMapping("/allData")
    public List<Check> getAllData() {
    	log.error("get all data is working fine!");
        return checkService.getAllData();
    }

    @GetMapping("/getById/{id}")
    public Optional<Check> getById(@PathVariable("id") String id) {
        return checkService.getById(id);
    }
    
    @GetMapping("/getByName/{name}")
    public Optional<Check> getByName(@PathVariable("name") String name){
    	return checkService.getByName(name);
    }

    @PostMapping("/addData")
    public Check addData(@RequestBody Check check) {
        return checkService.addData(check);
    }

    @PutMapping("/updateData/{id}")
    public Optional<Check> upDate(@RequestBody Check Newcheck, @PathVariable("id") String id) {
        return checkService.updateData(Newcheck, id);
    }

    @DeleteMapping("/deleteData/{id}")
    public String deleteData(@PathVariable("id") String id){

        checkService.deleteData(id);
        return "Data Deleted";
    }
    
    @PostMapping("/addToCheckTwo")
    public CheckTwo addDataToCheckTwo(@RequestBody CheckTwo checkTwo) {
    	return checkService.addDataToCheckTwo(checkTwo);
    }


}
