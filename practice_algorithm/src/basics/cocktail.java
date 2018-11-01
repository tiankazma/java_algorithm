package basics;

public class cocktail{
	public static String get_ans(String ans, int nums[]){
		for(int i=0; i<nums.length; i++){
			ans += nums[i] + " ";
		}

		return ans;
	}

	public static String sort(int nums[]){
		String ans = "";

		int temp = 0, left = 0, right = nums.length - 1;

		System.out.println("Original: " + get_ans(ans, nums));

		do{
			// left to right
			for(int i=left; i<right; i++){
				if (nums[i] > nums[i+1]){
					temp = nums[i + 1];
					nums[i + 1] = nums[i];
					nums[i] = temp;
				}
				System.out.println("L --> R: " + get_ans(ans, nums));
			}
			left++;

			//right to left
			for(int i=right-1; i>=left; i--){
				if(nums[i] < nums[i - 1]){
					temp = nums[i - 1];
					nums[i - 1] = nums[i];
					nums[i] = temp;
				}
				System.out.println("R --> L: " + get_ans(ans, nums));
			}
			right--;
		}while(left < right);

		ans = get_ans(ans, nums);

		return ans;
	}
}