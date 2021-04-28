package com.jobs.domain;

public class Volunteer extends Employee {
	
	protected String description;
	public Volunteer(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate, String description) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);

		this.description = description;
		this.salaryPerMonth=salaryPerMonth;
        //if (salaryPerMonth>0) throw new Exception("Volunteer no cobra");
        if (totalPaid>0) throw new Exception("Volunteer no cobra");
		
		
		
	}

	
	
	@Override
	public void pay() {
		super.totalPaid = 0;
		
	}



	@Override
	public String toString() {
		return "Volunteer [ id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ",  description=  " + description + ", total paid=  " + totalPaid  +"]";
	}
	
	

}
