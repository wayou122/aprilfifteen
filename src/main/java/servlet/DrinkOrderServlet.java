package servlet;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.DrinkOrder;

import java.io.IOException;

@WebServlet("/DrinkOrder")
public class DrinkOrderServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String type = request.getParameter("type");
		String size = request.getParameter("size");
		String ice = request.getParameter("ice");
		
		DrinkOrder drinkorder = new DrinkOrder(type,size,ice);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/drink_order.jsp");
		request.setAttribute("drink",drinkorder);
		rd.forward(request, response);
		
	}
}
