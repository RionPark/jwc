package 숙제.d20200716.김현배.service;

import java.util.List;
import java.util.Map;

public interface MemberService {
	Map<String, Object> doInsertMember(Map<String,Object> member);
	Map<String, Object> doUpdateMember(Map<String,Object> member);
	Map<String, Object> doDeleteMember(int mNum);
	List<Map<String,Object>> doSelectMemberList(Map<String,Object> member);
	Map<String,Object> doSelectMember(int mNum);
}
