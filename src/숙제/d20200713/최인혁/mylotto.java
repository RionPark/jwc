package Test;



public class mylotto {
	public static void main(String[] args) {
		int lotto[] = new int [7];
		System.out.println("~도원결의 나눔로또~");
     	  	
		for(int i=0; i<6; i++) {
			lotto[i] = (int)(Math.random() * 44) + 1;
            
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
	System.out.print("이번주 로또 번호는!: ");
	
	for(int i=0; i<6; i++) {
		System.out.print(lotto[i] + " ");
	}	
	}
}


