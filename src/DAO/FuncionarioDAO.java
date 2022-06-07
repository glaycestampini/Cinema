
package DAO;

import classes.Filme;
import classes.Funcionario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FuncionarioDAO extends UsuarioDAO {
    
    ArrayList<Filme> listaFilme = new ArrayList<>();


  public void AdicionarFuncionario(Funcionario adcFunc) {

        
        try {
            String sqlFunc = "INSERT INTO FUNCIONARIO(LOGIN_FUNCIONARIO, NOME_FUNCIONARIO, SENHA_FUNCIONARIO, TELEFONE_FUNCIONARIO, ENDEREÇO_FUNCIONARIO, CARGO_FUNCIONARIO) "
                    + "VALUES (?, ?, ? ,? , ?, ?)";
            
            pstm = conectar.prepareStatement(sqlFunc);
            pstm.setString(1, adcFunc.getLogin());
            pstm.setString(2, adcFunc.getNome());
            pstm.setString(3, adcFunc.getSenha());
            pstm.setString(4, adcFunc.getTelefone());
            pstm.setString(5, adcFunc.getEndereço());
            pstm.setString(6, adcFunc.getCargo());
            
            pstm.execute();
            pstm.close();

            String sqlUsua = "INSERT INTO USUARIO(LOGIN_USUARIO, NOME_USUARIO, SENHA_USUARIO, CARGO_USUARIO) VALUES (?, ?, ? , ?)";
            pstm = conectar.prepareStatement(sqlUsua);
            pstm.setString(1, adcFunc.getLogin());
            pstm.setString(2, adcFunc.getNome());
            pstm.setString(3, adcFunc.getSenha());
            pstm.setString(4, adcFunc.getCargo());

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO pacote DAO. Metodo adicionar funionario  " + erro);

        }
         
    }
    
     public ArrayList<Funcionario>  pesquisarFuncionario() {
        
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        ResultSet pesquisarFuncionario;
        
        
        try {
            String sql = "Select * from FUNCIONARIO";
            pstm = conectar.prepareStatement(sql);
            pesquisarFuncionario = pstm.executeQuery();

            while (pesquisarFuncionario.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setNome(pesquisarFuncionario.getString("NOME_FUNCIONARIO"));
                objFuncionario.setId(pesquisarFuncionario.getInt("ID_FUNCIONARIO"));
                objFuncionario.setLogin(pesquisarFuncionario.getString("LOGIN_FUNCIONARIO"));
                objFuncionario.setSenha(pesquisarFuncionario.getString("SENHA_FUNCIONARIO"));
                objFuncionario.setTelefone(pesquisarFuncionario.getString("TELEFONE_FUNCIONARIO"));
                objFuncionario.setEndereço(pesquisarFuncionario.getString("ENDEREÇO_FUNCIONARIO"));
                objFuncionario.setCargo(pesquisarFuncionario.getString("CARGO_FUNCIONARIO"));

                listaFuncionario.add(objFuncionario);
                
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo pesquisar" + erro);
            return null;
        }
        
        return listaFuncionario;

    }
     

      public ArrayList<Funcionario>  pesquisarFuncionarioAlfabetico(){

        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        ResultSet pesquisarFuncionario;


        try {
            String sql = "Select * from FUNCIONARIO order by nome_funcionario";
            pstm = conectar.prepareStatement(sql);
            pesquisarFuncionario = pstm.executeQuery();

            while (pesquisarFuncionario.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setNome(pesquisarFuncionario.getString("NOME_FUNCIONARIO"));
                objFuncionario.setId(pesquisarFuncionario.getInt("ID_FUNCIONARIO"));
                objFuncionario.setLogin(pesquisarFuncionario.getString("LOGIN_FUNCIONARIO"));
                objFuncionario.setSenha(pesquisarFuncionario.getString("SENHA_FUNCIONARIO"));
                objFuncionario.setTelefone(pesquisarFuncionario.getString("TELEFONE_FUNCIONARIO"));
                objFuncionario.setEndereço(pesquisarFuncionario.getString("ENDEREÇO_FUNCIONARIO"));
                objFuncionario.setCargo(pesquisarFuncionario.getString("CARGO_FUNCIONARIO"));

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


        try {
            String sql = "Select * from FUNCIONARIO order by nome_funcionario desc";
            pstm = conectar.prepareStatement(sql);
            pesquisarFuncionario = pstm.executeQuery();

            while (pesquisarFuncionario.next()) {
                Funcionario objFuncionario = new Funcionario();
                objFuncionario.setNome(pesquisarFuncionario.getString("NOME_FUNCIONARIO"));
                objFuncionario.setId(pesquisarFuncionario.getInt("ID_FUNCIONARIO"));
                objFuncionario.setLogin(pesquisarFuncionario.getString("LOGIN_FUNCIONARIO"));
                objFuncionario.setNome(pesquisarFuncionario.getString("NOME_FUNCIONARIO"));
                objFuncionario.setSenha(pesquisarFuncionario.getString("SENHA_FUNCIONARIO"));
                objFuncionario.setTelefone(pesquisarFuncionario.getString("TELEFONE_FUNCIONARIO"));
                objFuncionario.setEndereço(pesquisarFuncionario.getString("ENDEREÇO_FUNCIONARIO"));
                objFuncionario.setCargo(pesquisarFuncionario.getString("CARGO_FUNCIONARIO"));

                listaFuncionario.add(objFuncionario);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo pesquisar" + erro);
            return null;
        }

      return listaFuncionario;

    }
         
        
    
    public void excluirFuncionario(Funcionario objFuncionario){

       try {
           String sqlFunc = "delete from funcionario where id_funcionario = ?";

           pstm = conectar.prepareStatement(sqlFunc);
           pstm.setInt(1, objFuncionario.getId());

           pstm.execute();
           pstm.close();

           String sqlUSUARIO = "delete from USUARIO where id_USUARIO = ?";

           pstm = conectar.prepareStatement(sqlUSUARIO);
           pstm.setInt(1, objFuncionario.getId());


           pstm.execute();
           pstm.close();

       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo Excluir Funcionario  " + erro);

       }

    }
     
     
     
     
     public void alterarFuncionario(Funcionario objFuncionario){
         
         try {
            String sqlFunc = "update  FUNCIONARIO set LOGIN_FUNCIONARIO= ?, NOME_FUNCIONARIO=?, SENHA_FUNCIONARIO=?, TELEFONE_FUNCIONARIO=?, ENDEREÇO_FUNCIONARIO=?, CARGO_FUNCIONARIO=? WHERE ID_FUNCIONARIO = ?";
            
            pstm = conectar.prepareStatement(sqlFunc);
            pstm.setString(1, objFuncionario.getLogin());
            pstm.setString(2, objFuncionario.getNome());
            pstm.setString(3, objFuncionario.getSenha());
            pstm.setString(4, objFuncionario.getTelefone());
            pstm.setString(5, objFuncionario.getEndereço());
            pstm.setString(6, objFuncionario.getCargo());
            pstm.setInt(7, objFuncionario.getId());
            
            pstm.execute();
            pstm.close();
            

            String sqlUsua = "update USUARIO set LOGIN_USUARIO=?, NOME_USUARIO=?, SENHA_USUARIO=?, CARGO_USUARIO=? where id_USUARIO = ?"; 
            pstm = conectar.prepareStatement(sqlUsua);
            pstm.setString(1, objFuncionario.getLogin());
            pstm.setString(2, objFuncionario.getNome());
            pstm.setString(3, objFuncionario.getSenha());
            pstm.setString(4, objFuncionario.getCargo());
            pstm.setInt(5, objFuncionario.getId());
            
            
            
            pstm.execute();
            pstm.close();
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe Funcionario. pacote DAO. Metodo Alterar funcionario" + erro);

        }
         
         
         
     }
    
}
