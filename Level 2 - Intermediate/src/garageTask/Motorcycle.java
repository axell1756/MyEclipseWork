package garageTask;

public class Motorcycle extends Vehicle{
	
	private String brand;
	private int milleage;
	
	
	public Motorcycle() {
		
	}
	public Motorcycle(String colour, String brand, int milleage, int wheelCount, int cost) {
		
		this.setColour(colour);
		this.setBrand(brand);
		this.setWheelCount(wheelCount);
		this.setCost(cost);

	}
	public String getBrand() {
		return brand;
	}
	public int getMilleage() {
		return milleage;
	}
	public void setBrand(String name) {
		this.brand = name;
	}
	public void setMilleage(int milleage) {
		this.milleage = milleage;
	}
	public String toString() {
		return "Motorcycle [getBrand()=" + getBrand() + ", getMilleage()=" + getMilleage() + ", getColour()="
				+ getColour() + ", getWheelCount()=" + getWheelCount() + ", getCost()=" + getCost() + ", getClass()=" + getClass() + "]";
	}	
	

}
