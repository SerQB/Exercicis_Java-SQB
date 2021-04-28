package com.jobs.domain;

public class Volunteer extends Employee {
	
	protected String description;
	protected  Integer ajuda;
	public Volunteer(String name, String address, String phone, double salaryPerMonth, IPaymentRate paymentRate, String description, Integer ajuda) throws Exception {
		super(name, address, phone, salaryPerMonth, paymentRate);

		this.description = description;
		this.brutSalaryPerMonth=salaryPerMonth;
        //if (salaryPerMonth>0) throw new Exception("Volunteer no cobra");
        if (netTotalPaid>0) throw new Exception("Volunteer no cobra");        
		this.ajuda = ajuda;
		if (ajuda>300) throw new Exception("L'ajuda no pot superar 300 euros");
		
		
	}
	
	public  Integer getAjuda() {
		return ajuda;
		
		
	}

	
	
	@Override
	public void pay() {
		super.netTotalPaid = 0;
		
	}



	@Override
	public String toString() {
		return "Volunteer [ id=" + id + ", name=" + name + ", address=" + address
				+ ", phone=" + phone + ",  description=  " + description +  ",  ajuda ="  + ajuda + " , total paid=  " + netTotalPaid  +"total net Year= "+ netTotalPaidYEAR +"]";
	}

	
	@Override
	public void payBonus() {
			
			netTotalPaidYEAR= netTotalPaidYEAR*0;
		}
	
	
	

}
