package com.zensar.threading;

public class SecondThread extends Thread {
	
	@Override
	public void run() {
		display();
	}
	public synchronized void display(){
		
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {

		SecondThread myThread=new SecondThread();
		SecondThread myThread1=new SecondThread();
		
		myThread.start();
		myThread1.start();
		
		
	}
	

}
