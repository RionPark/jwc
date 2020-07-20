package 숙제.d20200716.송영곤.dao;

import java.util.List;
import java.util.Map;

public interface BookDAO {
	int insertBook(Map<String,Object> Book);
	int updateBook(Map<String,Object> Book);
	int deleteBook(int bNum);
	List<Map<String,Object>>selectBookList(Map<String,Object> book);
	Map<String,Object> selectBook(int bNum);
	
	
	
}
