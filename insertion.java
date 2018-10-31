public class insertion{
	// sort()
	public static String sort(int nums[])
	{
		String ans = "";

		//body
		// original nums
		// test.test_step(ans, nums);

		//sorting
		for(int i=1; i<nums.length; i++)
		{
			for(int j=0; j<nums.length; j++)
			{
				if(nums[i] < nums[j])
				{
					int temp = nums[j];
					nums[j] = nums[i];
					nums[i] = temp;
				}
			// step test
			// test.test_step(ans + i + " : ", nums);
			}
		}

		//get return value
		ans = test.get_ans(ans, nums);

		return ans;
	}
}