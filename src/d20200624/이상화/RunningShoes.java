package d20200624.이상화;

public class RunningShoes extends Shoes {
	int shoesSize;
	public void collectionShoes(){
		shoesSize=250;
		System.out.println("신발 사이즈는 "+shoesSize+" 입니다");
	}
	public void collectionShoes1(){
		shoesSize=230;
		System.out.println("신발 사이즈는 "+shoesSize+" 입니다");
	}
	
	public static void main(String[] args) {
		Shoes sh = new RunningShoes();
		RunningShoes run = new RunningShoes();
		sh.collectionShoes();
		run.collectionShoes1();
	}
}
