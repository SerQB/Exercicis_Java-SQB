package video.application;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import video.domain.Usuari;
import video.domain.Video;
import video.persistence.UserRepository;
import video.persistence.VideoRepository;

public class VideoController {

	private UserRepository repository = new UserRepository();
	private VideoRepository videorepo = new VideoRepository();

	public VideoController() {

	}

	public void CreateUser(String nom, String cognom, String password) throws Exception {
		Usuari user = new Usuari(nom, cognom, password);
		repository.addMember(user);
	}

	public void CreateUserPane() throws Exception {
		Usuari user = new Usuari();
		repository.addMember(user);
	}

	public void showUsers() {

		List<Usuari> usu = new ArrayList<>();
		usu = repository.getAllMembers();
		for (Usuari e : usu) {

			System.out.println(e);

		}

	}

	public void ShowVideos() throws Exception {

		String n = JOptionPane.showInputDialog("Introdueix el teu nom d'usuari");
		if (n == null || n.isEmpty())
			throw new Exception("Aquest camp no pot estar buit");

		List<Usuari> usu = new ArrayList<>();

		usu = repository.getAllMembers();
		boolean x = false;
		for (Usuari e : usu) {

			if (e.getNom().equals(n)) {

				String p = JOptionPane.showInputDialog("Introdueix el teu password");
				if (e.getPassword().equals(p)) {

					System.out.println("Aquesta és la info sobre els teus videos:" + "\n" + e.getUserVids());
					x = true;
				} else {
					System.out.println("Password incorrecte");
				}

			}
		}

		if (x == false) {
			System.out.println("No hem trobat coincidencia a la nostre base de dades");
		}

	}

	public void addVideo() throws Exception {

		String n = JOptionPane.showInputDialog("Introdueix el teu nom d'usuari");
		if ( n== null ||n.isEmpty())
			throw new Exception("Aquest camp no pot estar buit");

		List<Usuari> usu = new ArrayList<>();

		usu = repository.getAllMembers();
		boolean x = false;
		for (Usuari e : usu) {

			if (e.getNom().equals(n)) {

				String p = JOptionPane.showInputDialog("Introdueix el teu password");
				if (e.getPassword().equals(p)) {

					Video v = new Video();

					e.getUserVids().add(v);

					videorepo.addVideo(v);
					x = true;

					System.out.println("Has afegit el següent video a la teva llista de videos" + v);

					break;

				} else {
					System.out.println("Password incorrecte");
				}

			}

		}
		if (x == false) {
			System.out.println("No hem trobat coincidència a la nostre base de dades");
		}

	}

}
