package m3;

import java.util.ArrayList;
import java.util.HashMap;

public class Nivell1 {

	public static void main(String[] args) {

		fase1();
		fase2();
		fase3();
		fase4();

	}

	public static void fase1() {

		System.out.println(" ///   FASE 1 /// " + "\n");

		char nom[] = { 's', 'e', 'r', 'g', 'i' };

		for (int i = 0; i < (nom.length); i++) {

			System.out.print(nom[i] + " ");

		}

		System.out.println("\n");
	}

	public static void fase2() {

		System.out.println("\n" + " /////  FASE 2 //// " + "\n");

		ArrayList<Character> nom = new ArrayList<Character>();

		nom.add('s');
		nom.add('e');
		nom.add('r');
		nom.add('g');
		nom.add('i');
		nom.add('5');

		for (int i = 0; i < nom.size(); i++) {

			if (Character.toLowerCase(nom.get(i)) == 'a' || Character.toLowerCase(nom.get(i)) == 'e'
					|| Character.toLowerCase(nom.get(i)) == 'i' || Character.toLowerCase(nom.get(i)) == 'o'
					|| Character.toLowerCase(nom.get(i)) == 'u') {

				System.out.println(nom.get(i) + "    VOCAL");

			} else if (Character.isDigit(nom.get(i))) {

				System.out.println(
						nom.get(i) + "    �s un n�mero i els noms no contenten n�meros... ( pobre c3po i r2d2...)");
			} else {
				System.out.println(nom.get(i) + "    CONSONANT");
			}

		}
	}

	public static void fase4() {

		System.out.println("\n" + " /////  FASE 4 //// " + "\n");

		ArrayList<Character> nom = new ArrayList<Character>();

		nom.add('s');
		nom.add('e');
		nom.add('r');
		nom.add('g');
		nom.add('i');

		ArrayList<Character> cognom = new ArrayList<Character>();

		cognom.add('q');
		cognom.add('u');
		cognom.add('i');
		cognom.add('r');
		cognom.add('a');
		cognom.add('n');
		cognom.add('t');
		cognom.add('e');

		ArrayList<Character> fullnom = new ArrayList<Character>();

		fullnom.addAll(nom);
		fullnom.addAll(cognom);

		System.out.println(nom.toString());
		System.out.println(fullnom);
		fullnom.add(5, ' ');

		System.out.println(fullnom.toString());

	}

	public static void fase3() {

		System.out.println("\n" + " /////  FASE 3 //// " + "\n");

		ArrayList<Character> nom = new ArrayList<Character>();

		nom.add('s');
		nom.add('e');
		nom.add('r');
		nom.add('g');
		nom.add('i');
		nom.add('i');

		HashMap<Character, Integer> nommap = new HashMap<Character, Integer>();
		

		for (int z = 0; z < nom.size(); z++) {
			Character car = nom.get(z);
			if (!nommap.containsKey(car)) {
				nommap.put(car, 1);
			} else {
				nommap.put(car, nommap.get(car) + 1);
			}
		}
		System.out.println(nommap);

	}
}

