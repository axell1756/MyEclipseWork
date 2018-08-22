public class HelloWorld {
	public static void main(String[] args)
	{
		// Return Hello world!
		System.out.println("Hello World!");
		
		//Assign Hello world to a variable
		String hv = "Hello World!";
		System.out.println(hv);
		
		System.out.println(userInput("String input by user"));
		
		System.out.println(helloWorld());
		
		System.out.println(intSum(3, 10));
		System.out.println(intSum(3, 10, false));
		System.out.println(intSum1(0, 10, false));
		
		for (int i = 0; i < 10; i++) {
			System.out.println(intSum1(i, 10, false));
		}
		
		//Array definition 
		byte[] intArray = new byte[]{1,2,3,4,5,6,7,8,9,10};
		
		//Passing array value to a function
		System.out.println(intSum1(intArray[1], 10, false));
		
		//Loops through all the values in the array
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ", ");
		}
	}
	
	//Method which returns a String
	public static String userInput(String a) {
		return a;
	}
	
	//Method which returns a Hello World
	public static String helloWorld() {
		return "Hello World!";
	}

	//SUM method
	public static int intSum(int a, int b) {
		return a + b;
	}
	
	//SUM method which checks whether to multiply or add ints
	public static int intSum(int a, int b, Boolean c) {

		if (c == true ) {
			return a + b;
		} else {
			return a*b;
		}
		
	}
	
	/*SUM method which checks whether to multiply or add ints 
	and returns 0 if one of the ints is 0*/
	public static int intSum1(int a, int b, Boolean c) {

		if (c == true ) {
			return a + b;
		} else if (a == 0) {
			return a;
		} else if (b == 0){
			return b;
		} else {
			return a*b;
		}
		
	}
	
	
}	
	

