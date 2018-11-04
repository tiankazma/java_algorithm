package basics;

public class selection {
	public static String sort(int nums[]) {
		String ans = "";

		// original array
		System.out.println(test.get_ans("Original:\t" + ans, nums));

		// sorting
		int x = nums[0];

		if (nums.length < 2) {
			ans += x;
		} else {
			for (int j = 0; j < nums.length; j++) {
				for (int i = j; i < nums.length; i++) {
					if (nums[i] < x) {
						x = nums[i];
					}
				}
				ans += x;
			}
		}

		return test.get_ans(ans, nums);
	}
}
