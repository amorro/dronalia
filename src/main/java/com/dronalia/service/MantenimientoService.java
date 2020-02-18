package com.dronalia.service;

import com.dronalia.dao.DronDao;
import com.dronalia.dao.SkinDao;
import com.dronalia.dao.UserDao;
import com.dronalia.dto.Dron;
import com.dronalia.dto.Skin;
import com.dronalia.dto.User;
import com.dronalia.enumeradas.EnumDronCategoria;
import com.dronalia.enumeradas.EnumDronColor;
import com.dronalia.enumeradas.EnumSkinTematica;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MantenimientoService {

    public MantenimientoService() {
        super();
    }

    public static void returnToMant(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("mantenimiento.jsp");
    }

    public static void addSkin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String skinName = request.getParameter("skinName");
        String skinImg = request.getParameter("skinImg");
        EnumSkinTematica skinTem = EnumSkinTematica.valueOf(request.getParameter("skinTem"));

        Skin skin = new Skin(skinName, skinImg, skinTem);

        int registrosModificados = new SkinDao().create(skin);
        System.out.println("Registres modificats:" + registrosModificados);

        AutheticationService.returnToIndex(request, response);
    }

    public static void addDron(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String dronName = request.getParameter("dronName");
        String dronImg = request.getParameter("dronImg");
        EnumDronCategoria dronCat = EnumDronCategoria.valueOf(request.getParameter("dronCat"));
        EnumDronColor dronColor = EnumDronColor.valueOf(request.getParameter("dronColor"));
        String dronAxis = request.getParameter("dronAxis");
        String dronMesure = request.getParameter("dronMesure");
        Double dronPrice = Double.valueOf(request.getParameter("dronPrice"));

        Dron dron = new Dron(dronName, dronAxis, dronMesure, dronCat, dronColor, dronPrice, dronImg);

        int registrosModificados = new DronDao().create(dron);
        System.out.println("Registres modificats:" + registrosModificados);

        AutheticationService.returnToIndex(request, response);
    }

}
