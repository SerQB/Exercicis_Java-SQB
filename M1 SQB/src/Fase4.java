
public class Fase4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String nom= "Sergi";
		String cognom1 = "Quirante";
		String cognom2 = "Barnadas";
		
		int dia = 10;
		int mes = 02;
		int any = 1989;
		
		String nomtot =  nom + " " + cognom1 + " " + cognom2;
		String datatot = dia + "/" + mes + "/" + any;
		
		System.out.println(" El meu nom �s  " + nomtot);
		System.out.println(" Vaig n�ixer el " + datatot);
		
		int x = 1989; // data naixament
		Boolean w;

		if ((x % 400) == 0) {
			w = true;
		} else if ((x % 4 == 0) && (x % 100 != 0)) {
			w = true;
		} else {
			w = false;
		}

		String q = " L'any  " + x + " �s un any de trasp�s";
		String n =" L'any "+ x + "  no �s un any de trasp�s";

		if (w == true) {
			System.out.println(q);
		} else if (w == false) {
			System.out.println(n);
		}
	}

}
