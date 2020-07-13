package 숙제.d20200624.박정욱;




class King{
	 String crown;
		
		void kingdom() {
			System.out.println(crown);
		}
		
}
public class Prince extends King {
	void kingdom() {
		System.out.println(crown);
	}
	
	public static void main(String[] args) {
	Prince p = new Prince();
	
	p.crown = "gold";	
	
	p.kingdom();
		
	

}}