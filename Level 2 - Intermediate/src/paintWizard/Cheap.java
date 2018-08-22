package paintWizard;

public class Cheap extends Paint{

	public Cheap () {
		
	}
	
	public Cheap (String name, int volume, double price, int coverage) {
		this.setName(name);
		this.setVolume(volume);
		this.setPrice(price);
		this.setCoverage(coverage);
	}
	
}
