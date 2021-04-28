package com.jobs.domain;

public class Senior extends Employee{

	public Senior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name,address,phone,salaryPerMonth,paymentRate);
		
		if(salaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
						
		this.salaryPerMonth=salaryPerMonth;
		this.paymentRate=paymentRate;
		totalPaid=paymentRate.pay(salaryPerMonth);
		if (totalPaid<2700 || totalPaid>4000) throw new Exception("Senior:Ha de cobrar més de 2700 pero menys de 4000€");
		
	}
	
	@Override
	public void pay()  {
		totalPaid=paymentRate.pay(salaryPerMonth);
		
	}
	
	@Override
	public String toString() {
		return "Employee Senior [salaryPerMonth=" + salaryPerMonth + ", id=" + id + ", name="
				+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid   + "]";
	}
}
