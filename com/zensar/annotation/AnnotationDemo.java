package com.zensar.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Documented
@interface MyAnno{
	String name();
}


@MyAnno(name="Roshan")
public class AnnotationDemo {
	
	@MyAnno(name="Roshan")
	private int a;

	@MyAnno(name="Roshan")
	public AnnotationDemo() {

	}
	
	@MyAnno(name="Roshan")
	public void add() {

	}
}
