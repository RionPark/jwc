package d20200624.장재민;

public class Bus_1 extends Car_1 {
	
	
	public void type() {
		
	}
    public static void main(String [] args) {
		
		Bus_1 b = new Bus_1();
		b.type = "버스";
		System.out.println("차종은 " + b.type + " 입니다.");
	}
}


