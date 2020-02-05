package com.dronalia.servlet;

import com.dronalia.dao.DronDao;
import com.dronalia.dto.Dron;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/")
public class WebController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Recuperam l'acció a realitzar i es crida a la funció corresponent
//        String action = request.getParameter("action");
//        if (action != null) {
//            switch (action) {
//                case "basico":
//                    this.showDronBasico(request, response);
//                    break;
//                case "avanzado":
//                    this.showDronAvanzado(request, response);
//                    break;
//                case "profesional":
//                    this.showDronProfesional(request, response);
//                    break;
//                default:
//                    this.showListDron(request, response);
//            }
//        } else {
//            this.showListDron(request, response);
//        }
//    }
//
//    private void showListDron(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Dron> drons = new DronDao().listar();
//
//        System.out.println("drons = " + drons);
//
//        // Dades a desar a la sessió de la classe
//        HttpSession session = request.getSession();
//        session.setAttribute("drons", drons);
//        session.setAttribute("totalDrones", drons.size());
//
//        // request.getRequestDispatcher("index.jsp").forward(request, response);
//        response.sendRedirect("index.jsp");
//    }
//
//    private void showDronBasico(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Dron> drons = new DronDao().listar();
//
//        System.out.println("drons = " + drons);
//
//        // Dades a desar a la sessió de la classe
//        HttpSession session = request.getSession();
//        session.setAttribute("drons", drons);
//        session.setAttribute("totalDrones", drons.size());
//
//        // request.getRequestDispatcher("index.jsp").forward(request, response);
//        response.sendRedirect("index.jsp");
//    }
//
//    private void showDronAvanzado(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Dron> drons = new DronDao().listar();
//
//        System.out.println("drons = " + drons);
//
//        // Dades a desar a la sessió de la classe
//        HttpSession session = request.getSession();
//        session.setAttribute("drons", drons);
//        session.setAttribute("totalDrones", drons.size());
//
//        // request.getRequestDispatcher("index.jsp").forward(request, response);
//        response.sendRedirect("index.jsp");
//    }
//
//    private void showDronProfesional(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        List<Dron> drons = new DronDao().listar();
//
//        System.out.println("drons = " + drons);
//
//        // Dades a desar a la sessió de la classe
//        HttpSession session = request.getSession();
//        session.setAttribute("drons", drons);
//        session.setAttribute("totalDrones", drons.size());
//
//        // request.getRequestDispatcher("index.jsp").forward(request, response);
//        response.sendRedirect("index.jsp");
//    }
    }
}
