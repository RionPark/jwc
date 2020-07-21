package 숙제.d20200716.박윤상.Service.Impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.MemberDAO;
import com.member.lib.dao.impl.MemberDAOImpl;
import com.member.lib.service.MemberService;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO memberDAO=new MemberDAOImpl();


	public Map<String, Object> insertMember(Map<String, Object> member) {
		int result=memberDAO.insertMember(member);
		Map<String, Object>rMap=new HashMap<>();
		rMap.put("msg", "멤버등록 완료");
		if(result!=1) {
			rMap.put("msg", "멤버등록 오류");
		}
		rMap.put("cnt", result);
		return rMap;
		
	}

	
	public Map<String, Object> updateMember(Map<String, Object> member) {
		int result=memberDAO.updateMember(member);
		Map<String, Object>rMap=new HashMap<>();
		rMap.put("msg", "멤버수정 완료");
		if(result!=1) {
			rMap.put("msg", "멤버수정 오류");
		}
		rMap.put("cnt", result);
		return rMap;
	}


	public Map<String, Object> delectMember(int mNum) {
		int result=memberDAO.delectMember(mNum);
		Map<String, Object>rMap=new HashMap<>();
		rMap.put("msg", "멤버삭제 완료");
		if(result!=1) {
			rMap.put("msg", "멤버삭제 오류");
		}
		rMap.put("cnt", result);
		return rMap;
	}

	
	public List<Map<String, Object>> selectMemberList(Map<String, Object> member) {
		return memberDAO.selectMemberList(member);
	}

	
	public Map<String, Object> selectMember(int mNum) {
		return memberDAO.selectMember(mNum);
	}
	public static void main(String[] args) {
		MemberService memberService=new MemberServiceImpl();
		//Map<String,Object>rMap=memberService.delectMember(25);
		//System.out.println(rMap);
		Map<String,Object>member=new HashMap<>();
		member.put("m_num", 21);
		member.put("m_name", "000");
		member.put("m_id", "121");
		member.put("m_pwd", "1ㅅㄴㅅㄴ");
	    Map<String,Object> rMap=memberService.updateMember(member);
	     
		System.out.println(rMap);
	//	List<Map<String,Object>>memberList=memberService.selectMemberList(member);
	//	for(Map<String,Object>mem:memberList) {
	//		System.out.println(mem);
			
		}
		
	}


