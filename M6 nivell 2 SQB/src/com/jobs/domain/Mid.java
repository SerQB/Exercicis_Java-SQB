package com.jobs.domain;

public class Mid extends Employee {

	
		public Mid(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
			super(name,address,phone,salaryPerMonth,paymentRate);
			
			if(salaryPerMonth<0) throw new Exception();
			if(paymentRate==null) throw new Exception();
								
			this.salaryPerMonth=salaryPerMonth;
			this.paymentRate=paymentRate;
			totalPaid=paymentRate.pay(salaryPerMonth);
			if (totalPaid<1800 || totalPaid>2500) throw new Exception("Mid:Ha de cobrar més de 1800 pero menys de 2500€");
		}
		
		@Override
		public void pay() {
			totalPaid=paymentRate.pay(salaryPerMonth);
			
		}
		
		@Override
		public String toString() {
			return "Employee Mid [salaryPerMonth=" + salaryPerMonth + ", id=" + id + ", name="
					+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid   + "]";
		}
	
	}


