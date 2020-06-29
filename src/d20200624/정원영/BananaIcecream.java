package d20200624.정원영;

public class BananaIcecream extends Icecream {
	
	public void caution() {
		System.out.println("바나나는 덜 맛있음");
	}
	
	public static void main(String[] args) {
		
		Icecream ic = new BananaIcecream();
		
		ic.setTaste("바나나");
		ic.setType("구슬");
		ic.caution();
		
		
		System.out.println(ic);
		
	}

}
