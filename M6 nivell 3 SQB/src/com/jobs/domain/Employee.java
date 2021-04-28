package com.jobs.domain;

public abstract class Employee {

	protected int id;
	protected String name;
	protected String address;
	protected String phone;
	protected double netTotalPaid=0;
	protected double brutSalaryPerMonth;
	protected double netTotalPaidYEAR=0;
	protected double brutSalaryPerYear;
	protected IPaymentRate paymentRate;	
	private static int COUNTER_MEMBERS = 1;

	public Employee(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		if (name.equals(""))
			throw new Exception();
		if (address.equals(""))
			throw new Exception();
		if (phone.equals(""))
			throw new Exception();
		if(brutSalaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();

		this.brutSalaryPerMonth=brutSalaryPerMonth;
		this.paymentRate=paymentRate;
		this.name = name;
		this.address = address;
		this.phone = phone;
		
		id = COUNTER_MEMBERS;
		COUNTER_MEMBERS++;
	}

	public abstract void pay() ;
	
	public abstract void payBonus() ;
	
	@Override
	public String toString() {
		return "Employee [salaryPerMonth Brut=" + brutSalaryPerMonth + ", id=" + id + ", name="
				+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + netTotalPaid   + "total net Year= "+ netTotalPaidYEAR   + "]";
	}
}

