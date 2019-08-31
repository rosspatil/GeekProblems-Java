package com.zensar.innerclasses;

public class Account {
	

	public void myMethod(){
	
		final int a=10;
		class MethodLocal{
			void print(){
				System.out.println(a);
				System.out.println("Method local class");
			}
			
		}
		
		MethodLocal mt=new MethodLocal();
		mt.print();
	}
	
	static class Locker{
		
	}
	
	public static void main(String[] args) {
		Account ac=new Account();
		ac.myMethod();
	}
}
