package 숙제.d20200624.엄성용;

public class Apple extends SmartPhone {

	public void calling() {
		System.out.println("전화받았습니다");
	}

	public static void main(String[] args) {
		SmartPhone sm = new SmartPhone();
		Apple a = new Apple();
        sm.calling();
        a.calling();
	}
}