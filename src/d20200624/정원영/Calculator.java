package d20200624.정원영;

public class Calculator {
	private String name;
	private int result;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public int plus(int x, int y) {
		result = x+y;
		return result;
	}

	public int minus(int x, int y) {
		result = x-y;
		return result;
	}

}
