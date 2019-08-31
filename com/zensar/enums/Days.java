package com.zensar.enums;

public enum Days {
	
	MON(1),TUE(2),WED(3),THRUS(4),FRI(5),SAT(6),SUN(7);
	
	int val;
	private Days(int val) {
		this.val=val;
	}
	public int getVal() {
		return val;
	}


}
