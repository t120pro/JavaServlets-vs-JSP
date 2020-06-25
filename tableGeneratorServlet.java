import java.io.*;

import javax.servlet.*;
import javax.servlet.annotation.*;
import javax.servlet.http.*;

@WebServlet("/tablegeneratorservlet")
public class tableGeneratorServlet extends HttpServlet {

	private static String createTable(int row, int col) {
		String html = "<table>\n";
		for (int i = 1; i < row + 1; i++) {
			html += "\n<tr>";
			for (int j = 1; j < col + 1; j++) {
				String data = "Row" + i + ", Column" + j;
				html += "\n\t<td>" + data + "</td>";
			}
			html += "\n</tr>";
		}
		return html;
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>\n" + "<html lang = \"en\">\n" + "<head>\n<title>Table Generator</title>\n" 
		+ "<body>\n<h1>Table Generator: Java Servlet</h1>\n</head>\n" + createTable(25, 10)  + "</table>\n</body>\n</html>");
	}
}
