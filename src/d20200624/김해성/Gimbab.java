package d20200624.김해성;
class Food	{
	protected String name1 = "김밥";
	protected String name2 = "라면";
	int num1;
	int num2;
	void eat()	{
	System.out.println(name1+"  "+num1+"  개,  "+name2+" "+num2+"개  주문중");
	}
	
}


public class Gimbab extends Food{
	String name3 = "삼각김밥";
	int num3;
	void eat()	{
		System.out.println(name1+"  "+num1+"  개,  "+name2+"  "+num2+"개   " +name3+"   "+num3+"개  지금나가요!"+"맛있게 드세요");
		}
	
public static void main (String[] args)	{
	Gimbab g = new Gimbab();
	Food f = new Food();
	f=g;
	f.num1 =4;
	f.num2 =1;
	
		
	g.num3 =3;
	
	
	
	g.eat();
}

}