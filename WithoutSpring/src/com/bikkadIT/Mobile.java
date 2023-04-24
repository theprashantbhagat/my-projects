package com.bikkadIT;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Mobile {
	
	public static void main(String[] args) {
		
		Airtel ar=new Airtel();
		ar.calling();
		ar.browse();
		
		Vodaphone vd=new Vodaphone();
		vd.calling();
		vd.browse();
		
		Sim sim=new Airtel();
		sim.calling();
		sim.browse();
		
		Sim sim1=new Vodaphone();
		sim1.calling();
		sim1.browse();
	}

}
