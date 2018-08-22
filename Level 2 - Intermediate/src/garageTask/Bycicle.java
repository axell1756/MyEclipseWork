package garageTask;

public class Bycicle extends Vehicle {
	
	private String brand;
	
	public Bycicle() {
		
	}
	public Bycicle(String colour, String brand, int wheelCount, int cost) {
		
		this.setColour(colour);
		this.setBrand(brand);
		this.setWheelCount(wheelCount);
		this.setCost(cost);

	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String toString() {
		return "Bycicle [getBrand()=" + getBrand() + ", getColour()=" + getColour()
				+ ", getWheelCount()=" + getWheelCount() + ", getCost()=" + getCost() + ", getClass()=" + getClass() +"]";
	}	

}
