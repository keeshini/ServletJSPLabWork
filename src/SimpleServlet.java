import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * Created by kemaniva on 7/19/2016.
 */
@WebServlet("/home")
public class SimpleServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().write("Hello");
        resp.getWriter().write(LocalDateTime.now().toString());
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userid");
        if (name!=null || name!=""){
            resp.getWriter().printf("Welcome %s", name);
        }else{
            resp.getWriter().print("Enter valid name and password");
        }
    }
}
