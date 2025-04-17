package servlet;

import java.io.IOException;
import java.util.*;
import java.util.Random;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/lottery")
public class Lottery extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Random random = new Random();
		Set<Integer> numbers = new TreeSet<>();
		while (numbers.size()<5) {
			numbers.add(random.nextInt(39)+1);
		}
		//resp.getWriter().print(numbers);
		
		//請求調度器、設定傳送內容、傳送
		RequestDispatcher rd = req.getRequestDispatcher("/Lottery2.jsp");
		req.setAttribute("numbers", numbers);
		rd.forward(req, resp);

	}
}
