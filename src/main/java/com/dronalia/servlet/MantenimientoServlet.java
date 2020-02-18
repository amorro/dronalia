package com.dronalia.servlet;

import com.dronalia.service.MantenimientoService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/mantenimiento")
public class MantenimientoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        /*String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "edit":
                    MantenimientoService.editClient(request, response);
                    break;
                default:
                    MantenimientoService.showListClient(request, response);
            }
        } else {
            MantenimientoService.showListClient(request, response);
        }*/
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String action = request.getParameter("action");
        if (action != null) {
            switch (action) {
                case "addSkin":
                    MantenimientoService.addSkin(request, response);
                    break;
                case "addDron":
                    MantenimientoService.addDron(request, response);
                    break;
                default:
                    MantenimientoService.returnToMant(request, response);
            }
        } else {
            MantenimientoService.returnToMant(request, response);
        }
    }
}
