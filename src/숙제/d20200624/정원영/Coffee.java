package 숙제.d20200624.정원영;

public class Coffee {
	private String name;
	private int price;
	private String type;
	
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + ", type=" + type + "]";
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
