package 숙제.d20200624.김해성;

import java.util.ArrayList;
import java.util.List;

class Asia	{
	public long asiaPeople;
	public String asiaNum;
	
	public void report()	{
		System.out.println("세계는 하나!" );
	}
}


public class Korea extends Asia{
	public String kName;
	public int kNum;
	
	public void report()	{
		super.report();
		System.out.println("아시아 인구"+ asiaPeople+ "아시아국가수 : "+ asiaNum );
		System.out.println("나라이름"+ kName+ "인구: "+ kNum );
	}
	
	public static void main (String[] args)	{
	
	
	Asia a = new Asia();
	Korea k = new Korea();


	
	k.asiaPeople = 4_400_000_000L;
	k.asiaNum = " 46개국";
	k.kName = "한국";
	k.kNum = 51_000_000;
	a.report();
	k.report();
	
	}
}
