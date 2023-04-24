package com.bikkadIT;

public class Vodaphone implements Sim {

	
	public Vodaphone() {
		
		System.out.println("vodaphone constructor");
	}

	@Override
	public void calling() {
		// TODO Auto-generated method stub
		System.out.println("Calling via Vodaphone");
		
	}

	@Override
	public void browse() {
		// TODO Auto-generated method stub
		System.out.println("browsing via vodaphone");
		
	}

}
