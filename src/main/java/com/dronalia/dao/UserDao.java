package com.dronalia.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dronalia.dto.Skin;
import com.dronalia.dto.User;
import com.dronalia.enumeradas.EnumSkinTematica;

public class UserDao {
	public List<User> listar() {
        String SQL_SELECT = "SELECT use_email, use_userName, use_name, use_surname, use_passwr" + " FROM users";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        User user;
        List<User> users = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                String email = rs.getString("use_email");
                String userName = rs.getString("use_userName");
                String userPassword = rs.getString("use_passwr");
                String name = rs.getString("use_name");
                String surname = rs.getString("use_surname");
                
                

                user = new User(email, userName, userPassword, name, surname);
                user.add(user);
            }
        }catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return users;
    }

}
