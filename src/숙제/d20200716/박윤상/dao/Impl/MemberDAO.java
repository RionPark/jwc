package 숙제.d20200716.박윤상.dao.Impl;

import java.util.List;
import java.util.Map;

public interface MemberDAO {
	int insertMember(Map<String,Object>member);
	int updateMember(Map<String,Object>member);
	int delectMember(int mNum);
	List<Map<String,Object>>selectMemberList(Map<String,Object>member);
	Map<String,Object>selectMember(int mNum);
	

}
