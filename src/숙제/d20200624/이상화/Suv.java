package 숙제.d20200624.이상화;

public class Suv extends Car {
	
	public void carSelect() {
		System.out.println("SUV : "+suvName);
	}
	public static void main(String[] args) {
		Car c = new Car();
		Suv s = new Suv();
		s.suvName = "코나";
		s.carSelect();
		c.carSelect();
		//s.suvColor = "검정";
	}
}
