package application.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModelClassificaNbaEst {
    List<SquadraNbaEst> listaNbaEst = new ArrayList<>();

    public List<SquadraNbaEst> riempiClassNbaEst() throws SQLException {
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 16; i++) {
                String query = "select ID,pos,pg,v,p,pntf,pnts from ClassificaEst where pos = ?;";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String id = rs.getString("ID");
                    int Posizione = rs.getInt("pos");
                    int Partitegiocate = rs.getInt("pg");
                    int Vittorie = rs.getInt("v");
                    int Perse = rs.getInt("p");
                    int puntif = rs.getInt("pntf");
                    int puntis = rs.getInt("pnts");

                    SquadraNbaEst squadraNbaEst = new SquadraNbaEst(id, Posizione, Vittorie, Perse, puntif, puntis);
                    listaNbaEst.add(squadraNbaEst);
                }
                stmt.close();
                rs.close();
            }
            con.close();
            return listaNbaEst;

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}