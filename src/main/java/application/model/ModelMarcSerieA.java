package application.model;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ModelMarcSerieA {
    List<Marcatore> listaMarcatori = new ArrayList<>();

    public List<Marcatore> riempiMarcatori() throws SQLException {
        String url = "jdbc:sqlite:Database1.db";
        Connection con = DriverManager.getConnection(url);
        try {
            for (int i = 1; i < 21; i++) {
                String query = "SELECT ID, Squadra, Goals, Assists, Pos FROM MarcatoriSerieA WHERE Pos = ?";
                PreparedStatement stmt = con.prepareStatement(query);
                stmt.setInt(1, i);
                ResultSet rs = stmt.executeQuery();

                if (rs.next()) {
                    int posizione = rs.getInt("Pos");
                    String id = rs.getString("ID");
                    String squadra = rs.getString("Squadra");
                    int goals = rs.getInt("Goals");
                    int assists = rs.getInt("Assists");

                    Marcatore marcatore = new Marcatore(posizione, id, squadra, goals, assists);
                    listaMarcatori.add(marcatore);
                }
                stmt.close();
                rs.close();
            }
            con.close();
            return listaMarcatori;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
