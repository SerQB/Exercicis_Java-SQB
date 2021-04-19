package m3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Nivell1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fase1();
		fase2();
		fase3();
		fase4();

	}

	public static void fase1() {

		/*
		 * Crea sis variables tipu string buides. Demana per consola que s’introdueixin
		 * els noms. Introdueix els següents noms de ciutats (Barcelona, Madrid,
		 * Valencia, Malaga, Cadis, Santander) per teclat. Mostra per consola el nom de
		 * les 6 ciutats.
		 */

		System.out.println("\n" + "/////  FASE 1  /////" + "\n");

		String x1, x2, x3, x4, x5, x6;

		Scanner scan = new Scanner(System.in); // no me queda claro si hay que introducir desde usuario input o no, por
												// si acaso dejo el código...

		System.out.println("Introdueix els noms de les sis ciutats" + "\n");

		x1 = "Barcelona";// scan.nextLine(); // Read user input
		x2 = "Madrid"; // scan.nextLine();
		x3 = "València"; // scan.nextLine();
		x4 = "Màlaga"; // scan.nextLine();
		x5 = "Cadis"; // scan.nextLine();
		x6 = "Santander"; // scan.nextLine();

		System.out.println(
				"Les ciutats són: " + "\n" + x1 + "\n" + x2 + "\n" + x3 + "\n" + x4 + "\n" + x5 + "\n" + x6 + "\n");

	}

	public static void fase2() {

		/*
		 * Fase 2 Un cop tenim els noms de les ciutats guardats en variables haurem de
		 * pasar l’informacio a un array (arrayCiutats). Quan tinguem l’array ple,
		 * haurem de mostrar per consola el nom de les ciutats ordenadas per ordre
		 * alfabetic.
		 */

		System.out.println("\n" + "///// FASE 2 /////" + "\n");

		String x1, x2, x3, x4, x5, x6;

		x1 = "Barcelona";
		x2 = "Madrid";
		x3 = "València";
		x4 = "Màlaga";
		x5 = "Cadis";
		x6 = "Santander";

		// String ciutats[] = {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis",
		// "Santander" };

		ArrayList<String> ciutats = new ArrayList<String>();

		ciutats.add(x1);
		ciutats.add(x2);
		ciutats.add(x3);
		ciutats.add(x4);
		ciutats.add(x5);
		ciutats.add(x6);
		Collections.sort(ciutats);

		System.out.println("Les ciutats ordenades alfabèticament: " + "\n");
		for (String nom : ciutats) {
			System.out.println(nom);
		}

	}

	public static void fase3() {

		/*
		 * Fase 3 Cambieu les vocals “a” dels noms de les ciutats per el numero 4 i
		 * guardeu els noms modificats en un nou array(ArrayCiutatsModificades). Mostreu
		 * per consola l’array modificat i ordenat per ordre alfabetic
		 */

		System.out.println("\n" + "///// FASE 3 /////" + "\n");

		String x1, x2, x3, x4, x5, x6;

		x1 = "Barcelona";
		x2 = "Madrid";
		x3 = "València";
		x4 = "Malaga";
		x5 = "Cadis";
		x6 = "Santander";

		// String ciutats[] = {"Barcelona", "Madrid", "Valencia", "Malaga", "Cadis",
		// "Santander" };

		ArrayList<String> ciutats = new ArrayList<String>();

		ciutats.add(x1);
		ciutats.add(x2);
		ciutats.add(x3);
		ciutats.add(x4);
		ciutats.add(x5);
		ciutats.add(x6);
		Collections.sort(ciutats);

		ArrayList<String> ciutats_modi = new ArrayList<String>();

		for (int i = 0; i < ciutats.size(); i++) {
			String nom = ciutats.get(i);
			String z = nom.replace('a', '4');
			ciutats_modi.add(z);
		}
		System.out.println("Llista de ciutats modificades: " + "\n");

		for (String nom : ciutats_modi) {
			System.out.println(nom);
		}

	}

	public static void fase4() {

		/*- Fase 4
		Creeu un nou array per cada una de les ciutats que tenim. La mida dels nous arrays 
		sera la llargada de cada string ( string nomCiutat.Length).  
		Ompliu els nous arrays lletra per lletra. 
		Mostreu per consola els nous arrays amb els noms invertits (Ex: Barcelona - anolecraB). */

		System.out.println("\n" + "///// FASE 4 /////" + "\n");

		String x1, x2, x3, x4, x5, x6;

		x1 = "Barcelona";
		x2 = "Madrid";
		x3 = "València";
		x4 = "Malaga";
		x5 = "Cadis";
		x6 = "Santander";

		ArrayList<Character> z1 = new ArrayList<Character>();
		ArrayList<Character> z2 = new ArrayList<Character>();
		ArrayList<Character> z3 = new ArrayList<Character>();
		ArrayList<Character> z4 = new ArrayList<Character>();
		ArrayList<Character> z5 = new ArrayList<Character>();
		ArrayList<Character> z6 = new ArrayList<Character>();
		for (int i = 0; i < x1.length(); i++) {
			z1.add(x1.charAt(i));
		}
		for (int i = 0; i < x2.length(); i++) {
			z2.add(x2.charAt(i));
		}
		for (int i = 0; i < x3.length(); i++) {
			z3.add(x3.charAt(i));
		}
		for (int i = 0; i < x4.length(); i++) {
			z4.add(x4.charAt(i));
		}
		for (int i = 0; i < x5.length(); i++) {
			z5.add(x5.charAt(i));
		}
		for (int i = 0; i < x6.length(); i++) {
			z6.add(x6.charAt(i));
		}
		// System.out.println(z1);
		Collections.reverse(z1);
		Collections.reverse(z2);
		Collections.reverse(z3);
		Collections.reverse(z4);
		Collections.reverse(z5);
		Collections.reverse(z6);
		System.out.println(z1);
		System.out.println(z2);
		System.out.println(z3);
		System.out.println(z4);
		System.out.println(z5);
		System.out.println(z6);

	}

}
