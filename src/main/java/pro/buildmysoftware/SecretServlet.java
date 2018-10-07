package pro.buildmysoftware;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/secret")
public class SecretServlet extends HttpServlet {
    private static final String SECRET = "secret1234";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        String paramPass = req.getParameter("secret");
        if (paramPass != null) {
            session.setAttribute("secret", paramPass);
        }


        if (SECRET.equals(session.getAttribute("secret"))) {
            req.getRequestDispatcher("rightsecret.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("secret.jsp").forward(req, resp);
        }


        // TODO:
        // 1. chceck if parameter equals secret1234
        //2. if right secret is passsed, create a session with key
        // secretOK and values true
        // 3. if secretOk is true, then show the secret page
        // 4. otherwise return bad secret page
    }
}
