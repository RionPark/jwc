package 숙제.d20200624.박윤상;

public class Dog extends Animal {
	public void nums() {
		if (this.i == 4) {
			System.out.println("��������");
		}
		if (i < 4) {
			System.out.println("���� ��������");
		} if(i>=5){
			System.out.println("�������� �ƴϴ� �ٸ������̴�");
		}

	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.add(5);
		d1.nums();
	}

}
