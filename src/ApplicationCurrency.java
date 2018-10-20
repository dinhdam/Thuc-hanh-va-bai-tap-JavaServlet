import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet(name="ApplicationCurrency", urlPatterns = "/ApplicationCurrency")

public class ApplicationCurrency extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

        float rate = Float.parseFloat(request.getParameter("rate"));
        float usd = Float.parseFloat(request.getParameter("usd"));
        float vnd = rate * usd;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>rate" + rate + "<h1>");
        writer.println("<h1>usd" + usd + "<h1>");
        writer.println("<h1>vnd" + vnd + "<h1>");
        writer.println("</html>");
    }
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

}
