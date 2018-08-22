package garageTask;

public class Runable {
	
public static void main(String[] args) {
	
	Garage g = new Garage();
	
	g.addToGarage("bycicle", "black", "Merida", 13, 2, 250);
	g.addToGarage("bycicle", "black", "Merida", 13, 2, 250);
	g.addToGarage("car", "blue", "Honda", 10000, 4, 13000);
	g.addToGarage("motorcycle", "silver", "Honda", 300, 2, 15000);
	
	System.out.println("Initial array: ");
	System.out.println(g.getVehicleArray());
	
	g.removeByType("Bycicle");
	
	System.out.println("Post-delete array: ");	
	System.out.println(g.getVehicleArray());
	
	System.out.println("Fix vehicle: ");
	System.out.println(g.fixVehicle("Car"));
	}

}
