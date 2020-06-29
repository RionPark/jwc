package d20200624.박윤상;

class Avg extends Math{
	
	public void sum() {
		System.out.println(this.left+this.right);
	}
	public void sub() {
		System.out.println(this.left-this.right);
	}
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
	
	
	
	
	
	public static void main(String[]args) {
		Avg a1=new Avg();
		a1.nums(8, 4);
		a1.sub();
		a1.sum();
		a1.avg();
	}
	

}
