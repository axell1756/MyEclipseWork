public class Blackjack {

	public static void main(String[] args) {
		
		System.out.println(shuffle(21,0));
		System.out.println(shuffle(21,21));
		System.out.println(shuffle(18,24));
		
	}
	
	public static int shuffle(int a, int b) {
		
		if (a > 21 && b > 0) {
			return 0;
		} else if (a > 21) {
			return b;
		} else if (b > 21) {
			return a;
		} else if (a > b ) {
			return a;
		} else {
			return b;
			}
		}
	
	
}
