package 숙제.d20200624.김해성;

public class Car {
	private String drive;
	private String name;
	private int year;
	private float engine;
	private String color;
	
		
	public void car(String drive,String name,int year,float engine, String color)	{
		this.color = color;
		this.name = name;
		this.year = year;
		this.engine = engine;
		this.drive = drive;
			
		}
	
	public String toString()	{
		return name+"  " + year+"  "+engine+"  "+color+"  "+drive;
	}
	
	
	
	}

