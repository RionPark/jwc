package d20200624.송영곤;

public class Bird {
	
	

	public void fly() {
		System.out.println("나는 날 수 없어");
	}
	public void size() {
		System.out.println("나는 몸집이 커");
	}
	
	public static void main(String[] args) {
		Chicken c = new Chicken();
		c.fly("없어");
		c.size();
	}
}
