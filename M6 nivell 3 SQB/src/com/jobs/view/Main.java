package com.jobs.view;

import com.jobs.application.JobsController;

public class Main {

	
	
	private static JobsController controller=new JobsController();
	
	public static void main(String[] args) throws Exception {
		
		
		/////////////////////////                 LOS QUE FUNCIONAN               /////////////////////////////////////////////////
		
		try {
			controller.createBossEmployee("Pepe Boss", "Dirección molona", "666666666", 8000.0);
		} catch (Exception e) {	
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createManagerEmployee("Pedro Employee", "Dirección molona 2", "665226666", 3900.0);
		} catch (Exception e) {		
			System.out.println(e.getMessage());
		}
		
		
		try {
			controller.createEmployeeSenior("Laura Employee", "Dirección molona 3", "625266666", 3900.0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createEmployeeMid("Paco Mid", "Dirección molona 99", "625266666", 2550.0);
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		try {
			controller.createEmployeeJunior("Pedro Employee", "Dirección molona 2", "665266666", 1580.0);
		} catch (Exception e) {			
			System.out.println(e.getMessage());
		}
				
		try {
			controller.createVolunteer("Juan Volunteer", "Dirección molona 4", "614266666",789.0, "becario sin sueldo", 300);
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
		try {
			controller.createVolunteer("Juan Volunteer FALLA", "Dirección molona 4", "614266666",0, "becario sin sueldo", 400);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
				
		
		controller.payAllEmployeers();
		
		String allEmployees=controller.getAllEmployees();
		
		System.out.println( "\n" + "EMPLOYEES: "+ "\n" + allEmployees + " \n");
		
		controller.payBonus();
		
		String allEmployeesBonus=controller.getAllEmployees();
						
		
		System.out.println( "\n" + "EMPLOYEES CON BONUS APLICADO"+ "\n" + allEmployeesBonus + " \n");
		
	}

}
