package video.view;



import java.util.Scanner;

import javax.swing.JOptionPane;

import video.application.VideoController;
import video.persistence.UserRepository;

public class AppVideo {

	private static VideoController controller=new VideoController();
	
	
	public static void main(String[] args) throws Exception {
		
		try {
			controller.CreateUser("Sergi", "Quirante", "1234");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			controller.CreateUser("Juan", "Quirante", "4321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			controller.CreateUserPane();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		controller.showUsers();
		
		int z = 0;
		do {
			
		
		System.out.println("Selecciona una opcio del menú:" + "\n" 				
			+ "Crear un nou usuari ------------------> 1"  + "\n"
			+ "Mirar els videos d'un usuari----------> 2"   + "\n"
			+ "Afegir videos al compte d'usuari------> 3"   + "\n"  
			+ "Sortir  ------------------------------> 4");
		
		
		//@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		String opcio = reader.next();
		//String opcio = JOptionPane.showInputDialog("Introdueix el codi d'opcio");
		
		//if(opcio == null || opcio.isEmpty()) throw new Exception("Opció introduida no valida");
		
			
		
		
		switch(opcio) {
		
		case ("1"):
			
			try {
				controller.CreateUserPane();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		break;
		
		case ("2"):
			
			try {
				controller.ShowVideos();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		
		break;
		
		case ("3"):
			
			try {
				controller.addVideo();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		break;
		
		case ("4"):
			
			z = 1;	
			System.out.println("Fins la propera!!");
		break;
		
		default:
			
			System.out.println("Opció incorrecte");
			
		}
		
		} while (z == 0);
	

	}
	
	
	
}

