package com.jobs.domain;

public class Mid extends Employee {

	
		public Mid(String name, String address, String phone, double brutSalaryPerMonth,IPaymentRate paymentRate) throws Exception {
			super(name,address,phone,brutSalaryPerMonth,paymentRate);
			
			if(brutSalaryPerMonth<0) throw new Exception();
			if(paymentRate==null) throw new Exception();
								
			this.brutSalaryPerMonth=brutSalaryPerMonth;
			this.paymentRate=paymentRate;
			netTotalPaid=paymentRate.pay(brutSalaryPerMonth);
			netTotalPaidYEAR = netTotalPaid*14;
			if (netTotalPaid<1800 || netTotalPaid>2500) throw new Exception("Mid:Ha de cobrar més de 1800 pero menys de 2500€");
		}
		
		@Override
		public void pay() {
			netTotalPaid=paymentRate.pay(brutSalaryPerMonth);
			
		}
		
		@Override
		public String toString() {
			return "Employee Mid [salaryPerMonth=" + brutSalaryPerMonth + ", id=" + id + ", name="
					+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + netTotalPaid   +"total net Year= "+ netTotalPaidYEAR + "]";
		}

		public void payBonus() {
			
			netTotalPaidYEAR= netTotalPaidYEAR*1.1;
		}
	
	}


