
public class TooHot {
	public static void main(String[] args) {
		System.out.println(tempCheck(91, false));
	}
	
	public static Boolean tempCheck(int temp, Boolean season) {
		if (temp >= 60 && temp <= 90 && season == false) {
			return true;
		} else if (temp >= 60 && temp <= 100 && season == true) {
			return true;
		} else {
			return false;
		}
	}
}
