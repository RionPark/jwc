package 숙제.d20200716.김현배.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 숙제.d20200716.김현배.dao.BookDAO;
import 숙제.d20200716.김현배.dao.impl.BookDAOImpl;
import 숙제.d20200716.김현배.service.BookService;


public class BookServiceImpl implements BookService {
	private BookDAO bookDAO = new BookDAOImpl();
	@Override
	public Map<String, Object> doInsertBook(Map<String, Object> book) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.insertBook(book);
		rMap.put("msg", (result==1)?"도서 입력 성공":"도서 입력 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> doUpdateBook(Map<String, Object> book) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.updateBook(book);
		rMap.put("msg", (result==1)?"도서 수정 성공!":"도서 수정 실패!");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> doDeleteBook(int bNum) {
		Map<String, Object> rMap = new HashMap<>();
		int result = bookDAO.deleteBook(bNum);
		rMap.put("msg", (result==1)?"도서 삭제 성공":"도서 삭제 실패");
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> doSelectBookList(Map<String, Object> book) {
		return bookDAO.selectBookList(book);
	}

	@Override
	public Map<String, Object> doSelectBook(int bNum) {
		return bookDAO.selectBook(bNum);
	}

	public static void main(String[] args) {
//		BookService bookService = new BookServiceImpl();
		
//		Map<String,Object> map = new HashMap<>();
//		map.put("b_title", "데미안");
//		map.put("b_author", "헤르만 헤세");
//		map.put("b_desc", "이건 너무한거아니냐고!");
//		System.out.println(bookService.doInsertBook(map));
//		
//		Map<String,Object> map = new HashMap<>();
//		map.put("b_title", "데미안");
//		map.put("b_author", "헤르만 헤세");
//		map.put("b_desc", "이건 너무한거아니냐고!_ㅠㅠ");
//		map.put("b_num", 81);
//		System.out.println(bookService.doUpdateBook(map));
		
//		System.out.println(bookService.doDeleteBook(81));
		
//		Map<String,Object> map = new HashMap<>();
//		System.out.println(bookService.doSelectBookList(map));
		
//		System.out.println(bookService.doSelectBook(81));
		
	}
}
