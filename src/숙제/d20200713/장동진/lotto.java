package 숙제.d20200713.장동진;

import java.util.Random;

public class lotto {

	public static void main(String[] args) {

		Random r = new Random();
		int[] lonum = new int[6];

		for (int i = 0; i < lonum.length; i++) {

			lonum[i] = r.nextInt(45) + 1;
			for (int j = 0; j <= i - 1; j++) {
				if (lonum[i] == lonum[j]) {

					i--;
				}
			}

		}
		
	
	

		for (int i = lonum.length; i > 0; i--) {

			for (int j = 0; j < i - 1; j++) {

				if (lonum[j] > lonum[j + 1]) {
					int tmp = lonum[j];
					lonum[j] = lonum[j + 1];
					lonum[j + 1] = tmp;
				}

			}

		}

		for (int i = 0; i < lonum.length; i++) {

			System.out.print(lonum[i] + " ");
		}

	}

}
