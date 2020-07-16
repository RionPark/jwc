package 숙제.d20200716.김해성;

import java.util.List;
import java.util.Map;

public interface MemberDAO {
		int insertMember(Map<String,Object> member);
		int updateMember(Map<String,Object> member);
		int deleteMember(int m_num);
		List<Map<String,Object>> selectMemberList(Map<String,Object> member);
		Map<String,Object> seleteMemberList(int m_num);
		
}
