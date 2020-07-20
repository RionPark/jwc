package 숙제.d20200716.김현배.service;

import java.util.List;
import java.util.Map;

public interface BookService {
	Map<String, Object> doInsertBook(Map<String,Object> book);
	Map<String, Object> doUpdateBook(Map<String,Object> book);
	Map<String, Object> doDeleteBook(int bNum);
	List<Map<String,Object>> doSelectBookList(Map<String,Object> book);
	Map<String,Object> doSelectBook(int bNum);
}
