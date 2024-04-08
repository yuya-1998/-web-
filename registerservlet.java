import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/registerservlet") //マッピング名の指定
public class ExerciseServlet extends HttpServlet {　　//HttpServlet クラスを継承
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {　
        response.setContentType("text/html;charset=UTF-8");　//コンテンツタイプ指定
        PrintWriter out = response.getWriter();　　//PrintWriterを取得

        String exercise = request.getParameter("exercise");　　//エクササイズの名前の入力
        int sets = Integer.parseInt(request.getParameter("sets"));　　//エクササイズのセット数の入力
        int reps = Integer.parseInt(request.getParameter("reps"));　　//エクササイズ動作の回数の入力
        double weight = Double.parseDouble(request.getParameter("weight"));　　//エクササイズに使用した重さの入力

        out.println("<html>");　//PrintWriterを取得
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




