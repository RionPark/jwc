package 숙제.d20200624.최인혁;

public class DdalkiMilk extends Milk {

	DdalkiMilk() {
		String category = "Ddalki";
		
	}

	void taste() {
		System.out.println("딸기 맛이 나용");
	}

	public static void main(String[] args) {
		

		Milk d = new Milk();
		d.taste();
		Milk d1 = new DdalkiMilk();
		d1.taste();
	}

}
