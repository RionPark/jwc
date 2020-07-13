package 숙제.d20200624.정원영;

public class Bike {
	
	private String power;
	private int maxSpeed;
	private int minSpeed;
	
	public int limit() {
		
		System.out.println("제안속도를 40으로 설정합니다.");
		
		return 40;
	}
	
	public String toString() {
		return power + maxSpeed + minSpeed;
	}
	
	
	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	public void setMinSpeed(int minSpeed) {
		this.minSpeed = minSpeed;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public int getMaxSpeed() {
		return maxSpeed;
	}
	public int getMinSpeed() {
		return minSpeed;
	}
	public String getPower() {
		return power;
	}
	

}
