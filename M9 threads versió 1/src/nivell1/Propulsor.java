package nivell1;

	public class Propulsor extends Thread{
		//private String id;
		private int potMax;
		private int actual;
		private int objetivo;
		private Cohete cohete;
		
		public void setCohete(Cohete cohete) {
			this.cohete=cohete;
		}
		
		public Propulsor(String id, int potMax) {
			super(id);
			this.potMax = potMax;
			this.actual = 0;
			this.objetivo = 0;
		}
		
		public void setObjetivo(int obj) {
			if (obj>potMax) {
				this.objetivo = potMax;
			}else if (obj<0) {
				this.objetivo = 0;			
			}else {
				this.objetivo = obj;
			}
		}
		
		public void run() {
			boolean conseguida=false;
			while(true) {
				if (actual>objetivo) {
					actual--;//frenar
					System.out.println(this.cohete.getId()+"-"+Thread.currentThread().getName()+
							":"+ "pot actual=  "+actual + " pot objetivo= "+ objetivo + "  pot max=  "+potMax);
					 conseguida=false;
				}
				else if (actual<objetivo) {
					actual++;//accelerar
					System.out.println(this.cohete.getId()+"-"+Thread.currentThread().getName()+
							":"+ "pot actual=  "+actual + " pot objetivo= "+ objetivo + "  pot max=  "+potMax);
					 conseguida=false;
				}else{//actual==objetivo
					if (!conseguida) {
						System.out.println(this.cohete.getId()+"-"+Thread.currentThread().getName()+" Potencia conseguida: "+
								"pot actual=  "+actual + " pot objetivo= "+ objetivo + "  pot max=  "+potMax);
						conseguida=true;
					}
				}
				try {Thread.sleep(500);} catch (InterruptedException e) {}
			}
		}
		
		
		public int getPotMax() {
			return potMax;
		}

		public void setPotMax(int potMax) {
			this.potMax = potMax;
		}
		
		
	}