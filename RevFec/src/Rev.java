public class Rev {

	public static void main(String[] args) {
		
		System.out.println(revFac(3628800));
	}
	
	public static String revFac(int a) {
		int b = 1;
		int result = a;
		
		while (result%b == 0) {
			
			result = result/b;
			b++;
			
		}
		
		if (result == 1) {
			return Integer.toString(b-1) + "!";
		} else {
			return "NONE";
		}
	}
	
}
