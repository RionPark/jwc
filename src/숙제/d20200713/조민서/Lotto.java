package 숙제.d20200713.조민서;

import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {

	int[] nums = new int[6];

	Random ran = new Random();

	for(int i = 0;i<nums.length;i++) {
		nums[i] = ran.nextInt(45) + 1;

		for (int j = i - 1; j >= 0; j--) {
			if (nums[i] == nums[j]) {
				i--;
			}
		}

	}
	for(int i = 0; i<nums.length; i++) {
		System.out.println((i+1) + "번째 : " + nums[i]);
}
	}
}
