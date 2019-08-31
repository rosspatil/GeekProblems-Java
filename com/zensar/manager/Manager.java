package com.zensar.manager;
import com.zensar.employee.Employee;


public class Manager extends Employee{
	private  double hra;
	private double others;
	public Manager(String name, int id, double salary, double hra, double others) {
		super(name, id, salary);
		this.hra = hra;
		this.others = others;
	}
	@Override
	public String toString() {
		return super.toString()+"Manager [hra=" + hra + ", others=" + others + "]";
	}
	
	@Override
	public void calSalary() {
		double total=super.getSalary()+hra+others+super.getDA();;
		System.out.println("Total Manager salary: "+total);
	}
}
