package 숙제.d20200710.송영곤;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Lotto{
	public static void main(String[] args) {
		Map<String,Integer> nums = new HashMap<>();
		int[] lotto = new int[6];
		Random r = new Random();
		for(int i = 0; i<lotto.length;i++) {
			nums.put("번호",r.nextInt(45)+1);
			lotto[i] = nums.get("번호");
			for (int j = i - 1; j >= 0; j--) {
				if(lotto[j]==lotto[i]) {
					i--;
					System.out.println("다시");
				} 
			}
		}
		
		for (int i = 0; i < lotto.length; i++) {
			System.out.println((i + 1) + "번째 =" + lotto[i]);
	}
}
}
