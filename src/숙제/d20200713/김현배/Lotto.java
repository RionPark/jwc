package 숙제.d20200713.김현배;

public class Lotto {

	public static void main(String[] args) {
		LottoNumCreater lNC = new LottoNumCreater();
		NumAutoArray nAA = new NumAutoArray();
		System.out.println(nAA.arrayer(lNC.creater()));	
	}
}