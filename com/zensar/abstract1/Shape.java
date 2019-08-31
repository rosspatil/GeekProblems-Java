package com.zensar.abstract1;

public abstract class Shape implements CalculateArea{
	
	public Shape(){
		
	}
	
	public abstract void area();
	
	public void display(){
		System.out.println("Hello...");
	}
	

}
