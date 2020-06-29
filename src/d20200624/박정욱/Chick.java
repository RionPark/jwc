package d20200624.박정욱;
class Chicken{
	 int weight;
		
		void big() {
			System.out.println(weight);
		}
}
public class Chick extends Chicken {
	void big() {
		System.out.println(weight+"g");	
		}
	public static void main(String[] args) {
		Chick c = new Chick();
		
		c.weight = 30;
		
		c.big();
	}
}