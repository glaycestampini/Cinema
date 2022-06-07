package DAO;

import javax.swing.JOptionPane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConectarDAO {

    Connection conn = null;

    public static Connection ConectarBD() {

        try {

            String user = "root";
            String pass = "root";

            String url = "jdbc:mysql://localhost:3306/sistemacinemav2";
            System.out.println("Conectando...");
            return DriverManager.getConnection(url, user, pass);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, " Erro na Classe: ConectarDAO. Metodo ConectarBD " + erro);
        }
        return null;

    }

 public static void closeConnection(Connection conn) {

        try{

            if(conn != null){
                conn.close();
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    public static void closeConnection(Connection conn, PreparedStatement pstm){
        try{

            if(conn != null && pstm != null){
                conn.close();
                pstm.close();
            }

        } catch(SQLException e) {
            e.printStackTrace();
        }
    }

}
