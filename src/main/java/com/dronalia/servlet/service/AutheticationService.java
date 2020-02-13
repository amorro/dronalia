package com.dronalia.servlet.service;

import java.io.IOException;
import com.dronalia.dto.User;
import com.dronalia.servlet.LoginServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AutheticationService {
    private static final long serialVersionUID = 1L;

    public AutheticationService() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = request.getParameter("email");
        String userPass = request.getParameter("password");
        AutheticationService AutheticationService = new AutheticationService();
        boolean isAuthenticate = LoginServlet.validUser(userId, userPass);

        // Comprova si l'usuari existeix
        if (isAuthenticate) {
            System.out.println("usuari:" + userId);

            // Afegir l'usuari a la sessió i saludar a l'usuari
            User usuari = LoginServlet.getUsuari(userId);
            request.getSession().setAttribute("user", usuari);
            response.sendRedirect("index.jsp");
        } else {
            response.sendRedirect("login/login.jsp");
        }
    }
}

