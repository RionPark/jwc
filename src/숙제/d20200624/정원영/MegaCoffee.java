package 숙제.d20200624.정원영;

public class MegaCoffee extends Coffee {
	
	public String getName() {
		
		return "Mega";
	}
	
	public static void main(String[] args) {
		
		Coffee c = new MegaCoffee();
		
		System.out.println(c.getName());
	}

}
