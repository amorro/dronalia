package com.dronalia.dao;
import com.dronalia.dto.Stock;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockDao {

    public List<Stock> listarStock() {
        DBConnection db = new DBConnection();
        List<Stock> listStock = new ArrayList<>();

        try {
            String query = "SELECT sto_alm_id, sto_id, sto_modelo, sto_disponibles, sto_estanteria, sto_estante FROM stock";

            Connection conn = DBConnection.getConnection();
            PreparedStatement sentencia = conn.prepareStatement(query);
            ResultSet rs = sentencia.executeQuery();

            if (rs != null) {
                while (rs.next()) {
                    int sto_alm_id = rs.getInt("sto_alm_id");
                    int sto_id = rs.getInt("sto_id");
                    String sto_modelo = rs.getString("sto_modelo");
                    int sto_disponibles = rs.getInt("sto_disponibles");
                    String sto_estanteria = rs.getString("sto_estanteria");
                    String sto_estante = rs.getString("sto_estante");

                    Stock stock = new Stock(sto_alm_id, sto_id, sto_modelo, sto_disponibles, sto_estanteria, sto_estante);
                    System.out.println(stock.toString());
                    listStock.add(stock);
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
        return listStock;
    }

}
