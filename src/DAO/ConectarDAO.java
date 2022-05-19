package DAO;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectarDAO {

    Connection conn = null;

    public Connection ConectarBD() {

        try {

            String url = "jdbc:mysql://localhost:3306/sistemacinema?user=root&password=";
            conn = DriverManager.getConnection(url);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " Erro na Classe: ConectarDAO. Metodo ConectarBD " + erro);
        }
        return conn;

    }

}
