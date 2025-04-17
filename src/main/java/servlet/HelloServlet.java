package servlet;

import java.io.IOException;

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
		resp.getWriter().print("Hello JavaServlet!!!");
	}
	
}
