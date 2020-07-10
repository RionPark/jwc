package 숙제.d20200713.정원영;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class NumLotto {

	List<Integer> ranNum() {
		
		List<Integer> num = new ArrayList<>();
		Random ran = new Random();

		for (int i = 0; i < 6; i++) {
			num.add(ran.nextInt(45) + 1);
			for (int j = 0; j < i; j++) {
				if (num.get(i) == num.get(j)) {
					num.remove(i);
					i--;
				}
			}
		}
		return num;
	}

	List<Integer> lottoAlignment(List<Integer> num) {
		
		int swap = 0;
		for (int i = 0; i < num.size(); i++) {
			for (int j = 0; j < i; j++) {
				if (num.get(i) < num.get(j)) {
					swap = num.get(i);
					num.set(i, num.get(j));
					num.set(j, swap);
				}
			}
		}
		return num;
	}
}

public class Lotto {
	public static void main(String[] args) {
		NumLotto ml = new NumLotto();
		for (int i = 0; i < 5; i++) {
			List<Integer> result = ml.lottoAlignment(ml.ranNum());
			System.out.println(result);
		}
	}
}
