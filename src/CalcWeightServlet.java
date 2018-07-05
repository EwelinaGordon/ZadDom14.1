import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalcWeightServlet")
public class CalcWeightServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String kilogramy = request.getParameter("kilogramy");
        String gramy = request.getParameter("gramy");
        String miligramy = request.getParameter("miligramy");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html><body><h3>");
        writer.println("Podana wartość w przeliczeniu na: ");
        writer.println("<br>");
        if (kilogramy != "") {
            writer.println("kilogramy: " + Double.parseDouble(kilogramy));
            writer.println("<br>");
            writer.println("gramy: " + Double.parseDouble(kilogramy) *100);
            writer.println("<br>");
            writer.println("miligramy: " + Double.parseDouble(kilogramy) * 1000);
        }
        else if (gramy != ""){
            writer.println("kilo: " + Double.parseDouble(gramy)/100);
            writer.println("<br>");
            writer.println("gramy: " + Double.parseDouble(gramy));
            writer.println("<br>");
            writer.println("miligramy: " + Double.parseDouble(gramy) * 10);
        }
        else if (miligramy != ""){
            writer.println("kilogramy: " + Double.parseDouble(miligramy)/1000);
            writer.println("<br>");
            writer.println("miligramy: " + Double.parseDouble(miligramy)/10);
            writer.println("<br>");
            writer.println("gramy: " + Integer.parseInt(miligramy));
        }
        else writer.println("Podaj miarę do przeliczenia");

        writer.println("<h3><body><html>");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Ten servlet nie obsługuje metody doGet");
    }
}