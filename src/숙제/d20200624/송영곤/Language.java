package 숙제.d20200624.송영곤;

public class Language {
	public void type(String a) {
		System.out.println("내 언어는 "+a+"로 되어있어");
	}
	public void country(String b) {
		System.out.println("내 언어는 "+b+"에서 자주쓰여");
	}
	public void nums(int c) {
		System.out.println("내 언어는 "+c+"개의 나라에서 쓰이고 있어");
		
	}

	public static void main(String[] args) {
		English e = new English();
		e.type("영어");
		e.country("미국");
		e.nums(130);

	}

}
