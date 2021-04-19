package nivell_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Nivell_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fase1();
		// fase2();
		fase3();

	}

	public static void fase1() {

		/*
		 * - Fase 1 L’exercici consisteix a mostrar per consola una carta d’un
		 * restaurant on afegirem diferents plats i després escollirem que volem per
		 * menjar. Un cop fet això s’haurà de calcular el preu del menjar el programa
		 * ens dirà amb quins bitllets hem de pagar.
		 * 
		 * Creeu una variable int per cada un dels bitllets que existeixen des de 5€ a
		 * 500€, haureu de crear un altre variable per guardar el preu total del menjar.
		 * 
		 * Creeu dos arrays, un on guardarem el menú i un altre on guardarem el preu de
		 * cada plat.
		 */

		System.out.println("\n" + "/////  FASE 1  /////" + "\n");

		int bill5 = 5;
		int bill10 = 10;
		int bill20 = 20;
		int bill50 = 50;
		int bill100 = 100;
		int bill200 = 200;
		int bill500 = 500;

		int preutotal;

		String[] plats = new String[10];

		Integer[] preuplat = new Integer[10];

	}

	public static void fase2() {

		/*
		 * Fase 2 Amb un bucle for haurem d’omplir els dos arrays anteriorment creats.
		 * Afegirem el nom del plat i després el preu. Pots fer us de diccionaris de
		 * dades(Java HasMap).
		 * 
		 * Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per
		 * menjar, guardarem la informació en una List fent servir un bucle while.
		 * 
		 * Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el
		 * sistema (1:Si / 0:No), per tant haureu de crear un altre variable int per
		 * guardar la informació.
		 */

		System.out.println("\n" + "/////  FASE 2  /////" + "\n");

		int bill5 = 5;
		int bill10 = 10;
		int bill20 = 20;
		int bill50 = 50;
		int bill100 = 100;
		int bill200 = 200;
		int bill500 = 500;

		int preutotal;

		String[] plats = new String[10];

		Integer[] preuplat = new Integer[10];

		HashMap<String, Integer> menu = new HashMap<String, Integer>();

		menu.put("Arròs amb conill", 12);
		menu.put("Arròs amb pollastre", 12);
		menu.put("Arròs amb bogavante", 24);
		menu.put("Arròs amb marisc", 18);
		menu.put("Arròs negre", 16);
		menu.put("Arròs caldós", 20);
		menu.put("Rissoto de ceps", 14);
		menu.put("Rissoto de verdures", 13);
		menu.put("Arròs tres delicies", 10);
		menu.put("Arròs a la cubana", 8);

		int i = 0;

		for (Map.Entry<String, Integer> entry : menu.entrySet()) {

			plats[i] = entry.getKey();
			preuplat[i] = entry.getValue();
			i++;
		}

		for (int j = 0; j < (preuplat.length); j++) {

			System.out.println("Plat " + j + ": " + plats[j] + "    Preu: " + preuplat[j] + " euros");
		}

		int seguir = 1;
		int opcio; // int per seleccionar plat
		Scanner reader = new Scanner(System.in);
		ArrayList<String> menux = new ArrayList<String>();

		while (seguir == 1) {

			System.out.println("\n" + "Indica el número del plat que vols demanar: ");

			opcio = reader.nextInt();
			menux.add(plats[opcio]);
			System.out.println("Vols seguir demanant?" + "\n" + "Si --> 1" + "\n" + "No --> 0");
			seguir = reader.nextInt();
		}

	}

	public static void fase3() {

		System.out.println("\n" + "/////  FASE 3  /////" + "\n");

		/*
		 * Fase 3
		 * 
		 * Un cop hem acabat de demanar el menjar, haurem de comparar la llista amb
		 * l’array que hem fet al principi. En el cas que la informació que hem
		 * introduït a la List coincideixi amb la del array, haurem de sumar el preu del
		 * producte demanat; en el cas contrari haurem de mostrar un missatge que digui
		 * que el producte que hem demanat no existeix. Recomanacions: has de validar
		 * que les dades introduïdes per consola compleixen els requeriments de format i
		 * extensió per mitjà del control d'excepcions de Java.
		 */

		int bill5 = 5;
		int bill10 = 10;
		int bill20 = 20;
		int bill50 = 50;
		int bill100 = 100;
		int bill200 = 200;
		int bill500 = 500;

		int preutotal = 0;

		String[] plats = new String[10]; // array dels plats

		Integer[] preuplat = new Integer[10]; // array del preu dles plats

		HashMap<String, Integer> menu = new HashMap<String, Integer>(); // crea hashmap on posem la info del menú

		menu.put("Arròs amb conill", 12);
		menu.put("Arròs amb pollastre", 12);
		menu.put("Arròs amb bogavante", 24);
		menu.put("Arròs amb marisc", 18);
		menu.put("Arròs negre", 16);
		menu.put("Arròs caldós", 20);
		menu.put("Rissoto de ceps", 14);
		menu.put("Rissoto de verdures", 13);
		menu.put("Arròs tres delicies", 10);
		menu.put("Arròs a la cubana", 8);

		int i = 0;

		for (Map.Entry<String, Integer> entry : menu.entrySet()) { // bucle para rellenar el array referenciando el
																	// hashmap

			plats[i] = entry.getKey();
			preuplat[i] = entry.getValue();
			i++;
		}

		for (int j = 0; j < (preuplat.length); j++) { // bucle per mostrar els dos arrays amb els seus index perque el
														// client pugui demanar

			System.out.println("Plat " + j + ": " + plats[j] + "    Preu: " + preuplat[j] + " euros");
		}

		int seguir = 1;
		int opcio;
		Scanner reader = new Scanner(System.in);
		ArrayList<String> menux = new ArrayList<String>();

		while (seguir == 1) { // mientras no decidamos dejar de pedir el bucle seguirà

			System.out.println("\n" + "Indica el número del plat que vols demanar: ");

			opcio = reader.nextInt();
			try {
				menux.add(plats[opcio]); // control de error por si introducimos plato "outOfBounds" del array
			} catch (Exception e) {
				System.out.println(
						"\n" + "El número de plat seleccionat no existeix, siusplau selecciona un de vàlid" + "\n");
			}
			System.out.println("Vols seguir demanant?" + "\n" + "Si --> 1" + "\n" + "No --> 0");
			seguir = reader.nextInt(); // decidimos si seguimos o salimos del bucle
		}

		System.out.println("La teva comanda és la següent: " + "\n");
		int j = 0, z = 0; // j =contador list menu, z=contador array
		while (j < menux.size()) { // bucle para comparar información de lista comanda i array inicial

			if (menux.get(j).equals(plats[z])) {

				preutotal += preuplat[z]; // si hay match suma al precio
				System.out.println("Plat:" + plats[z] + "   Preu: " + preuplat[z] + "  euros");
				j++; // incrementa el contador del menu porque hemos añadido un plato
				z = 0; // reestablece el contador del array a 0 para que se recorra entero de nuevo en
						// el siguiente plato

			} else if (menux.get(j) != plats[z]) { // si no hay match incrementa el contador array
													// y vuelve a hacer loop sin incrementar el list (j)
				z++;

			}

		}

		System.out.println("\n" + "Preu total:   " + preutotal + "  euros");

	}

}
