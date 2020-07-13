package 숙제.d20200624.차백송;

public class Son extends Father {

	public void work() {

		System.out.println("사실은 개발 일을 합니다.");
	}

	public static void main(String[] args) {
		Father f = new Son();
		f.work();
	}

}
