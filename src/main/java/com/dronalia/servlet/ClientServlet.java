package com.dronalia.servlet;

import com.dronalia.service.AutheticationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/client")
public class ClientServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "edit":
                    AutheticationService.editClient(request, response);
                    break;
                default:
                    AutheticationService.showListClient(request, response);
            }
        } else {
            AutheticationService.showListClient(request, response);
        }*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                /*case "delete":
                    AutheticationService.deleteClient(request, response);
                    break;
                case "insert":
                    AutheticationService.insertClient(request, response);
                    break;
                case "update":
                    AutheticationService.updateClient(request, response);
                    break;*/
                case "create":
                    AutheticationService.createClient(request, response);
                    break;
                case "login":
                    AutheticationService.loginClient(request, response);
                    break;
                case "close":
                    AutheticationService.closeClient(request, response);
                    break;
                default:
                    AutheticationService.returnToIndex(request, response);
            }
        } else {
            AutheticationService.returnToIndex(request, response);
        }
    }

}
