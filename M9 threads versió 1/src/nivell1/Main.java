package nivell1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ArrayList<Propulsor> p1 = new ArrayList<Propulsor>();  
		//p1.add(new Propulsor("1",10));
		//p1.add(new Propulsor("2",30));
		//p1.add(new Propulsor("3",80));		
		Cohete r1 = new Cohete("32WESSDS");
		r1.addPropulsor(new Propulsor("1",10));
		r1.addPropulsor(new Propulsor("2",30));
		r1.addPropulsor(new Propulsor("3",80));
			
		//ArrayList<Propulsor> p2 = new ArrayList<Propulsor>();  		
		//p2.add(new Propulsor("1",30));
		//p2.add(new Propulsor("2",40));
		//p2.add(new Propulsor("3",50));		
		//p2.add(new Propulsor("4",50));		
		//p2.add(new Propulsor("5",30));		
		//p2.add(new Propulsor("6",10));		
		Cohete r2 = new Cohete("LDSFJA32");
		r2.addPropulsor(new Propulsor("1",30));
		r2.addPropulsor(new Propulsor("2",40));
		r2.addPropulsor(new Propulsor("3",50));
		r2.addPropulsor(new Propulsor("4",50));
		r2.addPropulsor(new Propulsor("5",30));
		r2.addPropulsor(new Propulsor("6",10));
		
		System.out.println(r1);
		System.out.println(r2);
		r1.iniciar();
		r2.iniciar();
		while(true) {
			int obj=sc.nextInt();
			r1.setObjetivo(obj);
			r2.setObjetivo(obj);	
		}
	}

}