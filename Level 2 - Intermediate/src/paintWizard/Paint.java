package paintWizard;

public class Paint {
	
	private String name;
	private int volume;
	private double price;
	private int coverage;
	
	public Paint () {
		
	}
	
	public String getName() {
		return name;
	}

	public int getVolume() {
		return volume;
	}

	public double getPrice() {
		return price;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}
	
	public String whichOne(int x1, int x2, int y, Paint c, Paint a, Paint e) {
		
		int wallOne = x1 * y;
		int wallTwo = x2 * y;
		int totalToCover = wallOne * 2 + wallTwo * 2;
		
		int eCovers = e.getCoverage() * e.getVolume();
		int cCovers = c.getCoverage() * c.getVolume();
		int aCovers = a.getCoverage() * a.getVolume();
		
		int eBuckets = totalToCover / eCovers;
		int cBuckets = totalToCover / cCovers;
		int aBuckets = totalToCover / aCovers;
		
		double ePrice = eBuckets * e.getPrice();
		double cPrice = cBuckets * c.getPrice();
		double aPrice = aBuckets * a.getPrice();
		
		return "Price to cover whole room: \n" + "Cheap paint - " + cPrice + "\n" +
				"Average paint - " + aPrice + "\n" +
				"Expensive paint - " + ePrice;
	}
}
