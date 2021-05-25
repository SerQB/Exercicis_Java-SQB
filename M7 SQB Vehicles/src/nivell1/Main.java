package nivell1;

import javax.swing.JOptionPane;

public class Main {

	private static VehicleController controller = new VehicleController();

	public static void main(String[] args) throws Exception {
		
		int q = 0;
		do {
		String opcio = JOptionPane.showInputDialog(null,
				" Que vols crear? : " + "\n" + "a ---> Cotxe" + "\n" + "b ---> Moto");

		switch (opcio) {

		case "a":
			controller.createCar();
			break;

		case "b":
			controller.createBike();
			break;
			
		default:
			System.out.println("Introdueix una opció correcte");
			q =1;
		}

		} while (q != 0);
		
	}	

}
