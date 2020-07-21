package 숙제.d20200716.박윤상.Service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 숙제.d20200716.박윤상.Service.BookService;
import 숙제.d20200716.박윤상.dao.Impl.BookDAO;
import 숙제.d20200716.박윤상.dao.Impl.Impl.BookDAOImpl;

public class BookServiceImpl implements BookService {
	private BookDAO bookDAO=new BookDAOImpl();

	
	public Map<String, Object> insertBook(Map<String, Object>book) {
		Map<String,Object>rMap=new HashMap<>();
		int result=bookDAO.insertBook(book);
		rMap.put("msg",(result==1)?"도서입력 성공!":"도서입력 실패");
		rMap.put("cnt", result);
	
		return rMap;
	}

	
	public Map<String, Object> updateBook(Map<String, Object> book) {
		Map<String,Object>rMap=new HashMap<>();
		int result=bookDAO.updateBook(book);
		rMap.put("msg",(result==1)?"도서업그레이드 성공!":"도서업그래이드 실패");
		rMap.put("cnt",result);
	
		return rMap;
	}


	public Map<String, Object> deleteBook(int bNum) {
		Map<String,Object>rMap=new HashMap<>();
		int result=bookDAO.deleteBook(bNum);
		rMap.put("msg",(result==1)?"도서삭제 완료":"도서삭제 실패");
		rMap.put("cnt", result);
		return rMap;
	}


	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		return bookDAO.selectBookList(book);
	
	}

	
	public Map<String, Object> selectBook(int bNum) {
		return bookDAO.selectBook(bNum);
		
	}
	public static void main(String[] args) {
		BookService bookService=new BookServiceImpl();
		Map<String,Object>map=new HashMap<>();
		map.put("b_title", "아이고 머리야");
		map.put("b_autor", "견본");
		map.put("b_desc", "머리아플떄 보쇼");
		System.out.println(bookService.insertBook(map));
	}

}
