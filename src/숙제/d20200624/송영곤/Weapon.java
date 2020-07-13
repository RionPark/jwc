package 숙제.d20200624.송영곤;

public class Weapon {
	public void length(int a) {
		System.out.println("내 무기는 "+a+"cm만큼 길지");
	}
	public void type(String a1) {
		System.out.println("내 무기는 "+a1+"는 타입이야");
	}
	public void age(int a2) {
		System.out.println("내 무기는 "+a2+"년 정도 되었어");
	}
	
	public static void main(String[] args) {
		Sword sw = new Sword();
		sw.length(30);
		sw.type("베");
		sw.age(50);
	}

}
