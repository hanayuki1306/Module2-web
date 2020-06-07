import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculateDiscount",urlPatterns = "/calculate")
public class CalculateDiscount extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Description = request.getParameter("PD");
        Double ListPrice = Double.parseDouble(request.getParameter("LP"));
        Double Discount = Double.parseDouble(request.getParameter("DP"));

//        Discount Amount = List Price * Discount Percent * 0.1
        double Amount = ListPrice * Discount * 0.01;
        double res = ListPrice - Amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");

        writer.println("Description: " + Description+ "<br>" );
        writer.println("Discount Amount: " + Discount+ "<br>");
        writer.println("Discount Price:" + res+ "<br>" );

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
