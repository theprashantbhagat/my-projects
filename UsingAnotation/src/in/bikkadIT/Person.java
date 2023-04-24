package in.bikkadIT;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Person {

	public Person() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Person class constructor called");
	}
	
	public void info() {
		System.out.println("person info method called");
	}

	
}
