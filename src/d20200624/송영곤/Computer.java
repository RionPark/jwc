package d20200624.송영곤;

public class Computer {
	public void system() {
		System.out.println("난 인텔이지");
	}
	public void speed() {
		System.out.println("난 가장 빨라");
	}
	public void size() {
		System.out.println("난 가장 크지");
	}

	public static void main(String[] args) {
		Computer c = new Computer();
		System.out.println("컴퓨터");
		c.system();
		c.speed();
		c.size();
		System.out.println("노트북");
		NoteBook b = new NoteBook();
		b.system();
		b.speed();
		b.size();
		System.out.println("핸드폰");
		Phone p = new Phone();
		p.system();
		p.speed();
		p.size();
		
		
	
		

	}

}
