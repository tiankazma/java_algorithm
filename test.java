public class test{
	public static void main(String[] args) {
		System.out.println("Testing\n");

		//fibonacci
		//i==num1, j==num2, time==fib times
		int i = 0, j = 1, time = 10;
	
		fibonacci fib = new fibonacci();
		fib.simple_fib(i, j, time);
	}
}