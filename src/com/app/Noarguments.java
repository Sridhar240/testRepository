    package com.app;

public class Noarguments {

	
	private int id;
	private String name;
	private String city;
	
	
	public Noarguments() {
		System.out.println("zero orguments construtor");
		city="Hyderbad";
		
		
	}
	
	
	
	
	
	public Noarguments(Noarguments no) {
		
		this(5,"kshore","hyderabad");
		//this(5,"hyderbad");
		System.out.println("Copy construtor called");
		this.city=no.city;
		System.out.println("city are"+city);
		
		
	}
	
	
	public Noarguments(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
		
		
		System.out.println("my values are "+id+"   "+name+"  "+city);
	}
	
	

	public Noarguments(int id, String city) {
		this.id = id;
		this.city = city;
		
		
		System.out.println("my values are "+id+"  "+city);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
