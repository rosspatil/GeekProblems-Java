package com.zensar.threading;

public class FirstThread extends Thread{


	@Override
	public void run() {
		System.out.println("Name: "+Thread.currentThread().getName());

		MyThread myThread=new MyThread();
		myThread.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of Child Thread...");
	}

	public static void main(String[] args) {
		System.out.println("Name: "+Thread.currentThread().getName());

		new FirstThread().start();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("End of main thread...");

	}

	private class MyThread extends Thread{
		@Override
		public void run() {
			System.out.println("Inner class Thread..");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("Inner class Thread End....");
		}
	}
}
