package nivell1;


import java.util.ArrayList;

public class Cohete {
	private String id;
	private ArrayList<Propulsor> propulsores;

	public Cohete(String id, ArrayList<Propulsor> propulsores) {
		this.id = id;
		this.propulsores = propulsores;
	}
	public Cohete(String id) {
		this.id = id;
		this.propulsores = new ArrayList<Propulsor>();
	}

	public void addPropulsor(Propulsor prop) {
		propulsores.add(prop);
		prop.setCohete(this);
	}
	
	public void setObjetivo(int obj) {
		for(Propulsor p: propulsores) {
			p.setObjetivo(obj);
		}
	}
	
	public void iniciar() {
		for(Propulsor p: propulsores) {
			p.start();
		}
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Rocket id=" + id + ": Te "+propulsores.size() +" propulsors";  
	}
	
	public String toString2() {
		String res="Cohete id=" + id + 
				"\nPotencia Maxima propulsors: [";
		for(Propulsor p: propulsores) {
			res += p.getPotMax() + " ";
		}
		return res + "]";
	}
	
}
