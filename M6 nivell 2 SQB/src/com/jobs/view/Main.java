package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		
		/////////////////////////                 LOS QUE FUNCIONAN               /////////////////////////////////////////////////
		
		try {
			controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 7000.0);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 3500.0);
		} catch (Exception e) {		
			System.out.println(e.getMessage());
		}
		
		
		try {
			controller.createEmployeeSenior("Laura Employee", "Dirección molona 3", "625266666", 3000.0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createEmployeeMid("Paco Mid", "Dirección molona 99", "625266666", 2050.0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createEmployeeJunior("Pedro Employee", "Dirección molona 2", "665266666", 1080.0);
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
				
		try {
			controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666",789.0, "becario sin sueldo");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		////////////////////////////////       LOS QUE NO FUNCIONAN     /////////////////////////////////
		
		try {
			controller.createEmployeeSenior("Laura FALLA", "Dirección molona 3", "625266666", 1000.0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createEmployeeMid("Paco FALLA", "Dirección molona 99", "625266666", 20050.0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createEmployeeJunior("Pedro FALLA", "Dirección molona 2", "665266666", 500.0);
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
				
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println( "\n" + "EMPLOYEES: "+ "\n" + allEmployees + " \n");
		
	}

}
