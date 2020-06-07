import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SimpleCalculator", urlPatterns = "/calculator")
public class SimpleCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float so1 = Float.parseFloat(request.getParameter("FirstOperand"));
        float so2 = Float.parseFloat(request.getParameter("SecondOperand"));
        String phuongthuc = request.getParameter("pheptinh");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("result is: " + calculate(so1,so2,phuongthuc));
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public float calculate(float param1,float param2,String phuongthuc){
        float res=0;

        switch (phuongthuc){
            case "PhepCong":
                res = param1+param2;
                return res;
            case "PhepTru":
                res = param1-param2;
                return res;
            case "PhepNhan":
                res = param1*param2;
                return res;
            case "PhepChia":
                res = param1/param2;
                return res;
            default:
                break;
        };
        return res;
    };
}
