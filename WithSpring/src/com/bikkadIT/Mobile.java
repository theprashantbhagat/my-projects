package com.bikkadIT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Airtel airtel = context.getBean("Airtel",Airtel.class);
		airtel.calling();
		airtel.browse();
		
		Vodaphone vodaphone = context.getBean("voda",Vodaphone.class);
		vodaphone.calling();
		vodaphone.browse();
		
		Airtel a = context.getBean("sim", Airtel.class);
		a.calling();
		a.browse();

		Vodaphone v = context.getBean("sim1",Vodaphone.class);
		v.calling();
		v.browse();
	}

}
