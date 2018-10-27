public class fibonacci{
	//simple fibonacci
	public void simple_fib(int i, int j, int t){
		test.sys("Simple Fibonacci:");
		test.sys(String.valueOf(i));
		test.sys(String.valueOf(j));

		for(int x=0; x<t; x++){
			int z = 0;
			z = i+j;
			i = j;
			j = z;

			test.sys(String.valueOf(z));
		}
	}	
}