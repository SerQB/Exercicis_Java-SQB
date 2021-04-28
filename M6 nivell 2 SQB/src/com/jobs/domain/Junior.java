package com.jobs.domain;



	public class Junior extends Employee {

		
		public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
			super(name,address,phone,salaryPerMonth,paymentRate);
			
			if(salaryPerMonth<0) throw new Exception();
			if(paymentRate==null) throw new Exception();
			
					
			this.salaryPerMonth=salaryPerMonth;
			this.paymentRate=paymentRate;
			
			totalPaid=paymentRate.pay(salaryPerMonth);
			if (totalPaid<900 || totalPaid>1600) throw new Exception("Junior:Ha de cobrar mes de 900 pero menys de 1600€");
		}
		
		@Override
		public void pay()  {
			totalPaid=paymentRate.pay(salaryPerMonth);
			
		}
		
		@Override
		public String toString() {
			return "Employee Junior [salaryPerMonth=" + salaryPerMonth + ", id=" + id + ", name="
					+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid   + "]";
		}
	
	}


