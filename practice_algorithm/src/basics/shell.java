package basics;

import java.util.*;

public class shell {
	public static String sort(int nums[]) {
		String ans = "";
		
		// print original array
		test.sys(test.get_ans("start:\t" + ans, nums));
		
		// stort to list
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i : nums) {
			list.add(i);
		}
		System.out.println(list);
		
		// keep the length of array must be even
		int even_if = 0;
		if(list.size() % 2 != 0) {
			list.add(0);
			even_if = 1;
		}
		
		// sorting
		
		
		return test.get_ans("end:\t" + ans, nums);
	}
}
