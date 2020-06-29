package d20200624.정원영;

public class Car {

	private int wheel;
	private String fuel;
	
	public void versin() {
		System.out.println("버전1");
	}

	public String toString() {
		return "바퀴 갯수: "+wheel+", 사용 연료 : " + fuel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}
	
	
	public int getWheel() {
		return wheel;
	}
	public String getFuel() {
		return fuel;
	}
	
	

}
