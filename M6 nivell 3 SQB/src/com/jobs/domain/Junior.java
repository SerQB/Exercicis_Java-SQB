package com.jobs.domain;



	public class Junior extends Employee {

		
		public Junior(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate) throws Exception {
			super(name,address,phone,salaryPerMonth,paymentRate);
			
			if(salaryPerMonth<0) throw new Exception();
			if(paymentRate==null) throw new Exception();
			
					
			this.brutSalaryPerMonth=salaryPerMonth;
			this.paymentRate=paymentRate;
			
			netTotalPaid=paymentRate.pay(salaryPerMonth);
			netTotalPaidYEAR = netTotalPaid*14;
			if (netTotalPaid<900 || netTotalPaid>1600) throw new Exception("Junior:Ha de cobrar mes de 900 pero menys de 1600€");
		}
		
		@Override
		public void pay()  {
			netTotalPaid=paymentRate.pay(brutSalaryPerMonth);
			
		}
		
		@Override
		public String toString() {
			return "Employee Junior [salaryPerMonth=" + brutSalaryPerMonth + ", id=" + id + ", name="
					+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + netTotalPaid   + "total net Year= "+ netTotalPaidYEAR + "]";
		}

		@Override
		public void payBonus() {
			
			netTotalPaidYEAR= netTotalPaidYEAR*1.1;
		}
	
	}


