package nivell1;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		
		
	
			if (plate.length() > 7) throw new Exception ("La matrícula no pot tenir més de 7 caràcters");
			if (plate.length() < 5 ) throw new Exception ("La matrícula no pot tenir menys de 5 caràcters");
			 int x = 0; // numeros en la plate
			 int z = 0; // letras en la plate
			 for(int i=0; i < plate.length(); i++) {
				 Boolean d = Character.isDigit(plate.charAt(i));
				
				 if(d) {		           
			             x += 1;
			             if (x > 4) throw new Exception ("No pot tenir més de 4 números");
			             
			         }
			         else {		           
			            z += 1;
			            if ( z>3) throw new Exception ( "No pot tenir més de tres lletres");
			         }
			      }
		
		 
		
		this.plate = plate;
		
		this.brand = brand;
		this.color = color;
	}
	
	public void dameDatos(){
		System.out.println( " El vehicle té la matricula: " + plate + "\n"  + " És de la marca : " + brand + "\n" +
				" I és de color:  " + color);
	}
	public void dameDatosRuedas() {
		System.out.println( "  - Informació del pneumatics del vehicle:   ");
		for(Wheel e : wheels) {			
	            System.out.println( "Marca de pneumàtic:  " +  e.getBrand());
	            System.out.println("Diametre del pneumàtic:  " + e.getDiameter());
	        }
	
	}	
	
}
