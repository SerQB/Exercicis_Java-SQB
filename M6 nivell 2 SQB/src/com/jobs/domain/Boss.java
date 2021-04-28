package com.jobs.domain;
	
		public class Boss extends Employee{
			
			public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
				super(name, address, phone, salaryPerMonth, paymentRate);
				//if (salaryPerMonth<8000) throw new Exception("Boss:Ha de cobrar més de 8000€");
				totalPaid=this.paymentRate.pay(this.salaryPerMonth);
				if (totalPaid<8000) throw new Exception("Boss:Ha de cobrar més de 8000€");
			}
			
			
			@Override
			public void pay()  {
				totalPaid=this.paymentRate.pay(this.salaryPerMonth);
				
			}
			
			@Override
			public String toString() {
				return "Boss Employee [salaryPerMonth=" + salaryPerMonth + ", id=" + id + ", name="
						+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + totalPaid   + "]";
			}
	}
		
		


