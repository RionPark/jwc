package d20200624.윤동제;


public class H_03 extends H_04 {
	public void BuildingType() {
		System.out.println("나는 단독주택");
	}
	public static void main(String[] args) {
		H_04 ti = new H_04();
		H_04 red = new H_03();
		H_03 now = new H_03();
		
		ti.BuildingType();
		red.BuildingType();
		now.BuildingType();
	}
}