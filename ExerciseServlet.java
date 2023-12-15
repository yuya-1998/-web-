import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ExerciseServlet")
public class ExerciseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String exercise = request.getParameter("exercise");
        int sets = Integer.parseInt(request.getParameter("sets"));
        int reps = Integer.parseInt(request.getParameter("reps"));
        double weight = Double.parseDouble(request.getParameter("weight"));

        out.println("<html>");
        out.println("<head><title>筋トレ記録</title></head>");
        out.println("<body>");
        out.println("<h1>筋トレ記録</h1>");
        out.println("<p>運動名: " + exercise + "</p>");
        out.println("<p>セット数: " + sets + "</p>");
        out.println("<p>リップ数: " + reps + "</p>");
        out.println("<p>重量: " + weight + " kg</p>");
        out.println("</body>");
        out.println("</html>");

        out.close();
    }
}




