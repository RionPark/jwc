package 숙제.d20200713.윤동제;

public class J_18_Lotto {
	public static void main(String[] args) {
		int[] nums = new int[6];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (int) (Math.random() * 45) + 1;
			for (int j = i - 1; j >= 0; j--) {
				if (nums[j] == nums[i]) {
					i--;
				}
			}
		}
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("[%d],",nums[i]);

		}
	}

}
