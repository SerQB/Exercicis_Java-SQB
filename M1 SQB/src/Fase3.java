
public class Fase3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 1989; // data naixament
		Boolean w;

		if ((x % 400) == 0) {
			w = true;
		} else if ((x % 4 == 0) && (x % 100 != 0)) {
			w = true;
		} else {
			w = false;
		}

		String q = x + " �s un any de trasp�s";
		String n = x + "  no �s un any de trasp�s";

		if (w == true) {
			System.out.println(q);
		} else if (w == false) {
			System.out.println(n);
		}
	}

}
