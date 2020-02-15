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



                user = new User(email, name, surname, userPassword);
                users.add(user);
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

    public User loginUserPass(User user) {
        String SQL_SELECT_BY_USER_AND_PASS = "SELECT use_email, use_name, use_surname, use_passwr "
                + " FROM users WHERE use_email = ? AND use_passwr = SHA2(?,256)";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT_BY_USER_AND_PASS);

            stmt.setString(1, user.getEmail());
            stmt.setString(2, user.getPassword());
            rs = stmt.executeQuery();
            rs.absolute(1);

            String email = rs.getString("use_email");
            String name = rs.getString("use_name");
            String surname = rs.getString("use_surname");
            String password = rs.getString("use_passwr");

            user.setEmail(email);
            user.setNombre(name);
            user.setApellidos(surname);
            user.setPassword(password);

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return user;
    }

    public int create(User user) {
        String SQL_INSERT = "INSERT INTO users(use_email, use_name, use_llinatges, use_passwr) "
                + " VALUES(?, ?, ?, SHA2(?,256))";
        Connection conn = null;
        PreparedStatement stmt = null;

        int rows = 0;
        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            int i = 1;
            stmt.setString(i++, user.getEmail());
            stmt.setString(i++, user.getNombre());
            stmt.setString(i++, user.getApellidos());
            stmt.setString(i++, user.getPassword());

            System.out.println(user.toString());
            rows = stmt.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return rows;
    }



}
