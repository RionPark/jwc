package 숙제.d20200716.김해성;

import java.util.List;
import java.util.Map;

public interface BookDAO {
	int insertBook(Map<String,Object> book);
	int updateBook(Map<String,Object> book);
	int deleteBook(int bNum);
	List<Map<String,Object>> selectBookList(Map<String,Object> book);
	Map<String,Object> selectBook(int bNum);

}
