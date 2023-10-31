package application.model;

import org.springframework.security.crypto.bcrypt.BCrypt;

import java.sql.*;

public class ModelReg {

    public boolean ExistAccount(String user) throws SQLException {
        String url = "jdbc:sqlite:Database1.db";
        Connection connect = DriverManager.getConnection(url);
        boolean ex = false;

        try {
            String query = "select User from LoginData;";
            PreparedStatement stmt = connect.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                String us = rs.getString(1);
                if(user.equals(us)) {
                    ex = true;
                }
            }

            connect.close();
            rs.close();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return ex;
    }

    public void AddAccount(String user, String pass) throws SQLException {
        String url = "jdbc:sqlite:Database1.db";
        Connection connect = DriverManager.getConnection(url);
        String encryptedPass = BCrypt.hashpw(pass, BCrypt.gensalt(12));
        PreparedStatement stmt = connect.prepareStatement("INSERT INTO LoginData VALUES (?, ?, ?);");
        stmt.setString(2, user);
        stmt.setString(3, encryptedPass);
        stmt.execute();

        connect.close();
        stmt.close();
    }

}
