public class test{
	//实例化 system.out.println():
	public static void sys(String ans){
		System.out.println(ans);
	}

	public static void main(String[] args) {
		sys("Testing\n");

		//fibonacci
		//i==num1, j==num2, time==fib times
		int i = 0, j = 1, time = 10;
	
		fibonacci fib = new fibonacci();
		fib.simple_fib(i, j, time);
	}
}