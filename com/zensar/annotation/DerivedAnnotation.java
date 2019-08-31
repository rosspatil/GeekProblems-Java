package com.zensar.annotation;

public class DerivedAnnotation  extends AnnotationDemo{

	public static void main(String[] args) {
		DerivedAnnotation da=new DerivedAnnotation();
		
		
		System.out.println(da.getClass().getAnnotation(MyAnno.class));
		
	}
}
