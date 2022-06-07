
package DAO;

import classes.Filme;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FilmeDAO extends UsuarioDAO{
    
    List<Filme> listaFilme = new ArrayList<>();


   public void cadastrarFilme(Filme adcFILME) {

       conectar = new ConectarDAO().ConectarBD();
       try {
           String sqlFunc = "INSERT INTO FILME( nome_filme, categoria_filme , classificacao_filme, duracao, data_cadastro,valor_ingresso) "
                   + "VALUES (?, ?, ? ,? , ?, ?, ?)";

           pstm = conectar.prepareStatement(sqlFunc);
           pstm.setString(1, adcFILME.getNomeFilme());
           pstm.setString(2, adcFILME.getCategoriaFilme());
           pstm.setString(3, adcFILME.getClassificacaoFilme());
           pstm.setInt(4, adcFILME.getDuracaoFilme());
           pstm.setString(6, adcFILME.getDataFilme());
           pstm.setDouble(7, adcFILME.getValorIngresso());


           pstm.execute();
           pstm.close();

       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo adicionar FILME  " + erro);

       }
   }


    public List<Filme> pesquisarFilme() {

        try {
            String sql = "Select * from FILME order by data_cadastro";
            pstm = conectar.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("id_filme"));
                filme.setNomeFilme(rs.getString("nome_filme"));
                filme.setCategoriaFilme(rs.getString("categoria_filme"));
                filme.setClassificacaoFilme(rs.getString("classificacao_filme"));
                filme.setDuracaoFilme(rs.getInt("duracao"));


                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("data_cadastro"));
                filme.setDataFilme(novaData);

                listaFilme.add(filme);

                return listaFilme;
            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
        }

        return null;
    }


    public List<Filme> pesquisarFilmes() {

    List<Filme> listFilme = new ArrayList<>();

        ResultSet rs;

        try {
            String sql = "Select * from filme";
            pstm = conectar.prepareStatement(sql);
            rs = pstm.executeQuery();

            listFilme.add(new Filme(
            rs.getInt("id_filme"),
            rs.getString("nome_filme"),
            rs.getString("categoria_filme"),
            rs.getString("classificacao_filme"),
            rs.getInt("duracao"),
            rs.getString("data_filme"),
            rs.getDouble("valor_ingresso")
            ));

            ConectarDAO.closeConnection(conectar, pstm);

            return listFilme;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
        }

        return null;

    }

     public List<Filme> pesquisarFilmeAlfabetico() {

        ResultSet pesquisarFilme;

        try {
            String sql = "Select * from FILME order by nome_filme";
            pstm = conectar.prepareStatement(sql);
            pesquisarFilme = pstm.executeQuery();

            while (pesquisarFilme.next()) {
                Filme objFilme = new Filme();
                objFilme.setIdFilme(pesquisarFilme.getInt("ID_FILME"));
                objFilme.setNomeFilme(pesquisarFilme.getString("NOME_FILME"));
                objFilme.setCategoriaFilme(pesquisarFilme.getString("CATEGORIA_FILME"));
                objFilme.setClassificacaoFilme(pesquisarFilme.getString("CLASSIFICAÇAO_FILME"));
                objFilme.setDuracaoFilme(pesquisarFilme.getInt("duracao"));
                objFilme.setValorIngresso(pesquisarFilme.getDouble("valor_ingresso"));


                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(pesquisarFilme.getDate("data_cadastro"));
                objFilme.setDataFilme(novaData);

                listaFilme.add(objFilme);

            }

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
            return null;
        }

        return listaFilme;
    }

        public List<Filme> pesquisarFilmeAlfabeticoDesc() {

        ResultSet pesquisarFilme;

        try {
            String sql = "Select * from FILME order by nome_filme desc";
            pstm = conectar.prepareStatement(sql);
            pesquisarFilme = pstm.executeQuery();

            while (pesquisarFilme.next()) {
                Filme objFilme = new Filme();
                objFilme.setIdFilme(pesquisarFilme.getInt("ID_FILME"));
                objFilme.setNomeFilme(pesquisarFilme.getString("NOME_FILME"));
                objFilme.setCategoriaFilme(pesquisarFilme.getString("CATEGORIA_FILME"));
                objFilme.setClassificacaoFilme(pesquisarFilme.getString("CLASSIFICAÇAO_FILME"));
                objFilme.setDuracaoFilme(pesquisarFilme.getInt("duracao"));

                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(pesquisarFilme.getDate("data_cadastro"));
                objFilme.setDataFilme(novaData);
                
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
            String sqlFunc = "update FILME set NOME_FILME= ?, CATEGORIA_FILME=? , CLASSIFICAÇAO_FILME=?, duracao = ?, SALA_FILME=?, SESSAO_FILME=?, data_cadastro = ? where id_filme = ?";

            pstm = conectar.prepareStatement(sqlFunc);
            pstm.setString(1, objFilme.getNomeFilme());
            pstm.setString(2, objFilme.getCategoriaFilme());
            pstm.setString(3, objFilme.getClassificacaoFilme());
            pstm.setInt(4, objFilme.getDuracaoFilme());
            pstm.setString(5, objFilme.getDataFilme());
            pstm.setInt(6, objFilme.getIdFilme());

            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo Alterar FILME  " + erro);

        }
        
        
    
    
    
    
    
    }
    public void excluirFilme(Filme objFilme){
    
         conectar = ConectarDAO.ConectarBD();
        try {
            String sqlFunc = "delete from FILME where id_filme = ?";

            pstm = conectar.prepareStatement(sqlFunc);
            pstm.setInt(1, objFilme.getIdFilme());

            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo Excluir FILME  " + erro);

        }
    }
}
