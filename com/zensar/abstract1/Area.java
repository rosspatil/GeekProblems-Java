package com.zensar.abstract1;

public class Area {
	public static void main(String[] args) {
		Shape shape=new Rectangle();		
		shape.area();
		
		
		Shape shape1=new Circle();
		shape1.area();
		
		shape.display();
		shape1.display();
		
		
	}

}
