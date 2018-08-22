package paintWizard;

public class Expensive extends Paint{

	public Expensive() {
		
	}
	
	public Expensive (String name, int volume, double price, int coverage) {
		this.setName(name);
		this.setVolume(volume);
		this.setPrice(price);
		this.setCoverage(coverage);
	}
	
}
