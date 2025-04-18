package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/BMI")
public class BMIServlet extends HttpServlet {

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html;charset=utf-8");

		PrintWriter pw = resp.getWriter();
		String h = req.getParameter("h");
		String w = req.getParameter("w");
		if (isNumber(h, w)) {
			double height = Double.parseDouble(h) / 100;
			int weight = Integer.parseInt(w);
			double bmi = weight / height / height;
			String fit = testBMI(bmi);
			pw.printf("你的BMI是%.2f（%s）。", bmi, fit);
			pw.write("<br>");
			pw.printf("Your BMI is %.2f (%s).", bmi, fit);
		} else {
			pw.printf("你的輸入不是數字。");
			pw.printf("Your Numbers are wrongs.");
		}
	}

	private boolean isNumber(String h, String w) {
		try {
			Integer.parseInt(h);
			Integer.parseInt(w);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	private String testBMI(Double bmi) {
		return bmi <18.5 ? "Thin" : (bmi>24 ? "Fat":"Normal");
	}

}
