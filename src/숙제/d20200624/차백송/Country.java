package 숙제.d20200624.차백송;

public class Country extends World {
	public void structure() {

		System.out.println("건설합니다");
	}

	public static void main(String[] args) {
		World w = new Country();
		w.structure();
	}
}
