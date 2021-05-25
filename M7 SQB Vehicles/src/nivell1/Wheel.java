package nivell1;

public class Wheel {
	private String brand;
	private double diameter;

	public Wheel(String brand, double diameter) throws Exception{
		this.setBrand(brand);
		this.setDiameter(diameter);
	}
	
 
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) throws Exception {
		this.diameter = diameter;
		
		if ( diameter > 0.4 && diameter < 4.0) {
			this.diameter = diameter;
		} else { 
			throw new Exception (" El diàmetre ha de ser entre 0.4 i 4.0");
		}
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		long temp;
		temp = Double.doubleToLongBits(diameter);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Wheel other = (Wheel) obj;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (Double.doubleToLongBits(diameter) != Double.doubleToLongBits(other.diameter))
			return false;
		return true;
	}
	
	
	
}
