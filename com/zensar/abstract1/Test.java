package com.zensar.abstract1;

public class Test {

	public static boolean check(String str) {
		String test1 = "abcdefghijklmnopqrstuvwxyz";
		if (test1.contains(str.toLowerCase())) {
			return false;
		} else {
			return true;
		}
	}

	public static void main(String[] args) {

		/*
		 * int i=0; for (String string : args) { if(! string.contains(".")){ if(
		 * check(String.valueOf(string.charAt(0)))){
		 * i+=Integer.parseInt(string); } } } System.out.println(i);
		 */
		float total = 0;
		for (int i = 0; i < args.length; i++) {

			try {
				float res = Float.parseFloat(args[i]);
				total = total + res;
			} catch (Exception e) {
			}

		}
		System.out.println("total=" + total);

		/*
		 * 
		 * CalculateArea cl=new CalculateArea() {
		 * 
		 * @Override public void area() {
		 * System.out.println("Annonymous inner class1");
		 * 
		 * } };
		 * 
		 * CalculateArea cl1=new CalculateArea() {
		 * 
		 * @Override public void area() {
		 * System.out.println("Annonymous inner class2");
		 * 
		 * } };
		 * 
		 * cl.area();
		 */
	}

}
