package com.jobs.domain;
	
		public class Boss extends Employee{
			
			public Boss(String name, String address, String phone, double salaryPerMonth,IPaymentRate paymentRate ) throws Exception {
				super(name, address, phone, salaryPerMonth, paymentRate);
				//if (salaryPerMonth<8000) throw new Exception("Boss:Ha de cobrar més de 8000€");
				netTotalPaid=this.paymentRate.pay(this.brutSalaryPerMonth);
				netTotalPaidYEAR = netTotalPaid*14;
				if (netTotalPaid<8000) throw new Exception("Boss:Ha de cobrar més de 8000€");
			}
			
			
			@Override
			public void pay()  {
				netTotalPaid=this.paymentRate.pay(this.brutSalaryPerMonth);
				
			}
			@Override
			public void payBonus() {
				netTotalPaidYEAR= netTotalPaidYEAR*1.1;
			}
			
			@Override
			public String toString() {
				return "Boss Employee [salaryPerMonth Brut=" + brutSalaryPerMonth + ", id=" + id + ", name="
						+ name + ", address=" + address + ", phone=" + phone + ", totalPaid=" + netTotalPaid   + "total net Year= "+ netTotalPaidYEAR +"]";
			}
	}
		
		


