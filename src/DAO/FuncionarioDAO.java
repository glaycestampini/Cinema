
package DAO;

import Classes.Filme;
import Classes.Funcionario;
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
            
            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setString(1, adcFunc.getLogin());
            preparo.setString(2, adcFunc.getNome());
            preparo.setString(3, adcFunc.getSenha());
            preparo.setString(4, adcFunc.getTelefone());
            preparo.setString(5, adcFunc.getEndereço());
            preparo.setString(6, adcFunc.getCargo());
            
            preparo.execute();
            preparo.close();

            String sqlUsua = "INSERT INTO USUARIO(LOGIN_USUARIO, NOME_USUARIO, SENHA_USUARIO, CARGO_USUARIO) VALUES (?, ?, ? , ?)";
            preparo = conectar.prepareStatement(sqlUsua);
            preparo.setString(1, adcFunc.getLogin());
            preparo.setString(2, adcFunc.getNome());
            preparo.setString(3, adcFunc.getSenha());
            preparo.setString(4, adcFunc.getCargo());

            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO pacote DAO. Metodo adicionar funionario  " + erro);

        }
         
    }
    
     public ArrayList<Funcionario>  pesquisarFuncionario() {
        
        ArrayList<Funcionario> listaFuncionario = new ArrayList<>();
        ResultSet pesquisarFuncionario;
        
        
        try {
            String sql = "Select * from FUNCIONARIO";
            preparo = conectar.prepareStatement(sql);
            pesquisarFuncionario = preparo.executeQuery();

            while (pesquisarFuncionario.next()) {
                Funcionario objFuncionario = new Funcionario();
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

            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setInt(1, objFuncionario.getId());
            
            preparo.execute();
            preparo.close();

            String sqlUSUARIO = "delete from USUARIO where id_USUARIO = ?";

            preparo = conectar.prepareStatement(sqlUSUARIO);
            preparo.setInt(1, objFuncionario.getId());

            
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FuncionarioDAO. pacote DAO. Metodo Excluir Funcionario  " + erro);

        }
     
     
     
     
     
     }
     
     
     public void alterarFuncionario(Funcionario objFuncionario)
     {
         
         try {
            String sqlFunc = "update  FUNCIONARIO set LOGIN_FUNCIONARIO= ?, NOME_FUNCIONARIO=?, SENHA_FUNCIONARIO=?, TELEFONE_FUNCIONARIO=?, ENDEREÇO_FUNCIONARIO=?, CARGO_FUNCIONARIO=? WHERE ID_FUNCIONARIO = ?";
            
            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setString(1, objFuncionario.getLogin());
            preparo.setString(2, objFuncionario.getNome());
            preparo.setString(3, objFuncionario.getSenha());
            preparo.setString(4, objFuncionario.getTelefone());
            preparo.setString(5, objFuncionario.getEndereço());
            preparo.setString(6, objFuncionario.getCargo());
            preparo.setInt(7, objFuncionario.getId());
            
            preparo.execute();
            preparo.close();
            

            String sqlUsua = "update USUARIO set LOGIN_USUARIO=?, NOME_USUARIO=?, SENHA_USUARIO=?, CARGO_USUARIO=? where id_USUARIO = ?"; 
            preparo = conectar.prepareStatement(sqlUsua);
            preparo.setString(1, objFuncionario.getLogin());
            preparo.setString(2, objFuncionario.getNome());
            preparo.setString(3, objFuncionario.getSenha());
            preparo.setString(4, objFuncionario.getCargo());
            preparo.setInt(5, objFuncionario.getId());
            
            
            
            preparo.execute();
            preparo.close();
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe Funcionario. pacote DAO. Metodo Alterar funcionario" + erro);

        }
         
         
         
     }
    
}
