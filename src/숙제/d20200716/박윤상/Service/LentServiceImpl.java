package 숙제.d20200716.박윤상.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.member.lib.dao.LentDAO;
import com.member.lib.dao.impl.LentDAOImpl;
import com.member.lib.service.LentService;

public class LentServiceImpl implements LentService {
	private LentDAO lentDAO=new LentDAOImpl();

	
	public Map<String, Object> insertLent(Map<String, Object> lent) {
		Map<String,Object>rMap=new HashMap<>();
		int result=lentDAO.insertLent(lent);
		rMap.put("msg", "빌려주기 완료");
		if(result!=1) {
			rMap.put("msg", "빌려주기 실패");
		}
		rMap.put("cnt", result);
	
		return rMap;
	}

	
	public Map<String, Object> updateLent(Map<String, Object> lent) {
		Map<String,Object>rMap=new HashMap<>();
		int result=lentDAO.updateLent(lent);
		rMap.put("msg", "수정 완료");
		if(result!=1) {
			rMap.put("msg", "수정 오류");
		}
		rMap.put("cnt", result);
		return rMap;
	
	}


	public Map<String, Object> deleteLent(int lNum) {
		Map<String,Object>rMap=new HashMap<>();
		int result=lentDAO.deleteLent(lNum);
		rMap.put("msg", "삭제 완료");
		if(result!=1) {
			rMap.put("msg", "삭제 오류");
		}
		rMap.put("cnt", result);
	
		return rMap;
	}


	public List<Map<String, Object>> selectLentList(Map<String, Object> lent) {
		return lentDAO.selectLentList(lent);
		
	}

	public Map<String, Object> selectLent(int lNum) {
	
		return lentDAO.selectLent(lNum);
	}

}
