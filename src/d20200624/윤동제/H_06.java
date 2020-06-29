package d20200624.윤동제;

public class H_06 extends H_05 {
	public String Sports() {
		return "스노우보드~";
	}
	public static void main(String[] args) {
		H_05 want = new H_05();
		System.out.println(want.Sports());
		
		H_05 to = new H_06();
		System.out.println(to.Sports());
		
		H_06 sleep = new H_06();
		System.out.println(sleep.Sports());
	}

}
