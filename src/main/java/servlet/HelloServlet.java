package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

// 瀏覽器透過 http://localhost:8080/JavaWeb/hello 執行此Servlet程式
@WebServlet("/hello")
//@WebServlet(urlPatterns ="/hello") //標準寫法
// 多個網址連到同一個網站
//@WebServlet(urlPatterns={"/hello","/welcome"})
public class HelloServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//設定編碼
		//resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		
		PrintWriter pw = resp.getWriter();
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		pw.print("Hello! 你好 ".concat(name));
		if (isNumber(age)) { 
			String msg = Integer.parseInt(age)>18 ? "adult":"child";
			pw.printf("%nYou are %s.(%s)",age,msg);
		}
	}
	private boolean isNumber(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(Exception e){
			return false;
		}
	}
}
