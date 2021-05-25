package nivell1;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class VehicleController {

	public VehicleController() {
		
	}
	
	public void createCar() throws Exception {
		
		Car mycar = null;
		int a = 0;	
		do {
			a = 0;
		String matricula = JOptionPane.showInputDialog(null ,"Quina és la matricula del cotxe?" );		
		
		String marc = JOptionPane.showInputDialog(null, "Quina és la marca del cotxe?" );
			
		String col = JOptionPane.showInputDialog(null , "Quin és el color del cotxe?");
		
		
		try {
			mycar = new Car( matricula, marc, col);
			mycar.dameDatos();
			a=0;
		} catch (Exception e) {
			
			//System.out.println("Introdueix valors correctes");
			System.out.println(e.getMessage());
			a = 1;
		}
		
		} while (a != 0);
		

		int b = 0;
		do {
			b = 0;
		try {
			String m1   = JOptionPane.showInputDialog(null ,"Quina és la marca de les rodes davanteres?" );
			Double d1   = Double.parseDouble(JOptionPane.showInputDialog(null ,"Quin és el diametre de les rodes davanteres?" ));
			
			Wheel F1 = new Wheel (m1, d1);
			Wheel F2 = new Wheel (m1, d1);
			List<Wheel> front = new ArrayList<Wheel>();
			front.add(F1);
			front.add(F2);
			
			String m2   = JOptionPane.showInputDialog(null ,"Quina és la marca de les rodes posteriors" );
			Double d2   = Double.parseDouble(JOptionPane.showInputDialog(null ,"Quin és el diametre de les rodes posteriors?" ));
			Wheel B1 = new Wheel (m2, d2);
			Wheel B2 = new Wheel (m2, d2);
			List<Wheel> back = new ArrayList<Wheel>();
			back.add(B1);
			back.add(B2);
			
			mycar.addWheels(front, back);
			
			mycar.dameDatosRuedas();
		
		} catch (NumberFormatException e) {
			System.out.println("El diametre s'ha d'expresar en números");
			b =1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			b =1;
		}
		
		} while( b != 0);
	}

	public void createBike() throws Exception {
		
		Bike mybike = null;
		int a = 0;	
		do {
			a = 0;
		String matricula = JOptionPane.showInputDialog(null ,"Quina és la matricula de la moto?" );		
		
		String marc = JOptionPane.showInputDialog(null, "Quina és la marca de la moto?" );
			
		String col = JOptionPane.showInputDialog(null , "Quin és el color de la moto?");
		
		
		try {
			mybike = new Bike( matricula, marc, col);
			mybike.dameDatos();
			a=0;
		} catch (Exception e) {
			
			//System.out.println("Introdueix valors correctes");
			System.out.println(e.getMessage());
			a = 1;
		}
		
		} while (a != 0);
		
	
		int b;
		do {
			 b = 0;
		try {
			String m1   = JOptionPane.showInputDialog(null ,"Quina és la marca de la roda davantera?" );
			Double d1   = Double.parseDouble(JOptionPane.showInputDialog(null ,"Quin és el diametre de la roda davantera?" ));
			
			Wheel F1 = new Wheel (m1, d1);
			
			String m2   = JOptionPane.showInputDialog(null ,"Quina és la marca de la roda posterior" );
			Double d2   = Double.parseDouble(JOptionPane.showInputDialog(null ,"Quin és el diametre de la roda posterior?" ));
			Wheel B1 = new Wheel (m2, d2);
			
			mybike.addWheels(F1, B1);
			
			mybike.dameDatosRuedas();
		
		} catch (NumberFormatException e) {
			System.out.println("El diametre s'ha d'expresar en números");
			b =1;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			b=1;
		}
		
		} while (b != 0);
		
	}

}







