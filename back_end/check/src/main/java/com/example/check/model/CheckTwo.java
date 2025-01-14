package com.example.check.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

import lombok.Data;

@Document(collection = "checkTwoData")
@Data
public class CheckTwo {

	@Id
	private String id;
	@NonNull
	private String type;
}
