package com.zensar.enums;

public class Access {
	public static void main(String[] args) {
		
		Days[] d=Days.values();
		for (Days days : d) {
			System.out.println(days.getVal());
		}
		
		
		Days d1=Days.valueOf("MON");
		System.out.println(d1);
		
		
	}

}
