package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sampleData")
public class Demo1Model {
	
	@Id
	public String id;
	public String name;
	
	
	
	public Demo1Model(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}



	public Demo1Model() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "DemoModel [id=" + id + ", name=" + name + "]";
	}

}
