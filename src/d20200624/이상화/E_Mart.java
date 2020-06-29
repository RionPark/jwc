package d20200624.이상화;

public class E_Mart extends Mart {
	private String brand="NoBrand";
	int martCount = 100;
	public void martObject() {
		System.out.println("이마트 매장수 : "+martCount);
		System.out.println("이마트 브랜드 : "+brand);
	}
}
