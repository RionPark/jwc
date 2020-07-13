package 숙제.d20200624.차백송;

public class Car extends Vehicle {
	public void ride() {

		System.out.println("Vroom Vroom~");
	}

	public static void main(String[] args) {
		Vehicle v = new Car();
		v.ride();
	}

}
