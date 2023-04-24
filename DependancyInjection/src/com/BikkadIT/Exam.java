package com.BikkadIT;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		Shop sh = context.getBean("shop", Shop.class);
		System.out.println(sh);
		
		System.out.println("======map=====");
		
		Map<String,String> pens = sh.getPens();
		Set<Entry<String, String>> e = pens.entrySet();
		
		Iterator<Entry<String, String>> itr = e.iterator();
		while(itr.hasNext()) {
			Entry<String,String> next = itr.next();
			System.out.println(next);
			
		}
		
	}
}
