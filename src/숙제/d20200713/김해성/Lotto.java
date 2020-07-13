package 숙제.d20200713.김해성;

import java.util.Random;
import java.util.Scanner;

class LottoSys	{

}


	public class Lotto {

	
		
	public static void main(String[] args)	{
		int[] num = new int[6];
		Scanner s = new Scanner(System.in);
		
		System.out.print("로또 번호 생성 원하는 게임수를 숫자로입력해주세요 >");
		int cnt = s.nextInt();
		

		Random r = new Random();
		
		for(int z=1; z<=cnt; z++)	{
		for(int i=0; i<num.length; i++) {
			num[i] = r.nextInt(45)+1;
		
			for(int j=0; j<i; j++) {
				if(i==j)	{
					i--;
				}
				
			}
			
		} 
		for(int q=0;q<num.length; q++)	{
		System.out.print("["+num[q]+"]");
		if(q==num.length-1) {
			System.out.println();
		}
		}
		}
		
		

		
		

		
	}
	
	
}
