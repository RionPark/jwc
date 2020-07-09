package 숙제.d20200624.최인혁;

public class Orange extends Fruit {
 
	
	public Orange(String name,int price, String taste) {
		super(price,name, taste);
		
	}

	public static void main(String[]args) {
	Orange o= new Orange("새콤달콤",3000,"오렌지");
	System.out.println(o);
	}

}
