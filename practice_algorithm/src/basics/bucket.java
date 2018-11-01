package basics;

public class bucket{
	public static String sort(int nums[]){
		String ans = "";

		//body
		// get the bound
		int bound = 0;
		for(int i=0; i<nums.length; i++){
			if(nums[i] > bound){
				bound = nums[i];
			}
		}
		bound += 1;

		// create the buckets
		int[] buckets = new int[bound];

		// start sorting job
		for (int i=0; i<nums.length; i++){
			for(int j=0; j<buckets.length; j++){
				if(nums[i] == j){
					buckets[j] += 1;
				}
			}
		}

		//get ans
		for(int i=0; i<buckets.length; i++){
			if(buckets[i] != 0){
				for(int j=0; j<buckets[i]; j++){
					ans += i + " ";
				}
			}
		}

		return ans;
	}
}