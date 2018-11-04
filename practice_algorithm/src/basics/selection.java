package basics;

public class selection {
	public static String sort(int nums[]) {
		String ans = "";

		// original array
		System.out.println(test.get_ans("Original:\t" + ans, nums));

		// sorting
		// x : using to store the address of exchanging target
		// y : value of smallest item
		int x = 0, y = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			y = nums[i];
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] <= y) {
					x = j;
					y = nums[j];
				}
				String str = "--> nums[i] = " + String.valueOf(nums[i]) + " --- y = " + String.valueOf(y);
				test.sys(str);
			}

			y = nums[i];
			nums[i] = nums[x];
			nums[x] = y;

			test.test_step(ans, nums);
		}

		return test.get_ans(ans, nums);
	}
}
