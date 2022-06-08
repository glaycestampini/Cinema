
package DAO;

import classes.DataHorario;
import classes.Filme;
import classes.Funcionario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FuncionarioDAO extends UsuarioDAO {
    
    ArrayList<Filme> listaFilme = new ArrayList<>();


  public void AdicionarFuncionario(Funcionario adcFunc) {

      Connection conn = ConectarDAO.ConectarBD();
      ResultSet rs;
      PreparedStatement pstm;
        
        try {
            String sqlFunc = "INSERT INTO FUNCIONARIO(LOGIN_FUNCIONARIO, NOME_FUNCIONARIO, SENHA_FUNCIONARIO, TELEFONE_FUNCIONARIO, ENDEREÇO_FUNCIONARIO, CARGO_FUNCIONARIO) "
                    + "VALUES (?, ?, ? ,? , ?, ?)";
            
            pstm = conn.prepareStatement(sqlFunc);
            pstm.setString(1, adcFunc.getLogin());
            pstm.setString(2, adcFunc.getNome());
            pstm.setString(3, adcFunc.getSenha());
            pstm.setString(4, adcFunc.getTelefone());
            pstm.setString(5, adcFunc.getEndereço());
            pstm.setString(6, adcFunc.getCargo());
            
            pstm.execute();
            pstm.close();

            String sqlUsua = "INSERT INTO USUARIO(LOGIN_USUARIO, NOME_USUARIO, SENHA_USUARIO, CARGO_USUARIO) VALUES (?, ?, ? , ?)";
            pstm = conn.prepareStatement(sqlUsua);
            pstm.setString(1, adcFunc.getLogin());
            pstm.setString(2, adcFunc.getNome());
            pstm.setString(3, adcFunc.getSenha());
            pstm.setString(4, adcFunc.getCargo());

            pstm.execute();
            ConectarDAO.closeConnection(conn,pstm);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO pacote DAO. Metodo adicionar funionario  " + erro);

        }
         
    }
    
     public ArrayList<Funcionario>  pesquisarFuncionario() {
        
         ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
         ResultSet rs;
         Connection conn = ConectarDAO.ConectarBD();

         PreparedStatement pstm;
        
        try {
            String sql = "Select * from funcionario";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setNome(rs.getString("nome_funcionario"));
                objFuncionario.setId(rs.getInt("id_funcionario"));
                objFuncionario.setLogin(rs.getString("login_funcionario"));
                objFuncionario.setSenha(rs.getString("senha_funcionario"));
                objFuncionario.setTelefone(rs.getString("telefone_funcionario"));
                objFuncionario.setEndereço(rs.getString("endereco_funcionario"));
                objFuncionario.setCargo(rs.getString("cargo_funcionario"));

                listaFuncionario.add(objFuncionario);
                return listaFuncionario;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo pesquisar" + erro);
        }
        return null;
    }
     

      public ArrayList<Funcionario>  pesquisarFuncionarioAlfabetico(){

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        ResultSet rs;
        Connection conn = ConectarDAO.ConectarBD();
        PreparedStatement pstm;


        try {
            String sql = "Select * from funcionario order by nome_funcionario";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setNome(rs.getString("nome_funcionario"));
                objFuncionario.setId(rs.getInt("id_funcionario"));
                objFuncionario.setLogin(rs.getString("login_funcionario"));
                objFuncionario.setSenha(rs.getString("senha_funcionario"));
                objFuncionario.setTelefone(rs.getString("telefone_funcionario"));
                objFuncionario.setEndereço(rs.getString("endereco_funcionario"));
                objFuncionario.setCargo(rs.getString("cargo_funcionario"));

                listaFuncionario.add(objFuncionario);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo pesquisar" + erro);
            return null;
        }

      return listaFuncionario;

    }
      
      
    public ArrayList<Funcionario>  pesquisarFuncionarioAlfabeticoDesc(){

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        ResultSet pesquisarFuncionario;
        Connection conn = ConectarDAO.ConectarBD();
        ResultSet rs;
        PreparedStatement pstm;

        try {
            String sql = "Select * from FUNCIONARIO order by nome_funcionario desc";
            pstm = conn.prepareStatement(sql);
            pesquisarFuncionario = pstm.executeQuery();

            while (pesquisarFuncionario.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setNome(pesquisarFuncionario.getString("nome_funcionario"));
                objFuncionario.setId(pesquisarFuncionario.getInt("id_funcionario"));
                objFuncionario.setLogin(pesquisarFuncionario.getString("login_funcionario"));
                objFuncionario.setSenha(pesquisarFuncionario.getString("senha_funcionario"));
                objFuncionario.setTelefone(pesquisarFuncionario.getString("telefone_funcionario"));
                objFuncionario.setEndereço(pesquisarFuncionario.getString("endereco_funcionario"));
                objFuncionario.setCargo(pesquisarFuncionario.getString("cargo_funcionario"));
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo pesquisar" + erro);
            return null;
        }

      return listaFuncionario;

    }
         
        
    
    public void excluirFuncionario(Funcionario objFuncionario){

        Connection conn = ConectarDAO.ConectarBD();
        ResultSet rs;
        PreparedStatement pstm;
       try {

           String sqlFunc = "delete from funcionario where id_funcionario = ?";

           pstm = conn.prepareStatement(sqlFunc);
           pstm.setInt(1, objFuncionario.getId());

           pstm.execute();
           pstm.close();

           String sqlUSUARIO = "delete from usuario where usuario = ?";

           pstm = conn.prepareStatement(sqlUSUARIO);
           pstm.setInt(1, objFuncionario.getId());

           pstm.execute();
           ConectarDAO.closeConnection(conn,pstm);
       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo Excluir Funcionario  " + erro);

       }

    }
     
     public void alterarFuncionario(Funcionario objFuncionario){

         Connection conn = ConectarDAO.ConectarBD();

         ResultSet rs;
         PreparedStatement pstm;
         try {
            String sqlFunc = "update  funcionario set login_funcionario= ?, nome_funcionario=?, senha_funcionario=?, telefone_funcionario=?, endereco_funcionario=?, cargo_funcionario=? where id_funcionario = ?";
            
            pstm = conn.prepareStatement(sqlFunc);
            pstm.setString(1, objFuncionario.getLogin());
            pstm.setString(2, objFuncionario.getNome());
            pstm.setString(3, objFuncionario.getSenha());
            pstm.setString(4, objFuncionario.getTelefone());
            pstm.setString(5, objFuncionario.getEndereço());
            pstm.setString(6, objFuncionario.getCargo());
            pstm.setInt(7, objFuncionario.getId());
            
            pstm.execute();
            ConectarDAO.closeConnection(conn,pstm);
            

            String sqlUsua = "update  funcionario set login_funcionario= ?, nome_funcionario=?, senha_funcionario=?, telefone_funcionario=?, endereco_funcionario=?, cargo_funcionario=? where id_funcionario = ?";
            pstm = conn.prepareStatement(sqlUsua);
            pstm.setString(1, objFuncionario.getLogin());
            pstm.setString(2, objFuncionario.getNome());
            pstm.setString(3, objFuncionario.getSenha());
            pstm.setString(4, objFuncionario.getCargo());
            pstm.setInt(5, objFuncionario.getId());
            
            pstm.execute();
            ConectarDAO.closeConnection(conn,pstm);
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe Funcionario. pacote DAO. Metodo Alterar funcionario" + erro);

        }
     }
    
}
