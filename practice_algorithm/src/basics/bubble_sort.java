package basics;

public class bubble_sort{
	public static void step(int nums[]){
		for(int i=0; i<nums.length; i++){
			System.out.print(String.valueOf(nums[i]) + " ");
		}
		System.out.println();
	}

	public static String bubble(int nums[]){
		String ans = "";

		for(int i=0; i<nums.length; i++){
			// System.out.println("\nRound " + i);

			for(int j=0; j<nums.length; j++){
				// // descending
				// if(nums[i] > nums[j]){
				// 	int x = nums[i];
				// 	nums[i] = nums[j];
				// 	nums[j] = x;
				// }
				// cending:
				// System.out.print("Key is " + nums[i] + " : ");
				if(nums[i] < nums[j]){
					int x = nums[i];
					nums[i] = nums[j];
					nums[j] = x;
				}
				// step(nums);
			}
			// step(nums);
		}

		for(int i=0; i<nums.length; i++){
			ans += nums[i];
		}

		return "\nfinal : " + ans;
	}
}