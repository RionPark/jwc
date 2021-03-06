package 숙제.d20200716.정원영.homework.com.member.lib.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 숙제.d20200716.정원영.homework.com.member.lib.dao.BookDAO;
import 숙제.d20200716.정원영.homework.com.member.lib.dao.impl.BookDAOImpl;
import 숙제.d20200716.정원영.homework.com.member.lib.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO = new BookDAOImpl();
	
	public Map<String, Object> insertBook(Map<String, Object> book) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.insertBook(book);
		
		rMap.put("msg", (result !=1)?"도서입력 실패":"도서입력 성공");
		rMap.put("cnt", result);
		return rMap;
	}

	public Map<String, Object> updateBook(Map<String, Object> book) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.updateBook(book);
		
		rMap.put("msg", (result !=1)?"도서변경 실패":"도서변경 성공");
		rMap.put("cnt", result);
		return rMap;
	}

	public Map<String, Object> deleteBook(int bNum) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.deleteBook(bNum);
		
		rMap.put("msg", (result !=1)?"도서삭제 실패":"도서삭제 성공");
		rMap.put("cnt", result);
		return rMap;
	}

	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		List<Map<String, Object>> rList = new ArrayList<Map<String, Object>>();
		
		return null;
	}

	public Map<String, Object> selectBook(int bNum) {
		
		return bookDAO.selectBook(bNum);
	}
	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		Map<String, Object> map = new HashMap<>();
		map.put("b_title","컴퓨터");
		map.put("b_author","컴퓨터");
		map.put("b_desc","컴퓨터");
		System.out.println(bookService.insertBook(map));
		
		
	}

}
