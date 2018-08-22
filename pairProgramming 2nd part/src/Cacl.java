
public class Cacl {

	public static void main(String[] args) {
		
		calc(5,3,15);
		
	}
	
	public static void calc(int x, int y, int z) {
	
		System.out.println(multiplication(x,y,z)); 
		System.out.println(division(x,y,z));
		System.out.println(addition(x,y,z));
		System.out.println(subtract(x,y,z));
		
	}
	
	private static String multiplication (int x, int y, int z) {
		
		String res = null;
				
		if (x * y == z) {
			
			res = (x + " * " + y + " = " + z);
			
		} else if (x * z == y) {
			
			res = (x + " * " + z + " = " + y);
			
		} else if (z * y == x) {
			
			res = (z + " * " + y + " = " + x);
			
		} else {
			res = "Nothing in multiplication";
		}
		
		
		return res;
		
	}
	
	private static String division (int x, int y, int z) {
		
		String res = null;
		
		if (x / y == z) {
			
			res = (x + " / " + y + " = " + z);
			
		} else if (x / z == y) {
			
			res = (x + " / " + z + " = " + y);
			
		} else if (z / y == x) {
			
			res = (z + " / " + y + " = " + x);
			
		} else {
			res = "Nothing in division";
		}
		
		
		return res;
		
	}
	
	private static String addition (int x, int y, int z) {
		
		String res = null;
		
		if (x + y == z) {
			
			res = (x + " + " + y + " = " + z);
			
		} else if (x + z == y) {
			
			res = (x + " + " + z + " = " + y);
			
		} else if (z + y == x) {
			
			res = (z + " + " + y + " = " + x);
			
		} else {
			res = "Nothing in addition";
		}
		
		
		return res;
		
	}
	
	private static String subtract (int x, int y, int z) {
		
		String res = null;
		
		if (x - y == z) {
			
			res = (x + " - " + y + " = " + z);
			
		} else if (x - z == y) {
			
			res = (x + " - " + z + " = " + y);
			
		} else if (z - y == x) {
			
			res = (z + " - " + y + " = " + x);
			
		} else {
			res = "Nothing in subtraction";
		}
		
		
		return res;
		
	}
	
	
}
