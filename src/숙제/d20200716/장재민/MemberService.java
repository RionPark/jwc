package 숙제.d20200716.장재민;

import java.util.List;
import java.util.Map;

public interface MemberService {
	
	Map<String,Object> insertMember(Map<String,Object> member);
	Map<String,Object> updateMember(Map<String,Object> member);
	Map<String,Object> deleteMember(int mNum);
	List<Map<String,Object>> selectMemberList(Map<String,Object> member);
	Map<String,Object> selectMember(int mNum);
	
}
