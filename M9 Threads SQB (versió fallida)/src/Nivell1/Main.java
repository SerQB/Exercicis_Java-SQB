package Nivell1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scInt = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		int option = 1;

		// Fase 1
		Cohete cohete1 = new Cohete("32WESSDS");
		// cohete1.setNumeroPropulsores(3);
		Cohete cohete2 = new Cohete("LDSFJA32");
		// cohete2.setNumeroPropulsores(6);

		// System.out.println( "El cohete 1 con id " + cohete1.getId() + " tiene" +
		// cohete1.getNumeroPropulsores() + "propulsores");
		// System.out.println( "El cohete 2 con id " + cohete2.getId() + " tiene" +
		// cohete2.getNumeroPropulsores() + "propulsores");
		// Fase 1 deja de funcionar porque el getNumPropulsores retorna el size() de la
		// list que aun no se ha definido...

		// Fase 2
		Propulsor p1_c1 = new Propulsor(1, 10, cohete1);
		Propulsor p2_c1 = new Propulsor(2, 30, cohete1);
		Propulsor p3_c1 = new Propulsor(3, 80, cohete1);

		// Propulsores del cohete 2:
		Propulsor p1_c2 = new Propulsor(1, 30, cohete2);
		Propulsor p2_c2 = new Propulsor(2, 40, cohete2);
		Propulsor p3_c2 = new Propulsor(3, 50, cohete2);
		Propulsor p4_c2 = new Propulsor(4, 50, cohete2);
		Propulsor p5_c2 = new Propulsor(5, 30, cohete2);
		Propulsor p6_c2 = new Propulsor(6, 10, cohete2);

		List<Propulsor> propulsoresCohete1 = new ArrayList<>();
		propulsoresCohete1.add(p1_c1);
		propulsoresCohete1.add(p2_c1);
		propulsoresCohete1.add(p3_c1);

		List<Propulsor> propulsoresCohete2 = new ArrayList<>();
		propulsoresCohete2.add(p1_c2);
		propulsoresCohete2.add(p2_c2);
		propulsoresCohete2.add(p3_c2);
		propulsoresCohete2.add(p4_c2);
		propulsoresCohete2.add(p5_c2);
		propulsoresCohete2.add(p6_c2);

		// Equipo los propulsores a sus cohetes:
		cohete1.setPropulsores(propulsoresCohete1);
		cohete2.setPropulsores(propulsoresCohete2);

		System.out.println("El cohete 1 con id  " + cohete1.getId() + " tiene  " + cohete1.getNumeroPropulsores()
				+ "  propulsores" + " con las siguientes potencias máximas : " + cohete1.getPropulsores());

		System.out.println("El cohete 2 con id  " + cohete2.getId() + " tiene  " + cohete2.getNumeroPropulsores()
				+ "  propulsores" + " con las siguientes potencias máximas : " + cohete2.getPropulsores());

		
		do {
		System.out.println("Que potencia quieres alcanzar con el primer cohete? (máxima 120)");
		cohete1.setPotenciaObjetivo(scInt.nextInt());
		scInt.nextLine();
		
		System.out.print("Que potencia quieres alcanzar con el segundo cohete? (máxima 210)");
		cohete2.setPotenciaObjetivo(scInt.nextInt());
		scInt.nextLine();
		

		if (cohete1.getPotenciaActualTotal() < cohete1.getPotenciaObjetivo()) {

			cohete1.acelerar();
		
		} else if (cohete1.getPotenciaActualTotal() > cohete1.getPotenciaObjetivo())	{
			
			cohete1.frenar();

		} else if (cohete1.getPotenciaActualTotal() == cohete1.getPotenciaObjetivo()) {

			cohete1.detener();

			//System.out.println("Saliendo");
			//System.exit(0);
		}

		if (cohete2.getPotenciaActualTotal() < cohete2.getPotenciaObjetivo()) {

			cohete2.acelerar();
			
		} else if (cohete2.getPotenciaActualTotal() > cohete2.getPotenciaObjetivo())	{
			
			cohete2.frenar();

		} else if (cohete2.getPotenciaActualTotal() == cohete2.getPotenciaObjetivo()) {

			cohete2.detener();
			//System.out.println("Saliendo");
			//System.exit(0);
		} 
		
		System.out.println("Quieres establecer una nueva potencia?   1 = Si    0 = No");
		option = sc.nextInt();

		/*
		 * //System.out.
		 * println("Que quieres hacer con el cohete: \n1. Acelerar\n2. Frenar\n3. Salir"
		 * ); //eleccion = sc.nextInt(); //sc.nextLine(); if(eleccion==1) {
		 * cohete1.acelerar(); cohete2.acelerar(); }else if(eleccion==2){
		 * cohete1.frenar(); cohete2.frenar(); }else { try { cohete1.wait();
		 * cohete2.wait(); } catch (InterruptedException e) { e.printStackTrace(); }
		 * System.out.println("Saliendo"); System.exit(0); } }
		 */
		// sc.close();
	} while (option == 1 );

}
}

