package 숙제.d20200624.송영곤;

public class Bus{

	String brand;
	int speed;
	String size;
	public void Brand() {
		brand = "현대";
		System.out.println("내 차는" + brand + "차야");

	}

	public void speed() {
		speed = 80;
		System.out.println("난" + speed + "km만큼 가속할 수 있어");

	}

	public void size() {
		size = "20명";
		System.out.println("승객은" + size + "만큼 가능해");

	}
	
	public static void main(String[] args) {
		Bus b = new Bus();
		b.Brand();
		b.speed();
		b.size();
		Car c = new Car();
		c.Brand();
		c.speed();
		c.size();
		Bike bk = new Bike();
		bk.Brand();
		bk.speed(300);
		bk.size();
		
		
	}

}
