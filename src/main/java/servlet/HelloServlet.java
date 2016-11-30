package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URI;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "MyServlet", urlPatterns = { "/hello" })
public class HelloServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/*
		 * ServletOutputStream out = resp.getOutputStream();
		 * out.write("Nguyen Viet Luan".getBytes()); out.flush(); out.close();
		 */
		/*
		 * PrintWriter out = response.getWriter();
		 * response.setContentType("text/html");
		 * out.println("<H1>Hello from a Servlet - Nguyen Viet Luan</h2>");
		 * out.println("<P>This servlet ran at "); out.println(new
		 * Date().toString());
		 * out.println("<P>Courtesy of HelloServlet.java 1.2 ");
		 */
		Connection conn = null;
		ResultSet result = null;
		Statement stmt = null;
		PrintWriter out = response.getWriter();
		try {
			URI dbUri = new URI(System.getenv("DATABASE_URL"));
			String username = dbUri.getUserInfo().split(":")[0];
			String password = dbUri.getUserInfo().split(":")[1];
			String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();

			
			out.write("<p>" + dbUrl + "</p>");
			out.write("<p>" + username + "</p>");
			out.write("<p>" + password + "</p>");
			conn = DriverManager.getConnection(dbUrl, username, password);
			stmt = conn.createStatement();

			result = stmt.executeQuery("SELECT now()");
			if (result.next()) {

				out.write("<p>" + result.getString(1) + "</p>");
			}

			result.close();
			stmt.close();
			conn.close();
		} catch (Exception e) {
			out.write("<p>" + e + "</p>");
		}
	}

}
