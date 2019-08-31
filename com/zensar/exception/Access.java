package com.zensar.exception;

public class Access {

	public static void main(String[] args) {

		String bikeStatus="Running";
		for (int i = 0; i < 2; i++) {


			if(bikeStatus.equals("Running")){
				for (int i1 = 0; i1 < 10; i1++) {
					System.out.println("Bike is  running........");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {}
				}
				bikeStatus="NotRunning";

			}else{
				try {
					throw new PetrolTankEmpty("Petrol tank become empty...\nplease fill it....");
				} catch (PetrolTankEmpty e) {
					System.out.println("Bike is  stop........");
					System.err.println(e.getMessage());
				}
			}
		}



	}

}
