package com.jobs.domain;

public class Senior extends Employee{

	public Senior(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
		super(name,address,phone,brutSalaryPerMonth,paymentRate);
		
		if(brutSalaryPerMonth<0) throw new Exception();
		if(paymentRate==null) throw new Exception();
						
		this.brutSalaryPerMonth=brutSalaryPerMonth;
		this.paymentRate=paymentRate;
		netTotalPaid=paymentRate.pay(brutSalaryPerMonth);
		netTotalPaidYEAR = netTotalPaid*14;
		if (netTotalPaid<2700 || netTotalPaid>4000) throw new Exception("Senior:Ha de cobrar més de 2700 pero menys de 4000€");
		
	}
	
	@Override
	public void pay()  {
		netTotalPaid=paymentRate.pay(brutSalaryPerMonth);
		
	}
	
	@Override
	public String toString() {
		return "Employee Senior [salaryPerMonthBrut=" + brutSalaryPerMonth + ", id=" + id + ", name="
				+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + netTotalPaid   + "total net Year= "+ netTotalPaidYEAR +"]";
	}

	public void payBonus() {
		
		netTotalPaidYEAR= netTotalPaidYEAR*1.1;
	}
}
