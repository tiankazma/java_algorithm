public class recursion{
	// factorial
	public static int factorial(int n){
		if(n <= 1){
			return 1;
		}else{
			return n * factorial(n - 1);
		}
	}

	public static String get_result(int n){
		return String.valueOf(factorial(n));
	}
}