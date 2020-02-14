package com.dronalia.servlet;

import java.util.HashMap;
import javax.servlet.annotation.WebServlet;

import com.dronalia.dto.User;


@WebServlet("/action-login")
public class LoginServlet {

    static HashMap<String, User> usuaris = new HashMap<>();

    public LoginServlet() {
        usuaris.put("pedro", new User("pedro@gmail.com", "Pedro", "Sánchez", "123"));
        usuaris.put("joan", new User("joan@gmail.com", "joan", "Nicolau", "123"));
        usuaris.put("xavi", new User("xavi@gmail.com", "xavi", "Pérez", "123"));
    }

    public static User getUsuari(String userId) {
        return usuaris.get(userId);
    }

    public boolean existUsuari(String userId) {
        return usuaris.containsKey(userId);
    }

    public static boolean validUser(String userId, String userPass) {
        if (usuaris.containsKey(userId)) {
            User usuari = usuaris.get(userId);
            String pass = usuari.getPassword();
            return (pass.equals(userPass));
        } else {
            return false;
        }
    }
}