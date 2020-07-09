package 숙제.d20200624.박윤상;

class Car {
	int left;

	public void nums(int left) {
		this.left = left;
	}

	public void carwheel() {
		if (this.left == 4) {
			System.out.println("�¿����Դϴ�");
		}
		if (this.left == 2) {
			System.out.println("���������Դϴ�");
		} else {
			System.out.println("���� �ƴմϴ�");
		}

	}

	static class bus extends Car {
		public void carwheel() {
			if (this.left == 4) {
				System.out.println("�¿����Դϴ�");
			}
			if (this.left == 2) {
				System.out.println("���������Դϴ�");
			} else {
				System.out.println("�����Դϴ�");
			}
		}

		public static void main(String[] args) {
			bus b1 = new bus();
			b1.nums(4);
			b1.carwheel();

			bus b2 = new bus();
			b2.nums(2);
			b2.carwheel();
		}
	}
}
