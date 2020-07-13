package 숙제.d20200624.윤동제;

public class H_11 extends H_10{
	public String Rifle() {
		return "돌격 소총";
	}
	public static void main(String[] args) {
		H_09 work = new H_09();
		System.out.print(work.Rifle());
		
		H_10 f = new H_10();
		System.out.print(f.Rifle());
		
		H_11 in = new H_11();
		System.out.print(in.Rifle());
		
		work.HandGun();
		System.out.print("\n"+work.HandGun());
		f.HandGun();
		System.out.print(f.HandGun());
		
		H_09 al = new H_11();
		System.out.println("\n"+al.Rifle());
		H_10 ly = new H_11();
		System.out.println(ly.Rifle());
		System.out.print(in.Rifle());
	}

}
