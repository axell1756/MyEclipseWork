public class Runners {
	
	static int[] porridge = { 80, 50, 60, 60, 85, 70, 200, 100 };
	static int[] chair = { 100, 30, 130, 90, 150, 120, 200, 110 };

	public static void main(String[] args) {

		System.out.println(requirements(100, 100));

	}

	public static String requirements(int weight, int temperature) {

		String result = null;

		for (int i = 0; i < porridge.length; i++) {


				if (weight <= chair[i] && temperature <= porridge[i]) {

					result = ("Seated no probs at seat no - " + i);
					System.out.println(result);

				} else if (weight > chair[i] && temperature <= porridge[i]) {

					result = ("Chair break but porridge is good");
					System.out.println(result);
					
				} else if (weight <= chair[i] && temperature > porridge[i]) {

					result = ("Mouth scolded but seat works");
					System.out.println(result);
					
				} else {

					result = (" you having a bad day, everything is going worng");
					System.out.println(result);

			}

		}
		return "";
	}
}
