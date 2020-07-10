package 숙제.d20200713.장재민;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lotto {
	
	public static void main(String[] args) {
		List<Integer> numList = new ArrayList<>();
		Random r = new Random();
		for (int i=0;i<6;i++) {
			numList.add(i,r.nextInt(45)+1);
			
			for(int j=i-1;j>=0;j--) {
				if(numList.get(j)==numList.get(i)) {
					i--;
				}
			}
		}
		for(int i=0;i<6;i++) {
			System.out.println((i+1) + "번째 : " + numList.get(i));
		}
	}
}