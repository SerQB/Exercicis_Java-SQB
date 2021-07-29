package Nivell1;


	
	public class Propulsor implements Runnable {

		private int idPropulsor;
		private int potenciaMaxima;
		private int potenciaActual;
		private Cohete cohete;
		private double potenciaObjetivo;
		private int velocidadInicial;
		
		

		public int getIdPropulsor() {
			return idPropulsor;
		}

		public void setIdPropulsor(int idPropulsor) {
			this.idPropulsor = idPropulsor;
		}

		public int getPotenciaMaxima() {
			return potenciaMaxima;
		}

		public void setPotenciaMaxima(int potenciaMaxima) {
			this.potenciaMaxima = potenciaMaxima;
		}

		public int getPotenciaActual() {
			return potenciaActual;
		}

		public void setPotenciaActual(int potenciaActual) {
			this.potenciaActual = potenciaActual;
		}

		public Cohete getCohete() {
			return cohete;
		}

		public void setCohete(Cohete cohete) {
			this.cohete = cohete;
		}

		public double getPotenciaObjetivo() {
			return potenciaObjetivo;
		}

		public void setPotenciaObjetivo(double potenciaObjetivo) {
			this.potenciaObjetivo = potenciaObjetivo;
		}

		public int getVelocidadInicial() {
			return velocidadInicial;
		}

		public void setVelocidadInicial(int velocidadInicial) {
			this.velocidadInicial = velocidadInicial;
		}
		
		
		public Propulsor(int idPropulsor, int potenciaMaxima, Cohete cohete) {
			this.idPropulsor = idPropulsor;
			this.potenciaMaxima = potenciaMaxima;
			this.cohete = cohete;
			potenciaActual = 0;
		}

		@Override
		public synchronized void run() {
			
			
			
			if(cohete.isAcelerando()) {
				System.err.println("ACELERANDO PROPULSOR " + idPropulsor + " DEL COHETE "+cohete.getId() +"!");
			for(int i=potenciaActual; i<=potenciaMaxima;i++) {
				if(!cohete.isAcelerando()) break;
				potenciaActual=i;
				System.out.println("Potencia del propulsor num: " +idPropulsor + " del Cohete -> " + cohete.getId() + ": " + potenciaActual + " kW / " + potenciaMaxima + " kW");
				
				
				if(cohete.getPotenciaActualTotal()==cohete.getPotenciaObjetivo()) {
					System.err.println("EL COHETE " + cohete.getId() +" HA ALCANZADO LA POTENCIA OBJETIVO:  " + cohete.getPotenciaObjetivo() + " KW"+ "\n");
					cohete.detener();
					
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
						break;
						}
					
				
				}
				if(potenciaActual==potenciaMaxima) System.err.println("\nPROPULSOR " + idPropulsor + " DEL COHETE " + cohete.getId() +" HA ALCANZADO LA POTENCIA M�XIMA\n");
				
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
					}
				}
			
			if (cohete.getPotenciaObjetivo() > cohete.getMaximaPotenciaTotal() ) {
				
				System.err.println("No se puede alcanzar la potencia deseada");
				
			}
			
			
			}else {
				System.err.println("FRENANDO PROPULSOR " + idPropulsor + "DEL COHETE "+cohete.getId() +"!");
				for(int i=potenciaActual; i>=0;i--) {
					if(cohete.isAcelerando()) break;
					potenciaActual=i;
					System.err.println("Potencia del propulsor num : " +idPropulsor + " del Cohete -> " + cohete.getId() + ": " + potenciaActual + " kW / " + potenciaMaxima + " kW");
					
					if(cohete.getPotenciaActualTotal()==cohete.getPotenciaObjetivo()) {
						System.out.println("EL COHETE " + cohete.getId() +" HA ALCANZADO LA POTENCIA OBJETIVO:  " + cohete.getPotenciaObjetivo() + " KW"+ "\n");
						cohete.detener();
						break;
						//Thread.currentThread().interrupt();
					}	
					
					if(potenciaActual==0) System.err.println("\nPROPULSOR " + idPropulsor + " DEL COHETE " + cohete.getId() +" ESTA DETENIDO (POTENCIA ACTUAL -> 0)\n");
					
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
						break;
						}
					
					
					
					
					
					}
			}
			
			/*if (cohete.getPotenciaActualTotal() == cohete.getMaximaPotenciaTotal() ) {
				
				if (cohete.getPotenciaObjetivo() > cohete.getMaximaPotenciaTotal()) {
					
					System.err.println("No se puede alcanzar la potencia deseada");
					cohete.detener();
										
				}				
			}	*/		
		}
		

	@Override
	public String toString() {
		return " [id=" + idPropulsor + ", P.Maxima=" + potenciaMaxima + "]";
	}

}
