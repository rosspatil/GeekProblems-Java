package com.zensar.employee;

public class Employee  {
	private String name;
	private int id;
	private double salary;
	final int DA=20000;

	public Employee(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary
				+ ", da=" + DA + "]";
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	};

	public int getDA() {
		return DA;
	}

	protected void calSalary(){
		double total=salary+DA;
		System.out.println("Total Employee salary: "+total);
	}

}
