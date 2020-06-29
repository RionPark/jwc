package d20200624.윤동제;

public class H_08 extends H_07 {
	public void Food() {
		System.out.println("나는 한식");
	}
	public static void main(String[] args) {
		H_07 i = new H_07();
		i.Food();
		H_07 ii = new H_08();
		ii.Food();
		H_08 iii = new H_08();
		iii.Food();
	}

}
