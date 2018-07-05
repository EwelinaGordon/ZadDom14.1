import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/CalcMeterServlet")
public class CalcMeterServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String meter = request.getParameter("metry");
        String centimeter = request.getParameter("centymetry");
        String milimeter = request.getParameter("milimetry");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html");
        PrintWriter writer = response.getWriter();

        writer.println("<html><body><h3>");
        writer.println("Podana wartość w przeliczeniu na: ");
        writer.println("<br>");
        if (meter != "") {
            writer.println("metry: " + Double.parseDouble(meter));
            writer.println("<br>");
            writer.println("centymetry: " + Double.parseDouble(meter) *100);
            writer.println("<br>");
            writer.println("milimetry: " + Double.parseDouble(meter) * 1000);
        }
        else if (centimeter != ""){
            writer.println("metry: " + Double.parseDouble(centimeter)/100);
            writer.println("<br>");
            writer.println("centymetry: " + Double.parseDouble(centimeter));
            writer.println("<br>");
            writer.println("milimetry: " + Double.parseDouble(centimeter) * 10);
        }
        else if (milimeter != ""){
            writer.println("metry: " + Double.parseDouble(milimeter)/1000);
            writer.println("<br>");
            writer.println("centymetry: " + Double.parseDouble(milimeter)/10);
            writer.println("<br>");
            writer.println("milimetry: " + Integer.parseInt(milimeter));
        }
        else writer.println("Podaj miarę do przeliczenia");

        writer.println("<h3><body><html>");
        }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();
        writer.println("Ten servlet nie obsługuje metody doGet");
    }
}
