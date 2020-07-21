package 숙제.d20200716.박윤상.Service;

import java.util.List;
import java.util.Map;

public interface LentService {
	Map<String,Object> insertLent(Map<String,Object>lent);
	Map<String,Object> updateLent(Map<String,Object>lent);
	Map<String,Object> deleteLent(int lNum);
	List<Map<String,Object>>selectLentList(Map<String,Object>lent);
	Map<String,Object>selectLent(int lNum);


}
