
package DAO;

import Classes.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class FilmeDAO extends UsuarioDAO{
    
    
    ArrayList<Filme> listaFilme = new ArrayList<>();


    public void cadastrarFilme(Filme adcFILME) {

        conectar = new ConectarDAO().ConectarBD();
        try {
            String sqlFunc = "INSERT INTO FILME( NOME_FILME, CATEGORIA_FILME , CLASSIFICAÇAO_FILME, SALA_FILME, SESSAO_FILME) "
                    + "VALUES (?, ?, ? ,? , ?)";

            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setString(1, adcFILME.getNome_filme());
            preparo.setString(2, adcFILME.getCategoria_filme());
            preparo.setString(3, adcFILME.getClassificaçao_filme());
            preparo.setString(4, adcFILME.getSala_filme());
            preparo.setString(5, adcFILME.getSessao_filme());

            
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo adicionar FILME  " + erro);

        }

    }

    public ArrayList<Filme> pesquisarFilme() {

        ResultSet pesquisarFilme;

        try {
            String sql = "Select * from FILME";
            preparo = conectar.prepareStatement(sql);
            pesquisarFilme = preparo.executeQuery();

            while (pesquisarFilme.next()) {
                Filme objFilme = new Filme();
                objFilme.setId_filme(pesquisarFilme.getInt("ID_FILME"));
                objFilme.setNome_filme(pesquisarFilme.getString("NOME_FILME"));
                objFilme.setCategoria_filme(pesquisarFilme.getString("CATEGORIA_FILME"));
                objFilme.setClassificaçao_filme(pesquisarFilme.getString("CLASSIFICAÇAO_FILME"));
                objFilme.setSala_filme(pesquisarFilme.getString("SALA_FILME"));
                objFilme.setSessao_filme(pesquisarFilme.getString("SESSAO_FILME"));
                
                listaFilme.add(objFilme);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
            return null;
        }

        return listaFilme;

    }
    
    public void alterarFilme(Filme objFilme)
    {
        conectar = new ConectarDAO().ConectarBD();
        try {
            String sqlFunc = "update FILME set NOME_FILME= ?, CATEGORIA_FILME=? , CLASSIFICAÇAO_FILME=?, SALA_FILME=?, SESSAO_FILME=? where id_filme = ?";

            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setString(1, objFilme.getNome_filme());
            preparo.setString(2, objFilme.getCategoria_filme());
            preparo.setString(3, objFilme.getClassificaçao_filme());
            preparo.setString(4, objFilme.getSala_filme());
            preparo.setString(5, objFilme.getSessao_filme());
            preparo.setInt(6, objFilme.getId_filme());

            
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo Alterar FILME  " + erro);

        }
        
        
    
    
    
    
    
    }
    public void excluirFilme(Filme objFilme){
    
         conectar = new ConectarDAO().ConectarBD();
        try {
            String sqlFunc = "delete from FILME where id_filme = ?";

            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setInt(1, objFilme.getId_filme());

            
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo Excluir FILME  " + erro);

        }
    
    
    }
    
    
}
