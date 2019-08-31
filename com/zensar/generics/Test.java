package com.zensar.generics;

import java.io.IOException;

class A{
	public A() throws IOException {
		// TODO Auto-generated constructor stub
	}
}

class Test extends A{
	
 	public Test() throws Exception {
		// TODO Auto-generated constructor stub
	}

	public enum Dogs {collie, harrier, shepherd};
	public static void main(String [] args) {
		Dogs myDog = Dogs.shepherd;
		switch (myDog) {
		case collie:
			System.out.print("collie ");
		default:
			System.out.print("retriever ");
		case harrier:
			System.out.print("harrier ");
		}
	}
}
