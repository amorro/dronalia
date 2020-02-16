package com.dronalia.service;

import com.dronalia.dao.SkinDao;
import com.dronalia.dao.UserDao;
import com.dronalia.dto.Skin;
import com.dronalia.dto.User;
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
        Enum<EnumSkinTematica> skinTem = EnumSkinTematica.valueOf("skinTem");

        Skin skin = new Skin(skinName, skinImg, skinTem);

        int registrosModificados = new SkinDao().create(skin);
        System.out.println("Registres modificats:" + registrosModificados);

        AutheticationService.returnToIndex(request, response);
    }

    public static void addDron(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
