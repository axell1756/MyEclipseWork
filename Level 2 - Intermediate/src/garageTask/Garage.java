package garageTask;

import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
	
	Car c = new Car();
	Motorcycle m = new Motorcycle();
	
	private ArrayList<Vehicle> vehicleArray = new ArrayList<Vehicle>();
	
	public String getVehicleArray() {
		String res = "";
		for (int i = 0; i < vehicleArray.size(); i++) {
			res = res + vehicleArray.get(i).toString() + "\n";
		}
		return res;
	}
	public void addToGarage (String type, String colour, String brand, int milleage, int wheelCount, int cost) {
				
		switch (type.toLowerCase()) {
		case "bycicle" :
			Bycicle b = new Bycicle(colour, brand, wheelCount, cost);
			vehicleArray.add(b);
			break;
		case "motorcycle" :
			Motorcycle m = new Motorcycle(colour, brand, milleage, wheelCount, cost);
			vehicleArray.add(m);
			break;
		case "car" :
			Car c = new Car(colour, brand, milleage, wheelCount, cost);
			vehicleArray.add(c);
			break;
		}
	}
	public void removeByType (String type) {
		
		Iterator<Vehicle> vehicleIterator = vehicleArray.iterator();
		
		while (vehicleIterator.hasNext()) {

			if (vehicleIterator.next().getClass().getSimpleName().equals(type)) {
			
				vehicleIterator.remove();
			}
		
		}

	}
	public int fixVehicle(String type) {
		
		int result = 0;
		
		switch (type.toLowerCase()) {
		case "bycicle" :
			result = 25;
			break;
		case "motorcycle" :
			result = 250;
			break;
		case "car" :
			result = 600;
			break;
		}
		
		return result;
		
	}
}
