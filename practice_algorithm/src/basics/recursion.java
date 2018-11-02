package basics;

public class recursion {
	// factorial
	public static int factorial(int n) {
		if (n <= 1) {
			return 1;
		} else {
			return n * factorial(n - 1);
		}
	}
	
	// decimal to binary
	public static String dtob(String ans, int n) {
		if(n<=2) {
			ans = String.valueOf(n%2) + ans;
			
		}else {
			ans = String.valueOf(n%2) + ans;
			ans = dtob(ans, n/2);
		}
		
		return ans;
	}

	// return the result value
	public static String get_result(int n) {
		// return String.valueOf(factorial(n));
		
		// decimal to binary
		String ans = "";
		ans = dtob(ans, n);
		
		return ans;
	}
}