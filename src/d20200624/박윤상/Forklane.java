package d20200624.박윤상;


class Forklane extends Crane{
	public void stability() {
		for(int i=1;i<5;i++) {
			for(int k=1;k<5;k++) {
				System.out.println("ũ���κ�"+i+"��"+"����"+k+"��");
			}
		}System.out.println("ũ���� ����");
		
		
	}
	
	
	
	
	public static void main(String[]args) {
		Forklane f1=new Forklane();
		f1.ton(5);
		f1.stability();
		
	}

}
