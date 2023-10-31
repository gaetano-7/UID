package application.model;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.*;

public class ModelLogin {

    public boolean testConnection(String user, String pass) throws SQLException {
        String url = "jdbc:sqlite:Database1.db";
        Connection connect = DriverManager.getConnection(url);
        boolean ts = false;

        try {
            String query = "select User,Password from LoginData;";
            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String us = rs.getString(1);
                String ps = rs.getString(2);
                boolean check = BCrypt.checkpw(pass,ps);

                if(user.equals(us) && check) {
                    ts = true;
                }
            }

            connect.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ts;
    }

}
