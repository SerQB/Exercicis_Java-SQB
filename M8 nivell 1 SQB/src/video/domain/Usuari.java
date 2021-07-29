package video.domain;

import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

public class Usuari {
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCognom() {
		return cognom;
	}

	public void setCognom(String cognom) {
		this.cognom = cognom;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getDataRegistre() {
		return dataRegistre;
	}

	public void setDataRegistre(Date dataRegistre) {
		this.dataRegistre = dataRegistre;
	}

	public ArrayList<Video> getUserVids() {
		return userVids;
	}

	public void setUserVids(ArrayList<Video> userVids) {
		this.userVids = userVids;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognom == null) ? 0 : cognom.hashCode());
		result = prime * result + ((dataRegistre == null) ? 0 : dataRegistre.hashCode());
		result = prime * result + ((nom == null) ? 0 : nom.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((userVids == null) ? 0 : userVids.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuari other = (Usuari) obj;
		if (cognom == null) {
			if (other.cognom != null)
				return false;
		} else if (!cognom.equals(other.cognom))
			return false;
		if (dataRegistre == null) {
			if (other.dataRegistre != null)
				return false;
		} else if (!dataRegistre.equals(other.dataRegistre))
			return false;
		if (nom == null) {
			if (other.nom != null)
				return false;
		} else if (!nom.equals(other.nom))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (userVids == null) {
			if (other.userVids != null)
				return false;
		} else if (!userVids.equals(other.userVids))
			return false;
		return true;
	}

	String nom;
	String cognom;
	String password;
	Date dataRegistre;
	ArrayList <Video> userVids = new ArrayList <Video>();

	public Usuari(String nom, String cognom, String password) {
		this.nom = nom;
		this.cognom = cognom;
		this.password = password;
		this.dataRegistre = new java.util.Date(); 
	}
	
	public Usuari() throws Exception {
		
		this.nom =JOptionPane.showInputDialog("Introdueix el teu nom");
		if (nom==null || nom.isEmpty() ) throw new Exception ("Aquest camp no pot estar buit");
		this.cognom = JOptionPane.showInputDialog("Introdueix el teu cognom");
		if (cognom==null ||cognom.isEmpty()) throw new Exception ("Aquest camp no pot estar buit");
		this.password = JOptionPane.showInputDialog("Introdueix una contrasenya");
		if (password==null ||password.isEmpty()) throw new Exception ("Aquest camp no pot estar buit");
		this.dataRegistre = new java.util.Date(); 
		
		
		
	}

	@Override
	public String toString() {
		return "Usuari [nom=" + nom + ", cognom=" + cognom + ", password=" + password + ", dataRegistre=" + dataRegistre
				+ ", userVids=" + (userVids) + "]";
	}

}
