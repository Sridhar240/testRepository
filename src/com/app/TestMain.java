package com.app;

public class TestMain {

	
	public static void main(String[] args) {
		
		
		Noarguments noarguments=new Noarguments();
		
		
		Noarguments noarguments2=new Noarguments(1, "kishore", "Viizag");
		
		noarguments2=new Noarguments(1, "Vzag");
		
		Noarguments noarguments3=new Noarguments(noarguments);
	}
	
}
