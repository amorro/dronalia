package com.dronalia.service;

import java.io.IOException;

import com.dronalia.dao.UserDao;
import com.dronalia.dto.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class AutheticationService {
    private static final long serialVersionUID = 1L;

    public AutheticationService() {
        super();
    }


    public static void returnToIndex(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");
    }

    public static void loginClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String password = request.getParameter("password");
        User user = new UserDao().loginUserPass(new User(email, password));

        System.out.println(user);

        if (user.getNombre().equals("admin")) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("mantenimiento.jsp");
        } else if (user.getNombre() != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            response.sendRedirect("index.jsp");
        } else {
            response.sendError(HttpServletResponse.SC_BAD_REQUEST, "Usuario o contraseña incorrecto");
        }

    }

    public static void closeClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("user", null);
        response.sendRedirect("index.jsp");
    }


    public static void createClient(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String email = request.getParameter("email");
        String name = request.getParameter("name");
        String surname = request.getParameter("surname");
        String password = request.getParameter("password");

        User user = new User(email, name, surname, password);

        int registrosModificados = new UserDao().create(user);
        System.out.println("Registres modificats:" + registrosModificados);

        AutheticationService.returnToIndex(request, response);
    }
}

