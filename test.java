public class test{
	//实例化 system.out.println():
	public static void sys(String ans){
		System.out.println(ans);
	}

	public static void main(String[] args) {
		sys("Testing\n");

		int nums[] = {6,3,8,2,9,1};

		//insertion sort
		sys("Insertion Sort:");
		sys(insertion.sort(nums));

		// //cocktail sort
		// sys("Cocktail Sort (double-bubble sort):");
		// sys(cocktail.sort(nums));

		//bubble sort
		// sys("Bubble Sort:");
		// sys(bubble_sort.bubble(nums));

		//fibonacci
		//i==num1, j==num2, time==fib times
		// int i = 0, j = 1, time = 10;
	
		// fibonacci fib = new fibonacci();
		// fib.simple_fib(i, j, time);
	}
}