package DAO;

import classes.Usuario;
import java.sql.ResultSet;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class UsuarioDAO {

    public ResultSet autenticarUsuario(Usuario objUsuario) {
        try {
            Connection conn = ConectarDAO.ConectarBD();

            String sql = "Select * from usuario where login_usuario = ? and senha_usuario = ?";

            PreparedStatement pstm = conn.prepareStatement(sql);

            pstm.setString(1, objUsuario.getLogin());
            pstm.setString(2, objUsuario.getSenha());

            ResultSet rs = pstm.executeQuery();

            Usuario user = new Usuario();
            while(rs.next()) {
                
            }   
            return rst;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe UsuarioDAO. Pacote DAO. Metodo de autorizarUsuario " + erro);
            return null;

        }

    }

}
