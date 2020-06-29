package d20200624.송영곤;

public class School {
	public void Name(String name) {
		System.out.println("내가 근무하는 학교는 "+name+"이야");
	}
	
	public void Money(String money) {
		System.out.println("나의 연봉은 " +money+"만원 이야");
	}
	
	public static void main(String[] args) {
		Teacher t = new Teacher();
		t.Name("강화초등학교");
		t.Money(4000);
		
	}

}
