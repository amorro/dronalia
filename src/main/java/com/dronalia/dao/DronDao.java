package com.dronalia.dao;

import com.dronalia.dto.Dron;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DronDao {
    /*
     * Llista tots els clients de la base de dades
     *
     */
    public List<Dron> listar() {
        String SQL_SELECT = "SELECT cli_id, cli_name, cli_surname, cli_email, cli_phone, cli_balance " + " FROM client";
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Dron dron = null;
        List<Dron> drons = new ArrayList<>();

        try {
            conn = DBConnection.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("dro_id");
                String name = rs.getString("cli_name");
                String surname = rs.getString("cli_surname");
                String email = rs.getString("cli_email");
                String phone = rs.getString("cli_phone");
                double balance = rs.getDouble("cli_balance");

                dron = new Dron(id, name, );
                drons.add(dron);
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            DBConnection.close(rs);
            DBConnection.close(stmt);
            DBConnection.close(conn);
        }
        return drons;
    }
}
