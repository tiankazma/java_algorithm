public class test{
	//实例化 system.out.println():
	public static void sys(String ans){
		System.out.println(ans);
	}

	//test_step()
	public static void test_step(String ans, int nums[])
	{
		for (int i=0; i<nums.length; i++)
		{
			ans += nums[i] + " ";
		}

		sys(ans);
	}

	//testing()
	public static String get_ans(String ans, int nums[])
	{
		for (int i=0; i<nums.length; i++)
		{
			ans += nums[i] + " ";
		}

		return ans;
	}

	public static void main(String[] args) {
		sys("Testing\n");

		// testing cases
		int nums[] = {6,3,8,2,9,1,6,8,1};
		// int nums[] = {3,1,4,3,1,4,3,1};
		// int nums[] = {2,2,2,3,3,8,8,8,1,1,1,1,5,5};
		// int nums[] = {4,3,1,2};

		//counting sort
		sys("Counting Sort");
		sys(counting.sort(nums));

		//bucket sort
		// sys("Bucket Sort:");
		// sys(bucket.sort(nums));

		// //insertion sort
		// sys("Insertion Sort:");
		// sys(insertion.sort(nums));

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