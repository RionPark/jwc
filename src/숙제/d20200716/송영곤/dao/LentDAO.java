package 숙제.d20200716.송영곤.dao;

import java.util.List;
import java.util.Map;

public interface LentDAO {
	int insertMember(Map<String,Object> Lent);
	int updateMember(Map<String,Object> Lent);
	int deleteMember(int lNum);
	List<Map<String,Object>>selectMemberList(Map<String,Object> Lent);
	Map<String,Object> selectMember(int lNum);
	Map<String, Object> selectLent(int lNum);

}
