package nivell1;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {

	protected String plate;
	protected String brand;
	protected String color;
	protected List<Wheel> wheels = new ArrayList<Wheel>();

	public Vehicle(String plate, String brand, String color) throws Exception {
		
		
	
			if (plate.length() > 7) throw new Exception ("La matr�cula no pot tenir m�s de 7 car�cters");
			if (plate.length() < 5 ) throw new Exception ("La matr�cula no pot tenir menys de 5 car�cters");
			 int x = 0; // numeros en la plate
			 int z = 0; // letras en la plate
			 for(int i=0; i < plate.length(); i++) {
				 Boolean d = Character.isDigit(plate.charAt(i));
				
				 if(d) {		           
			             x += 1;
			             if (x > 4) throw new Exception ("No pot tenir m�s de 4 n�meros");
			             
			         }
			         else {		           
			            z += 1;
			            if ( z>3) throw new Exception ( "No pot tenir m�s de tres lletres");
			         }
			      }
		
		 
		
		this.plate = plate;
		
		this.brand = brand;
		this.color = color;
	}
	
	public void dameDatos(){
		System.out.println( " El vehicle t� la matricula: " + plate + "\n"  + " �s de la marca : " + brand + "\n" +
				" I �s de color:  " + color);
	}
	public void dameDatosRuedas() {
		System.out.println( "  - Informaci� del pneumatics del vehicle:   ");
		for(Wheel e : wheels) {			
	            System.out.println( "Marca de pneum�tic:  " +  e.getBrand());
	            System.out.println("Diametre del pneum�tic:  " + e.getDiameter());
	        }
	
	}	
	
}
