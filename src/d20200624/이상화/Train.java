package d20200624.이상화;

public class Train {
	int speed = 80;
	public void trainSpeed(){
		System.out.println("모든기차들의 모임");
	}
	public static void main(String[] args) {
		Ktx tr = new Ktx();
		System.out.println("ktx의 속도 : "+tr.speed);
		Train ktr = new Ktx();
		System.out.println("기차의 속도 : "+ktr.speed);
		
		
	}
}
