package d20200624.정원영;

public class ElectronicCar extends Car {
	
	public void versin() {
		System.out.println("버전2");
	}
	
	public static void main(String[] args) {
		
		Car c = new ElectronicCar();
		
		c.setFuel("전기");
		c.setWheel(3);
		c.versin();
		
		
		System.out.println(c);
		
		
	}

}
