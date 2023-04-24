package com.bikkadIT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.bikkadIT.Person;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext a=new AnnotationConfigApplicationContext(javaconfig.class);
		Student bean = a.getBean("student",Student.class);
		bean.Display();
		
		Employee bean2 = a.getBean("getE", Employee.class);
		bean2.show();
		
		Person bean3 = a.getBean("person", Person.class);
		bean3.info();
		System.out.println(a.isSingleton("person"));
		
		
	}
}
