package hu.tomicompany.prog4.sajatapp.servlet;

import hu.tomicompany.prog4.sajatapp.controller.Control;
import hu.tomicompany.prog4.sajatapp.exception.NoTransmissionException;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorldServlet extends HttpServlet {

    private Control control;

    @Override
    public void init() throws ServletException {
        super.init();
        this.control = new Control();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            this.control.start();
        } catch (NoTransmissionException e) {
            e.printStackTrace();
        }
        String name = StringUtils.isBlank(req.getParameter("name")) ? "Empty" : req.getParameter("name");
        PrintWriter writer = resp.getWriter();
        writer.println("<html><head></head><body>");
        writer.println("<h1>"+ "Hello " + name + "!" + "</h1>");
        writer.println("</body>");
        writer.println("</html");

    }


}
