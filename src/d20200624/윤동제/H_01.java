package d20200624.윤동제;


public class H_01 extends H_02 {
	void Viscera() {
		System.out.println("내장중에는 심장이 있다~");
	}

	public static void main(String[] args) {
		H_02 i = new H_02();
		H_02 am = new H_01();
		H_02 very = new H_01();
		
		i.Viscera();
		am.Viscera();
		very.Viscera();
		
	}

}
