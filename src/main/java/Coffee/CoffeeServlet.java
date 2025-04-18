package Coffee;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.CoffeeOrder;

@WebServlet("/Coffee")
public class CoffeeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");
		PrintWriter pw = resp.getWriter();
		String type = req.getParameter("type");
		String size = req.getParameter("size");
		String sugar = req.getParameter("sugar");

		if (type == null || size == null || sugar == null) {
			pw.print("輸入錯誤喔 :D");
			return;
		}
		CoffeeOrder coffee = new CoffeeOrder(type, size, sugar);
		//pw.print(msg);
		RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/coffee_order.jsp");
		req.setAttribute("coffeeOrder",coffee);
		rd.forward(req, resp);

	}

}
