package 숙제.d20200624.차백송;

public class Cpu extends Computer {

	public void calculate() {

		System.out.println("연산 중입니다.");
	}

	public static void main(String[] args) {
		Computer c = new Cpu();
		c.calculate();
	}

}
