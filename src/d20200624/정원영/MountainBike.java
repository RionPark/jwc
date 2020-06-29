package d20200624.정원영;

public class MountainBike extends Bike {

	public int limit() {

		System.out.println("제안속도를 80으로 설정합니다.");

		return 80;
	}
	
	public static void main(String[] args) {
		Bike b = new MountainBike(); 
		
		
	}

}
