package application.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModelClassificaNbaOvest {
    List<SquadraNbaOvest> listNbaOvest = new ArrayList<>();

    public List<SquadraNbaOvest> riempiClassNbaOvest() throws SQLException{
        String url = "jdbc:sqlite:Database2.db";
        Connection con = DriverManager.getConnection(url);
        try{
            for(int i = 0; i < 16; i++){
                String query = "select ID,pos,pg,v,p,pntf,pnts from ClassificaOvest where pos = ?;";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if(rs.next()){
                    String id = rs.getString("ID");
                    int Posizione = rs.getInt("pos");
                    int Partitegiocate = rs.getInt("pg");
                    int Vittorie = rs.getInt("v");
                    int Perse = rs.getInt("p");
                    int puntif = rs.getInt("pntf");
                    int puntis = rs.getInt("pnts");

                    SquadraNbaOvest squadraNbaOvest = new SquadraNbaOvest(id,Posizione,Vittorie,Perse,puntif,puntis);
                    listNbaOvest.add(squadraNbaOvest);
                }
                stmt.close();
                rs.close();
            }
            con.close();
            return listNbaOvest;

        } catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
