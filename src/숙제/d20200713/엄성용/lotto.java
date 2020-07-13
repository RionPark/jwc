package 숙제.d20200713.엄성용;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		int nums[] = new int[6];
		Random r = new Random();
		for (int i = 0; i < nums.length; i++) {
			nums[i] = r.nextInt(45) + 1;
			
			for (int j = i - 1; j >= 0; j--) {
				if (nums[i] == nums[j]) {
                     i--;
				} 
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.println((i + 1) + "번쨰 번호는 " + nums[i] + "번 입니다");
		}
	}
}

