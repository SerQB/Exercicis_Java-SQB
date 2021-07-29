package video.domain;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Video {

	String titol;
	String url;
	ArrayList<String> tags = new ArrayList<String>();
	
	
	
	
	public Video(String titol, String url, String tag) {
		
		this.titol= titol;
		this.url = url;
		tags.add(tag);
	}
	

	public Video() throws Exception {
		this.titol = JOptionPane.showInputDialog("Introdueix el titol");
		this.url = JOptionPane.showInputDialog("Introdueix la url");
		
		String x = "0";
		do {
			String tag = JOptionPane.showInputDialog("Introdueix un tag");		
			tags.add(tag);
			
			String op = JOptionPane.showInputDialog("Vols introduir un altre tag? Si = 0   No = 1  ");	
			x=op;
		} while (x.equals("0"));
		
		if (titol == null || titol.isEmpty()) throw new Exception ("Aquest camp no pot estar buit");
		if (url == null || url.isEmpty()) throw new Exception ("Aquest camp no pot estar buit");
		
	}

	
	@Override
	public String toString() {
		return "Video [titol=" + titol + ", url=" + url + ", tags=" + (tags) + "]" + "\n";
	}

}
