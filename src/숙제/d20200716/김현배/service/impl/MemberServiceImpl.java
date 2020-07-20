package 숙제.d20200716.김현배.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import 숙제.d20200716.김현배.dao.MemberDAO;
import 숙제.d20200716.김현배.dao.impl.MemberDAOImpl;
import 숙제.d20200716.김현배.service.MemberService;


public class MemberServiceImpl implements MemberService {
	private MemberDAO memberDAO = new MemberDAOImpl();

	@Override
	public Map<String, Object> doInsertMember(Map<String, Object> member) {
		int result = memberDAO.insertMember(member);
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", "멤버 등록 완료!");
		if (result != 1) {
			rMap.put("msg", "멤버 등록 오류!");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> doUpdateMember(Map<String, Object> member) {
		int result = memberDAO.updateMember(member);
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", "멤버 수정 완료!");
		if (result != 1) {
			rMap.put("msg", "멤버 수정 오류!");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> doDeleteMember(int mNum) {
		int result = memberDAO.deleteMember(mNum);
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", "멤버 삭제 완료!");
		if (result != 1) {
			rMap.put("msg", "멤버 삭제 오류!");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> doSelectMemberList(Map<String, Object> member) {
		return memberDAO.selectMemberList(member);
	}

	@Override
	public Map<String, Object> doSelectMember(int mNum) {
		return memberDAO.selectMember(mNum);
	}

	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		
//		Map<String,Object> rMap = memberService.doDeleteMember(43);
//		System.out.println(rMap); 
		
		Map<String, Object> rMap = new HashMap<>();
//		rMap.put("m_name", "기면배");
//		rMap.put("m_id", "긔묜배");
//		rMap.put("m_pwd", "1234");
//		Map<String,Object> map = memberService.doInsertMember(rMap);
//		System.out.println(map);
		
//		List<Map<String,Object>> mList = new ArrayList<>();
//		mList = memberService.doSelectMemberList(rMap);
//		for(Map<String,Object> mem:mList) {
//			System.out.println(mem);
//		}
		
		Map<String,Object> map =  memberService.doSelectMember(12);
		System.out.println(map);
		
	}
}
