package com.jobs.domain;
public class Manager extends Employee{
	
	public Manager(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate ) throws Exception {
		super(name, address, phone, brutSalaryPerMonth, paymentRate);
		//if (salaryPerMonth<3000 || salaryPerMonth>5000) throw new Exception("Manager:Ha de cobrar més de 3000 però menys de 5000€");
		netTotalPaid=this.paymentRate.pay(this.brutSalaryPerMonth);
		netTotalPaidYEAR = netTotalPaid*14;
		if (netTotalPaid<3000 || netTotalPaid>5000) throw new Exception("Manager:Ha de cobrar més de 3000 però menys de 5000€");
	}
	
	
	@Override
	public void pay() {
		netTotalPaid=this.paymentRate.pay(this.brutSalaryPerMonth);
		
	}
	
	@Override
	public String toString() {
		return "Manager Employee [salaryPerMonth=" + brutSalaryPerMonth + ", id=" + id + ", name="
				+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + netTotalPaid   + "total net Year= "+ netTotalPaidYEAR + "]";
	}


	public void payBonus() {
		
		netTotalPaidYEAR= netTotalPaidYEAR*1.1;
	}
}
