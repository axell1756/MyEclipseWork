package taskDoggo;

public class Runable {

	public static void main(String[] args) {

		System.out.println(pupsPlace(6, populate(1000)));

	}

	static String pupsPlace(int placeTaken, int[] outOf) {

		String res = "";

		for (int i : outOf) {

			if (placeTaken == i) {

				continue;

			} else {

				switch (i % 10) {
				case 1:
					res = res + i + "st\n";
					break;
				case 2:
					res = res + i + "nd\n";
					break;
				case 3:
					res = res + i + "rd\n";
					break;
				default:
					res = res + i + "th\n";
					break;
				}
			}
		}

		return res;
	}

	static int[] populate(int range) {

		int[] placeArray = new int[range];

		for (int i = 0; i < placeArray.length; i++) {

			placeArray[i] = i;

		}

		return placeArray;

	}
}
