package application.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModelClassSerieA {
    List<Squadra> listaSquadre = new ArrayList<>();

    public List<Squadra> riempiClassifica() throws SQLException {
        String url = "jdbc:sqlite:Database1.db";
        Connection con = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 21; i++) {
                String query = "SELECT ID, Punti, pos, PartiteGiocate, PartiteVinte, PartitePareggiate, PartitePerse FROM ClassificaSerieA WHERE pos = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    String id = rs.getString("ID");
                    int punti = rs.getInt("Punti");
                    int posizione = rs.getInt("pos");
                    int partiteGiocate = rs.getInt("PartiteGiocate");
                    int partiteVinte = rs.getInt("PartiteVinte");
                    int partitePareggiate = rs.getInt("PartitePareggiate");
                    int partitePerse = rs.getInt("PartitePerse");

                    Squadra squadra = new Squadra(posizione, id, partiteVinte, partitePareggiate, partitePerse, punti, partiteGiocate);
                    listaSquadre.add(squadra);
                }
                stmt.close();
                rs.close();
            }
            con.close();
            return listaSquadre;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
