package 숙제.d20200716.장재민.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.BookDAO;
import com.member.lib.dao.impl.BookDAOImpl;
import com.member.lib.service.BookService;

public class BookServiceImpl implements BookService {
	
	private BookDAO bookDAO = new BookDAOImpl();	
	@Override
	public Map<String, Object> insertBook(Map<String, Object> book) {
		int result = bookDAO.insertBook(book);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"도서입력 성공~":"도서입력 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> updateBook(Map<String, Object> book) {
		int result = bookDAO.updateBook(book);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"도서 업데이트 성공~":"업데이트 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> deleteBook(int bNum) {
		int result = bookDAO.deleteBook(bNum);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", (result==1)?"도서삭제 성공~":"도서삭제 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> selectBookList(Map<String, Object> book) {
		return bookDAO.selectBookList(book);
	}

	@Override
	public Map<String, Object> selectBook(int bNum) {
		return bookDAO.selectBook(bNum);
	}
	public static void main(String[] args) {
		BookService bookService = new BookServiceImpl();
		Map<String,Object> map = new HashMap<>();
//		map.put("b_tile", "컴퓨터활용능력");
//		map.put("b_author", "견본");
//		map.put("b_desc", "시험용");
//		System.out.println(bookService.insertBook(map));
		
//		map.put("b_tile", "컴퓨터활용능력1");
//		map.put("b_author", "견본1");
//		map.put("b_desc", "시험용1");
//		map.put("b_num", 41);
//		System.out.println(bookService.updateBook(map));
		
//		System.out.println(bookService.deleteBook(41));
		
//		List<Map<String,Object>> bookList = bookService.selectBookList(map);
//		for(Map<String,Object> mem:bookList) {
//			System.out.println(mem);
//		}
		
		System.out.println(bookService.selectBook(1));
		
	}
}
