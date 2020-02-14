package com.dronalia.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class LoginController {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);

        String mail = request.getParameter("email");
        String password = request.getParameter("password");

        if (mail.equals("pedro@gmail.com") && password.equals("123")) {
            response.sendRedirect("/index.jsp");
        }
    }

}