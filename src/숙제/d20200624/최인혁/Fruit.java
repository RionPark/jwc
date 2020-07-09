package 숙제.d20200624.최인혁;

public class Fruit {
	String name;
	int price;
	String taste;

	public Fruit(int price, String taste, String name) {
		this.price = price;
		this.taste = taste;
		this.name = name;
	}



	public String toString() {
		return "Fruit [name="+name+" price=" + price + ",taste=" + taste + "]";

	}
}