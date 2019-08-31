package com.zensar.exception;

public class PetrolTankEmpty extends Exception {
	private String message;
	
	public PetrolTankEmpty(String message) {
		this.message=message;
	}
	
	@Override
	public String getMessage() {

		return message;
	}

}
