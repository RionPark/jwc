package 과정평가.t6_화면구현.엄성용;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

@WebServlet("/ajax/user")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Gson gson = new Gson();
       
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json; charset=utf-8");
		BufferedReader br = request.getReader();
		String str;
		StringBuffer sb = new StringBuffer();
		while ((str = br.readLine()) != null) {
			sb.append(str);
		}
		Map<String,Object> map = gson.fromJson(sb.toString(), Map.class);
		if("login".equals(map.get("cmd"))) {
			if("test".equals(map.get("uiId"))) {
				if("test".equals(map.get("uiPassword"))) {
					map.put("result", true);
				}
			}
			
		}
		PrintWriter pw = response.getWriter();
		System.out.println(gson.toJson(map));
		pw.print(gson.toJson(map));
	}
}


