package com.jobs.application;

import java.util.ArrayList;
import java.util.List;


import com.jobs.domain.Boss;
import com.jobs.domain.Employee;
import com.jobs.domain.Junior;
import com.jobs.domain.Manager;
import com.jobs.domain.Mid;
import com.jobs.domain.Senior;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Boss(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployeeJunior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee junior = new Junior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployeeJunior());
		repository.addMember(junior);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Manager(name,address ,phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}
	public void createVolunteer(String name, String address, String phone, double salaryPerMonth , String description, Integer ajuda) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, salaryPerMonth,PaymentFactory.createPaymentRateVolunteer(), description, ajuda);
		repository.addMember(volunteer);			
	}		
	public void createEmployeeSenior(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee senior = new Senior(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployeeSenior());
		repository.addMember(senior);
	}
	public void createEmployeeMid(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee mid = new Mid(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployeeMid());
		repository.addMember(mid);
	}

		
	


	public void payAllEmployeers()  {
		List<Employee> mem = new ArrayList<>(); 
		
		mem = repository.getAllMembers();
			
		for ( Employee e : mem ){

			 e.pay();
			
		}
	}
	
	public void payBonus()  {
		List<Employee> mem = new ArrayList<>(); 
		
		mem = repository.getAllMembers();
			
		for ( Employee e : mem ){
			
			 e.payBonus();
			
		}
	}
	

	public String getAllEmployees() {

		String lista = "";
		List<Employee> mem = new ArrayList<>(); 
		
		mem = repository.getAllMembers();
			
		for ( Employee e : mem ){

			lista += e + ".\n";
		}
		
		return lista;
	}

	
	
}
