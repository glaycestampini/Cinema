
package DAO;

import classes.Filme;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class FilmeDAO extends UsuarioDAO{
    
    List<Filme> listaFilme = new ArrayList<>();


   public void cadastrarFilme(Filme adcFILME) {

       Connection conn = ConectarDAO.ConectarBD();
       ResultSet rs;
       PreparedStatement pstm;
       try {
           String sqlFunc = "INSERT INTO FILME( nome_filme, categoria_filme , classificacao_filme, duracao, data_cadastro,valor_ingresso) "
                   + "VALUES (?, ?, ? ,? , ?, ?, ?)";

           pstm = conn.prepareStatement(sqlFunc);
           pstm.setString(1, adcFILME.getNomeFilme());
           pstm.setString(2, adcFILME.getCategoriaFilme());
           pstm.setString(3, adcFILME.getClassificacaoFilme());
           pstm.setInt(4, adcFILME.getDuracaoFilme());
           pstm.setString(5, adcFILME.getDataFilme());
           pstm.setDouble(6, adcFILME.getValorIngresso());

           ConectarDAO.closeConnection(conn, pstm);

       } catch (SQLException erro) {
           JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo adicionar FILME  " + erro);

       }
   }


    public List<Filme> pesquisarFilme() {

        Connection conn = ConectarDAO.ConectarBD();
        ResultSet rs;
        PreparedStatement pstm;

        try {
            String sql = "Select * from FILME order by data_cadastro";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Filme filme = new Filme();
                filme.setIdFilme(rs.getInt("id_filme"));
                filme.setNomeFilme(rs.getString("nome_filme"));
                filme.setCategoriaFilme(rs.getString("categoria_filme"));
                filme.setClassificacaoFilme(rs.getString("classificacao_filme"));
                filme.setDuracaoFilme(rs.getInt("duracao"));
                filme.setDataFilme(rs.getString("data_cadastro"));
                filme.setValorIngresso(rs.getDouble("valor_ingresso"));
                ConectarDAO.closeConnection(conn, pstm);

                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("data_cadastro"));
                filme.setDataFilme(novaData);

                listaFilme.add(filme);

            }
            ConectarDAO.closeConnection(conn,pstm);
            return listaFilme;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
        }

        return null;
    }


    public List<Filme> pesquisarFilmes() {

        List<Filme> listFilme = new ArrayList<>();

        Connection conn = ConectarDAO.ConectarBD();
        ResultSet rs;
        PreparedStatement pstm;

        try {
            String sql = "Select * from filme";
            pstm = conn.prepareStatement(sql);
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

            ConectarDAO.closeConnection(conn, pstm);

            return listFilme;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
        }

        return null;

    }

     public List<Filme> pesquisarFilmeAlfabetico() {

         ResultSet rs;
         PreparedStatement pstm;
         Connection conn = ConectarDAO.ConectarBD();

        try {
            String sql = "select * from filme order by nome_filme";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Filme objFilme = new Filme();
                objFilme.setIdFilme(rs.getInt("id_filme"));
                objFilme.setNomeFilme(rs.getString("nome_filme"));
                objFilme.setCategoriaFilme(rs.getString("categoria_filme"));
                objFilme.setClassificacaoFilme(rs.getString("classificacao_filme"));
                objFilme.setDuracaoFilme(rs.getInt("duracao"));
                objFilme.setValorIngresso(rs.getDouble("valor_ingresso"));
                objFilme.setDataFilme(rs.getString("data_cadastro"));


                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("data_cadastro"));
                objFilme.setDataFilme(novaData);

                listaFilme.add(objFilme);

            }
            ConectarDAO.closeConnection(conn,pstm);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
            return null;
        }

        return listaFilme;
    }

        public List<Filme> pesquisarFilmeAlfabeticoDesc() {

            ResultSet rs;
            PreparedStatement pstm;
            Connection conn = ConectarDAO.ConectarBD();

        try {
            String sql = "Select * from filme order by nome_filme desc";
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();

            while (rs.next()) {
                Filme objFilme = new Filme();
                objFilme.setIdFilme(rs.getInt("id_filme"));
                objFilme.setNomeFilme(rs.getString("nome_filme"));
                objFilme.setCategoriaFilme(rs.getString("categoria_filme"));
                objFilme.setClassificacaoFilme(rs.getString("classificacao_filme"));
                objFilme.setDuracaoFilme(rs.getInt("duracao"));
                objFilme.setDataFilme(rs.getString("data_cadastro"));
                objFilme.setValorIngresso(rs.getDouble("valor_ingresso"));

                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("data_cadastro"));
                objFilme.setDataFilme(novaData);
                
                listaFilme.add(objFilme);

            }

            ConectarDAO.closeConnection(conn,pstm);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
            return null;
        }

        return listaFilme;

    }
    
    public void alterarFilme(Filme objFilme)
    {
        ResultSet rs;
        PreparedStatement pstm;
        Connection conn = ConectarDAO.ConectarBD();
        try {
            String sqlFunc = "update filme set nome_filme= ?, categoria_filme=? , valor_ingresso=? ,classificacao_filme=?, duracao = ?, data_cadastro = ? where id_filme = ?";

            pstm = conn.prepareStatement(sqlFunc);
            pstm.setString(1, objFilme.getNomeFilme());
            pstm.setString(2, objFilme.getCategoriaFilme());
            pstm.setString(3, objFilme.getClassificacaoFilme());
            pstm.setInt(4, objFilme.getDuracaoFilme());
            pstm.setString(5, objFilme.getDataFilme());
            pstm.setInt(6, objFilme.getIdFilme());
            pstm.setDouble( 7,objFilme.getValorIngresso());

            pstm.execute();
            ConectarDAO.closeConnection(conn,pstm);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo Alterar FILME  " + erro);

        }
    }
    public void excluirFilme(Filme objFilme){

        ResultSet rs;
        PreparedStatement pstm;
        Connection conn = ConectarDAO.ConectarBD();
        try {
            String sqlFunc = "delete from FILME where id_filme = ?";

            pstm = conn.prepareStatement(sqlFunc);
            pstm.setInt(1, objFilme.getIdFilme());

            pstm.execute();
            ConectarDAO.closeConnection(conn,pstm);

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO pacote DAO. Metodo Excluir FILME  " + erro);

        }
    }
}
