package d20200624.김해성;

class Tv{
	 int ch;
	
		
	public int getCh() {
		return ch;
	}
	
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int chup()	{
		return (ch+1);
	}
	public int chdown()	{
		return (ch-1);
	}
	
}

public class Remote extends Tv{
	
	public int chup()	{
		return ((ch+20));
		
	}
	public int chdown()	{
		return ((ch-3));
	}
	
	public static void main(String[] args) {
		
	
	Remote r = new Remote();
	r.setCh(10);
	System.out.println(r.chup());
	
	
	
}
	}
	
	
