package 숙제.d20200713.박정욱;

import java.util.ArrayList;
import java.util.List;

public class Lotto {
	public static void main(String[] args) {
		List<Integer> balls = new ArrayList<>();
		Math.random();
		int num = 0;
		for (int i = 0; i < 6; i++) {
			num = (int) ((Math.random() * 45) + 1);
			if (-1 == balls.indexOf(num)) {
				balls.add(num);
			} else {
				i--;
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(i + 1 + "번 번호 : " + balls.get(i));
		}

	}
}
