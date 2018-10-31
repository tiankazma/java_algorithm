public class counting{
	public static String sort(int nums[]){
		String ans = "";
		test.test_step("Original :\t" + ans, nums);
		//get length of nums[]
		int len = nums.length;

		//create the counting-box and buckets
		int[] box = new int[len];
		int[] buckets = new int[len];

		//counting the tickets for each member in nums[]
		for(int i=0; i<len; i++){
			int ticket = 0;

			for(int j=0; j<len; j++){
				if(nums[i] > nums[j]){
					ticket++;
				}
			}

			box[i] = ticket;
		}
		test.test_step("Tickets :\t" + ans, box);
		test.sys("\n");
		// alocating the nums[] items into the buckets
		for(int i=0; i<len; i++){
			//the value of box[i] : allocating the address of value nums[i]
			// in buckets[]
			buckets[box[i]] = nums[i];

			//if there are same valued item in nums[]
			// the following item will be allocated in folloing addresses
			if(buckets[box[i]] == nums[i] && box[i] != len - 1){
				buckets[box[i] + 1] = nums[i];
			}

			test.test_step("Process :\t" + ans, buckets);
		}

		//get ans
		ans = test.get_ans(ans, buckets);

		return ans;
	}
}