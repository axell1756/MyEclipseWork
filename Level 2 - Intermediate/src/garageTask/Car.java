package garageTask;

public class Car extends Vehicle{
	
	private String brand;
	private int milleage;
	
	public Car() {
		
	}
	public Car(String colour, String brand, int milleage, int wheelCount, int cost) {
		
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
		return "Car [getBrand()=" + getBrand() + ", getMilleage()=" + getMilleage() + ", getColour()=" + getColour()
				+ ", getWheelCount()=" + getWheelCount() + ", getCost()=" + getCost() + "]";
	}	

}
