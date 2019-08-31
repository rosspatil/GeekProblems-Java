package com.zensar.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter two numbers: ");
		try{
			int res=sc.nextInt()/sc.nextInt();
			System.out.println("Result: "+res);
		}catch(ArithmeticException e){
			System.err.println("Exception caught");
			System.err.println(e.getMessage());
		}catch (InputMismatchException e) {
			System.err.println(e.getMessage());
		}finally{
			System.out.println("Finally............");
		}


	}

}
