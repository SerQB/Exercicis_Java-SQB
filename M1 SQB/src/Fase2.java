
public class Fase2 {

	static final int anytraspas = 1948;

	public static void main(String[] args) {

		int lapse = 4;
		int meuany = 1989;
		int tras = 1948;
		int i = 0;
		String text = "  ";

		for (i = 0; meuany > tras; i++) {

			text += tras + " , ";
			tras += lapse;
		}

		System.out.println("  Hi ha " + i + "  anys de trasp�s entre 1948 i 1989");

		System.out.println("  Els anys de trasp�s des de 1948 fins a 1989 s�n: " + text);
	}

}
