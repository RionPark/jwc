package 숙제.d20200713.김상영;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
		int[] numbers = new int[6];
		Random r = new Random();
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = r.nextInt(45) + 1;
			for (int k = i - 1; k >= 0; k--) {
				if (numbers[i] == numbers[k])
					k--;
			}
		}
		
		
		for (int i = 0; i < numbers.length; i++)
			System.out.println(numbers[i]);
	}

}
