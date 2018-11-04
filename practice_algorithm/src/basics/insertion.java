package basics;

public class insertion {
	// sort()
	public static String sort(int nums[]) {
		String ans = "";

		// body
		// original nums
		test.test_step("Start:\t" + ans, nums);

		// sorting
		for (int i = 1; i < nums.length; i++) {
			int current = nums[i];

			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] > current) {
					int temp = nums[j + 1];
					nums[j + 1] = nums[j];
					nums[j] = temp;
				}
				
				test.test_step(ans, nums);
			}
			test.sys("--- --- ---");
		}

		return test.get_ans("End:\t" + ans, nums);
	}
}