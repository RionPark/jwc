package d20200624.김해성;

public class Bus extends Car{
	

	public String toString()	{
			return super.toString()+"  GV80버스 출시!!(오버라이딩 테스트)";				
	}
	
	public static void main (String [] args)	{
		Bus b = new Bus();
		b.car("auto","gv80",2020,2.2F,"blue");
	    System.out.print(b.toString());
		
		
		
		
		
		
		
	}

}
