package Nivell1;

import java.util.List;

public class Cohete {
	
	private String id;
	private List<Propulsor> propulsores;
	private int numeroPropulsores; 
	private boolean acelerando;
	private int potenciaObjetivo;
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Propulsor> getPropulsores() {
		return propulsores;
	}

	public void setPropulsores(List<Propulsor> propulsores) {
		this.propulsores = propulsores;
	}

	public int getNumeroPropulsores() {
		return propulsores.size();
	}

	public void setNumeroPropulsores(int numeroPropulsores) {
		this.numeroPropulsores = numeroPropulsores;
	}

	public boolean isAcelerando() {
		return acelerando;
	}

	public void setAcelerando(boolean acelerando) {
		this.acelerando = acelerando;
	}
	
	public int getPotenciaObjetivo() {
		return potenciaObjetivo;
	}

	public void setPotenciaObjetivo(int potenciaObjetivo) {
		this.potenciaObjetivo = potenciaObjetivo;
	}
	
	public int getMaximaPotenciaTotal() {
		int maximaPotencia = 0;
		for(Propulsor p: propulsores) {
			maximaPotencia+=p.getPotenciaMaxima();
		}
		return maximaPotencia;
	}
	
	public int getPotenciaActualTotal () {
		
		int potenciaTotal = 0;
		
			for (Propulsor p: propulsores) {
			
				potenciaTotal += p.getPotenciaActual();
			}		
			return potenciaTotal;
	}
	
	

	

	public Cohete(String id) {
		this.id = id;
	}
	
	public Cohete(String id, List<Propulsor> propulsores) throws Exception {
		this.id = id;
		this.propulsores = propulsores;
		numeroPropulsores = propulsores.size();
		acelerando = false;
	}

	public void acelerar() {
		acelerando = true;
		for(Propulsor p: propulsores) {
			Thread acelerador = new Thread(p);
			acelerador.start();
		}
	}
	
	public void frenar() {
		acelerando = false;
		for(Propulsor p: propulsores) {
			Thread frenada = new Thread(p);
			frenada.start();
		}
	}
	public void detener() {
		acelerando = false;
		for(Propulsor p: propulsores) {
			Thread frenada = new Thread(p);
			frenada.interrupt();
			
			//Thread.currentThread().interrupt();
		}
	}

	
}
	

