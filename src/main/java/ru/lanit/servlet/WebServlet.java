package ru.lanit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WebServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        String name = req.getParameter("name");

        resp.setContentType("text/html; charset=UTF-8");
        if (name != null && !name.equals("")) {
            resp.getWriter().println("<h1>Hello, " + name + "</h1>"
                    + "Свернул направо, путник, попал в servlet with web.xml");
        } else {
            resp.getWriter().println("<h1>Вы забыли представиться</h1>");
        }
    }
}
