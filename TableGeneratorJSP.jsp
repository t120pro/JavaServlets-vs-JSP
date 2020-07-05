<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Table Generator JSP</title>
	</head>

	<body>
		<h1>Table Generator: Java Servlet Page (JSP)</h1>
		<table>
		<%!protected static String createTable(int row, int col) {
			String html = "";
			for (int i = 1; i < row + 1; i++) {
				html += "\n<tr>";
				for (int j = 1; j < col + 1; j++) {
					String data = "Row" + i + ", Column" + j;
					html += "\n\t<td>" + data + "</td>";
				}
				html += "\n</tr\n>";
			}
			return html;
		}%>
		<%= createTable(25, 10) %>
		</table>
	</body>
</html>
