package 숙제.d20200716.장재민;

import java.util.List;
import java.util.Map;

public interface BookService {
	
	Map<String,Object> insertBook(Map<String,Object> book);
	Map<String,Object> updateBook(Map<String,Object> book);
	Map<String,Object> deleteBook(int bNum);
	List<Map<String,Object>> selectBookList(Map<String,Object> book);
	Map<String,Object> selectBook(int bNum);

}
