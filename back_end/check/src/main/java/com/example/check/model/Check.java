package com.example.check.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document(collection = "checkData")
@Data
public class Check {


    @Id
    private String id;
    @NonNull
    @Indexed(unique=true)
    private String name;
    @NonNull
    private int age;
    @NonNull
    private Long salary;
    @NonNull
    private String department;
    @DBRef
    private List<CheckTwo> checkTwo;
   
}
