package DAO;

import Classes.Usuario;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class UsuarioDAO {

    ConectarDAO objConectarDAO = new ConectarDAO();
    Connection conectar = objConectarDAO.ConectarBD();

    PreparedStatement preparo = null;
    ResultSet rst = null;

    public ResultSet autenticarUsuario(Usuario objUsuario) {
        try {

            String sql = "Select * from usuario where LOGIN_USUARIO =? AND SENHA_USUARIO=?";
            preparo = conectar.prepareStatement(sql);
            preparo.setString(1, objUsuario.getLogin());
            preparo.setString(2, objUsuario.getSenha());

            rst = preparo.executeQuery();
            return rst;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe UsuarioDAO. Pacote DAO. Metodo de autorizarUsuario " + erro);
            return null;

        }

    }

}
