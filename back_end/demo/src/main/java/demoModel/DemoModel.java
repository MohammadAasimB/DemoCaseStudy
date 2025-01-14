package demoModel;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="DemoData1")
public class DemoModel {

	@Id
	private String book_id;
	private String book_name;
	private String book_info;
	
	
	
	@Override
	public String toString() {
		return "DemoModel [book_id=" + book_id + ", book_name=" + book_name + ", book_info=" + book_info + "]";
	}
	
	public DemoModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemoModel(String book_id, String book_name, String book_info) {
		super();
		this.book_id = book_id;
		this.book_name = book_name;
		this.book_info = book_info;
	}

	public String getBook_id() {
		return book_id;
	}
	public void setBook_id(String book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_info() {
		return book_info;
	}
	public void setBook_info(String book_info) {
		this.book_info = book_info;
	}
	
	
}
