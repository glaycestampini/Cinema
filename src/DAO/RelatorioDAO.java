/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import classes.Relatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RelatorioDAO {

    
     public ArrayList<Relatorio>  gerarRelatorio(Relatorio datas) {
        
         ArrayList<Relatorio> listaRelatorio = new ArrayList<>();
         Connection conn = ConectarDAO.ConectarBD();

         ResultSet rs;
         PreparedStatement pstm;

        try {
            String sql = "select data_venda, nome_filme, sala_filme, sessao_filme, ingresso, preço, total from venda " 
                    + "where data_venda between ? and ? "
                    + "order by data_venda";
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, datas.getDataInicio());
            pstm.setString(2, datas.getDataFim());
            
            rs = pstm.executeQuery();
            

            while (rs.next()) {
                Relatorio objRelatorio = new Relatorio();
                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(rs.getDate("data_venda"));
                objRelatorio.setData(novaData);
                objRelatorio.setNome(rs.getString("nome_filme"));
                objRelatorio.setSala(rs.getString("sala_filme"));
                objRelatorio.setSessao(rs.getString("sessao_filme"));
                objRelatorio.setQuantidade(rs.getInt("ingresso"));
                objRelatorio.setPreco(rs.getDouble("preço"));
                objRelatorio.setTotal(rs.getDouble("total"));

                listaRelatorio.add(objRelatorio);
                
            }
            ConectarDAO.closeConnection(conn,pstm);
            return listaRelatorio;


        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarRelatorio " + erro);
        }
        return null;
    }
     
     public int gerarIngressos(Relatorio datas){

         Connection conn = ConectarDAO.ConectarBD();

         ResultSet rs;
         PreparedStatement pstm;
        
        int totIngressos = 0;
        ResultSet gerarRelatorioGeral;
        
        try {
            String sql = "select sum(ingresso) as qtdtotal from venda where data_venda between ? and ?";
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, datas.getDataInicio());
            pstm.setString(2, datas.getDataFim());
            
            gerarRelatorioGeral = pstm.executeQuery();
            
            
            while (gerarRelatorioGeral.next()) {

                totIngressos = gerarRelatorioGeral.getInt("qtdtotal");
                
            }
        ConectarDAO.closeConnection(conn,pstm);
        return totIngressos;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarIngressos " + erro);
        }
         return 0;
    }
     
     
     public int gerarQtdFilmes(Relatorio datas){
        
         int totalFilmes = 0;
         Connection conn = ConectarDAO.ConectarBD();

         ResultSet rs;
         PreparedStatement pstm;
        
        try {
            String sql = "select count(distinct nome_filme) as qtdtotal from venda " +
                        "where data_venda between ? and ?";
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, datas.getDataInicio());
            pstm.setString(2, datas.getDataFim());
            
            rs = pstm.executeQuery();

            while (rs.next()) {

                totalFilmes = rs.getInt("qtdtotal");
                
            }
        ConectarDAO.closeConnection(conn,pstm);
        return totalFilmes;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarQtdFilmes " + erro);
            return 0;
        }
        
    }     
     public int gerarSessoes(Relatorio datas){
        
        int totalSessoes = 0;
        ResultSet resultSet;
        Connection conn = ConectarDAO.ConectarBD();
        PreparedStatement pstm;
        
        try {
            String sql = "select count(distinct sessao_filme, nome_filme) as qtdtotal from venda " 
                    + "where data_venda between ? and ?";
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, datas.getDataInicio());
            pstm.setString(2, datas.getDataFim());
            
            resultSet = pstm.executeQuery();
            
            
            while (resultSet.next()) {

                totalSessoes = resultSet.getInt("qtdtotal");
                
            }
        ConectarDAO.closeConnection(conn,pstm);
        return totalSessoes;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarSessoes " + erro);
            return 0;
        }
        
    }     
     public double gerarReceita(Relatorio datas){
        
         double valorTotal = 0;
         ResultSet rs;
         Connection conn = ConectarDAO.ConectarBD();
         PreparedStatement pstm;
        
        try {
            String sql = "select sum(total) as receita from venda where data_venda between ? and ?";
            pstm = conn.prepareStatement(sql);
            
            pstm.setString(1, datas.getDataInicio());
            pstm.setString(2, datas.getDataFim());
            
            rs = pstm.executeQuery();
            
            
            while (rs.next()) {

                valorTotal = rs.getDouble("receita");
                                
            }
            ConectarDAO.closeConnection(conn,pstm);
            return valorTotal;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarReceita " + erro);
        }
        return 0;
    }
}
