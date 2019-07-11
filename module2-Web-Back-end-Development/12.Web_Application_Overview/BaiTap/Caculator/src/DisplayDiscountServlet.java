import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DisplayDiscountServlet", urlPatterns = "/display-discount")
public class DisplayDiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("price"));
        float percent = Float.parseFloat(request.getParameter("percent"));

        float discountAmount = (price * (percent/100))/10;
        float discountPrice = price - discountAmount;
        PrintWriter writer = response.getWriter();

        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1> <br>");
        writer.println("<lable>Product Description : </label>" + product + "<br>");
        writer.println("<label>Price : </label> $" + price + "<br>");
        writer.println("<label>Discount Percent : </label> " + percent +"% <br>");
        writer.println("<label>Discount Amount : </label> $" + discountAmount+ "<br>");
        writer.println("<label>Discount Price : </label> $" + discountPrice+ "<br>");
        writer.println("</html>");
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
