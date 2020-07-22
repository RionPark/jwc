package 숙제.d20200716.장재민.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.service.MemberService;

import 숙제.d20200716.차백송.com.member.lib.dao.MemberDAO;
import 차백송.com.member.lib.dao.impl.MemberDAOImpl;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO memberDAO = new MemberDAOImpl();
	@Override
	public Map<String, Object> insertMember(Map<String, Object> member) {
		int result = memberDAO.insertMember(member);
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", "멤버등록 완료~");
		if(result!=1) {
			rMap.put("msg", "멤버등록 오류!");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> updateMember(Map<String, Object> member) {
		int result = memberDAO.updateMember(member);
		Map<String,Object> rMap = new HashMap<>();
		rMap.put("msg", "업데이트 완료~");
		if(result!=1) {
			rMap.put("msg", "업데이트 오류!");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public Map<String, Object> deleteMember(int mNum) {
		int result = memberDAO.deleteMember(mNum);
		Map<String, Object> rMap = new HashMap<>();
		rMap.put("msg", "멤버삭제 완료~");
		if(result!=1) {
			rMap.put("msg", "멤버삭제 오류!");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	@Override
	public List<Map<String, Object>> selectMemberList(Map<String, Object> member) {
		return memberDAO.selectMemberList(member);
	}

	@Override
	public Map<String, Object> selectMember(int mNum) {
		return memberDAO.selectMember(mNum);
	}
	public static void main(String[] args) {
		MemberService memberService = new MemberServiceImpl();
		Map<String,Object> member = new HashMap<>();
//		member.put("m_name", "재민");
//		member.put("m_id", "그냥");
//		member.put("m_pwd", "1234");
//		Map<String,Object> rMap = memberService.insertMember(member);
//		System.out.println(rMap);		
		
		member.put("m_name", "토리");
		member.put("m_id", "그냥1");
		member.put("m_pwd", "1234");
		member.put("m_num", 21);
		Map<String,Object> rMap = memberService.updateMember(member);
		System.out.println(rMap);				

//		Map<String,Object> rMap = memberService.deleteMember(28);
//		System.out.println(rMap);		
		
//		List<Map<String,Object>> memberList = memberService.selectMemberList(member);
//		for(Map<String,Object> mem:memberList) {
//			System.out.println(mem);
//		}
//		System.out.println(memberService.selectMember(21));
		
	}
}
