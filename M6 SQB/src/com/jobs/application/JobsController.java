package com.jobs.application;

import java.util.ArrayList;
import java.util.List;

import com.jobs.domain.AbsStaffMember;
import com.jobs.domain.Employee;
import com.jobs.domain.Volunteer;
import com.jobs.persistence.EmployeeRepository;

public class JobsController {

	private EmployeeRepository repository = new EmployeeRepository();
	
	public JobsController(){
		
	}
	
	public void createBossEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee boss = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateBoss());
		repository.addMember(boss);
	}
	
	public void createEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{		
		Employee employee = new Employee(name, address, phone,  salaryPerMonth, PaymentFactory.createPaymentRateEmployee());
		repository.addMember(employee);
	}

	public void createManagerEmployee(String name, String address, String phone, double salaryPerMonth) throws Exception{
		Employee manager = new Employee(name,address ,phone, salaryPerMonth, PaymentFactory.createPaymentRateManager());
		repository.addMember(manager);
		
	}


	public void payAllEmployeers() {
		List<AbsStaffMember> mem = new ArrayList<>(); 
		
		mem = repository.getAllMembers();
			
		for ( AbsStaffMember e : mem ){

			e.pay();
		}
	}

	public String getAllEmployees() {

		String lista = "";
		List<AbsStaffMember> mem = new ArrayList<>(); 
		
		mem = repository.getAllMembers();
			
		for ( AbsStaffMember e : mem ){

			lista += e + ".\n";
		}
		
		return lista;
	}

	//public void createVolunteer(String string, String string2, String string3) {
		
		
	//}
	
	public void createVolunteer(String name, String address, String phone, double salaryPerMonth , String description) throws Exception {
		Volunteer volunteer = new Volunteer(name, address, phone, description);
		repository.addMember(volunteer);			
	}		
		
	
}
