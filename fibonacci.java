public class fibonacci{
	//simple fibonacci
	public void simple_fib(int i, int j, int t){
		sys("Simple Fibonacci:");
		sys(String.valueOf(i));
		sys(String.valueOf(j));

		for(int x=0; x<t; x++){
			int z = 0;
			z = i+j;
			i = j;
			j = z;
			
			sys(String.valueOf(z));
		}
	}

	//实例化 system.out.println():
	public void sys(String ans){
		System.out.println(ans);
	}
}