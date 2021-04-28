package com.jobs.application;

import com.jobs.domain.IPaymentRate;
import com.jobs.domain.Volunteer;

public class PaymentFactory {

	
	public static IPaymentRate createPaymentRateBoss(){
		return new IPaymentRate() {	
			@Override
			public double pay(double brutSalaryPerMonth) {
				return (brutSalaryPerMonth*1.5)*0.68;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateManager(){
		return new IPaymentRate() {	
			@Override
			public double pay(double brutSalaryPerMonth) {
				return (brutSalaryPerMonth*1.1)*0.74;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateEmployeeSenior(){
		return new IPaymentRate() {
			@Override
			public double pay(double brutSalaryPerMonth) {
				return (brutSalaryPerMonth*0.95)*0.76;
			}
		};
	}
	public static IPaymentRate createPaymentRateEmployeeMid(){
		return new IPaymentRate() {
			@Override
			public double pay(double brutSalaryPerMonth) {
				
				return (brutSalaryPerMonth*0.90)*0.85;
			}
		};
	}
	public static IPaymentRate createPaymentRateEmployeeJunior(){
		return new IPaymentRate() {
			@Override
			public double pay(double brutSalaryPerMonth) {
				return (brutSalaryPerMonth*0.85)*0.98;
			}
		};
	}
	
	public static IPaymentRate createPaymentRateVolunteer(){
		return new IPaymentRate() {
			@Override
			public double pay(double brutSalaryPerMonth) {
				return brutSalaryPerMonth*0; // multiplicando por 0 aseguro que nunca cobre
			}
		};
	}
}
