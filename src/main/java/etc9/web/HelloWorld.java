package etc9.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloWorld", urlPatterns = { "/HelloWorld" })
public class HelloWorld extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<html><head><title>HelloServlet</title></head>");
        writer.println("<body><h1>Hello Servlet</h1></body>");
        writer.println("</html>");
    }
}
