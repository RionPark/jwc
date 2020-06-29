package d20200624.정원영;

public class Icecream {
	private String taste;
	private String type;
	
	public void caution() {
		System.out.println("개맛있음");
	}

	public String toString() {
		return "아이스크림 종류: "+type+", 맛 : " + taste;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setTaste(String taste) {
		this.taste = taste;
	}
	
	
	public String getType() {
		return type;
	}
	public String getTaste() {
		return taste;
	}
	
}
