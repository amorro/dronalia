package com.dronalia.dao;

import com.dronalia.dto.Almacen;
import com.dronalia.enumeradas.EnumDronCategoria;
import com.dronalia.enumeradas.EnumDronColor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AlmacenDao {

    public List<Almacen> listarAlmacenes() {
        DBConnection db = new DBConnection();
        List<Almacen> almacenes = new ArrayList<>();

        try {
            String query = "SELECT alm_id, alm_name, alm_desc FROM almacenes";

            Connection conn = DBConnection.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int alm_id = rs.getInt("alm_id");
                    String alm_name = rs.getString("alm_name");
                    String alm_desc = rs.getString("alm_desc");

                    Almacen almacen = new Almacen(alm_id, alm_name, alm_desc);
                    System.out.println(almacen.toString());
                    almacenes.add(almacen);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return almacenes;
    }

    //, stock WHERE alm_id = sto_alm_id
}
