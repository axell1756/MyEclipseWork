
public class UniqueSum {
	public static void main(String[] args) {
		System.out.println(intSum(1,2,3));
		System.out.println(intSum(1,1,2));
		System.out.println(intSum(1,1,1));
	}
	
	public static int intSum(int a, int b, int c) {
		if (a == b && a == c && b == c) {
			return 0;
		} if (a == b) { 
			return c;
		} else if (a == c) {
			return b;
		} else if (b == c) {
			return a;
		} else {
			return a + b + c;
		}
	}
}
