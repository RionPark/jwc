package 숙제.d20200713.김현배;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class LottoNumCreater {

	Set<Integer> creater() {
		Random r = new Random();
		Set<Integer> nums = new HashSet<>();
		for(;nums.size()<6;) {
			nums.add(r.nextInt(45)+1);	
		}
		return nums;
	}
}
