package 숙제.d20200624.장재민;

public class Staff_4 extends Ceo_4{
	
	public void work() {
		
	}
	public static void main(String[] args) {
		
		Staff_4 s = new Staff_4();
		s.work = "일을 시킵니다.";
		System.out.println("사장님은 직원들에게 " + s.work);
	}

}
