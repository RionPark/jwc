package 숙제.d20200713.나원준;

import java.util.Random;

public class Lotto {
	

	
		public static void main(String[] args) {
			int[]numbers=new int[6]; 
			Random r =new Random();
			for(int i=0;i<numbers.length;i++) { 
				numbers[i]=r.nextInt(45)+1;
				for(int j = i - 1; j >= 0; j--) {
					if(numbers[i]==numbers[j]) 
						j--;
				}
			}
			for(int i=0;i<numbers.length;i++)
			System.out.println(numbers[i]);
		}
		

	}


