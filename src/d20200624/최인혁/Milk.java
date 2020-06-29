package d20200624.최인혁;

public class Milk {
	String name ;
	String taste ;

	String category;

	Milk(){
		
		String name = "우유";
		String taste = "맛";

		String category = "종류";
	}
	void taste() {
		System.out.println("우유맛이 납니다.");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTaste() {
		return taste;
	}
	public void setTaste(String taste) {
		this.taste = taste;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
}