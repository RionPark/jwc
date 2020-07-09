package 숙제.d20200624.최인혁;

public class BornKnife extends Knife {
	public BornKnife(String category,String purpose) {
		super(category,purpose);
		
		
	}

	public static void main(String[]args) {
		BornKnife b= new BornKnife("본나이프","뼈에 붙어있는 고기를 해체할때");
	System.out.println(b);
	} 
}
