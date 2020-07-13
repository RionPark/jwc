package 숙제.d20200624.이상화;

public class Book extends BookStore {
	public void book(){
		/**아오 이거 내파일일건데~~**/
		System.out.println("책이름 : "+bookName+"\r책가격 : "+bookPrice+"\r저자 :"+writer+"\r");
	}
	
	public static void main(String[] args) {
		BookStore b = new Book();
		Book bs = new Book();
		b.bookName = "개미";
		b.bookPrice = 32000;
		b.writer = "베르나르베르베르";
//		b.book();
//		bs.book();
		BookStore ad = (Book) bs;
		
		ad.book();

	}

}
