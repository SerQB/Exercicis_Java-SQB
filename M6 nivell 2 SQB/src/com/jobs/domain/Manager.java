package com.jobs.domain;
public class Manager extends Employee{
	
	public Manager(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);
		//if (salaryPerMonth<3000 || salaryPerMonth>5000) throw new Exception("Manager:Ha de cobrar més de 3000 però menys de 5000€");
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
		if (totalPaid<3000 || totalPaid>5000) throw new Exception("Manager:Ha de cobrar més de 3000 però menys de 5000€");
	}
	
	
	@Override
	public void pay() {
		totalPaid=this.paymentRate.pay(this.salaryPerMonth);
		
	}
	
	@Override
	public String toString() {
		return "Manager Employee [salaryPerMonth=" + salaryPerMonth + ", id=" + id + ", name="
				+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid   + "]";
	}
}
