package d20200624.이상화;

public class Mart {
	int martCount = 800;
	public void martObject() {
		System.out.println("마트전체 : "+martCount);
	}
	public static void main(String[] args) {
		E_Mart em = new E_Mart();
		Mart ma = new Mart();
		ma.martObject();
		em.martObject();
		//System.out.println(em.brand);
	}
}
