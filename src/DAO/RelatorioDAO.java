/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author PC
 */

import classes.Relatorio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class RelatorioDAO {
    
    ConectarDAO objConectarDAO = new ConectarDAO();
    Connection conectar = objConectarDAO.ConectarBD();

    PreparedStatement preparo = null;
    ResultSet rst = null;
   
    
     public ArrayList<Relatorio>  gerarRelatorio(Relatorio datas) {
        
        ArrayList<Relatorio> listaRelatorio = new ArrayList<>();
        ResultSet gerarRelatorio;
        
        
        try {
            String sql = "select data_venda, nome_filme, sala_filme, sessao_filme, ingresso, preço, total from venda " 
                    + "where data_venda between ? and ? "
                    + "order by data_venda";
            preparo = conectar.prepareStatement(sql);
            
            preparo.setString(1, datas.getDataInicio());
            preparo.setString(2, datas.getDataFim());
            
            gerarRelatorio = preparo.executeQuery();
            

            while (gerarRelatorio.next()) {
                Relatorio objRelatorio = new Relatorio();
                String novaData = new SimpleDateFormat("dd/MM/yyyy").format(gerarRelatorio.getDate("data_venda"));
                objRelatorio.setData(novaData);
                objRelatorio.setNome(gerarRelatorio.getString("nome_filme"));
                objRelatorio.setSala(gerarRelatorio.getString("sala_filme"));
                objRelatorio.setSessao(gerarRelatorio.getString("sessao_filme"));
                objRelatorio.setQuantidade(gerarRelatorio.getInt("ingresso"));
                objRelatorio.setPreco(gerarRelatorio.getDouble("preço"));
                objRelatorio.setTotal(gerarRelatorio.getDouble("total"));

                listaRelatorio.add(objRelatorio);
                
            }
            
            

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarRelatorio " + erro);
            return null;
        }
        
        return listaRelatorio;

    }
     
     public int gerarIngressos(Relatorio datas){
        
        int totIngressos = 0;
        ResultSet gerarRelatorioGeral;
        
        try {
            String sql = "select sum(ingresso) as qtdtotal from venda where data_venda between ? and ?";
            preparo = conectar.prepareStatement(sql);
            
            preparo.setString(1, datas.getDataInicio());
            preparo.setString(2, datas.getDataFim());
            
            gerarRelatorioGeral = preparo.executeQuery();
            
            
            while (gerarRelatorioGeral.next()) {

                totIngressos = gerarRelatorioGeral.getInt("qtdtotal");
                
            }
            
        return totIngressos;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarIngressos " + erro);
            return 0;
        }
        
    }
     
     
     public int gerarQtdFilmes(Relatorio datas){
        
        int totalFilmes = 0;
        ResultSet gerarRelatorioGeral;
        
        try {
            String sql = "select count(distinct nome_filme) as qtdtotal from venda " +
                        "where data_venda between ? and ?";
            preparo = conectar.prepareStatement(sql);
            
            preparo.setString(1, datas.getDataInicio());
            preparo.setString(2, datas.getDataFim());
            
            gerarRelatorioGeral = preparo.executeQuery();
            
            
            while (gerarRelatorioGeral.next()) {

                totalFilmes = gerarRelatorioGeral.getInt("qtdtotal");
                
            }
            
        return totalFilmes;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarQtdFilmes " + erro);
            return 0;
        }
        
    }     
     public int gerarSessoes(Relatorio datas){
        
        int totalSessoes = 0;
        ResultSet gerarRelatorioGeral;
        
        try {
            String sql = "select count(distinct sessao_filme, nome_filme) as qtdtotal from venda " 
                    + "where data_venda between ? and ?";
            preparo = conectar.prepareStatement(sql);
            
            preparo.setString(1, datas.getDataInicio());
            preparo.setString(2, datas.getDataFim());
            
            gerarRelatorioGeral = preparo.executeQuery();
            
            
            while (gerarRelatorioGeral.next()) {

                totalSessoes = gerarRelatorioGeral.getInt("qtdtotal");
                
            }
            
        return totalSessoes;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarSessoes " + erro);
            return 0;
        }
        
    }     
     public double gerarReceita(Relatorio datas){
        
        double valorTotal = 0;
        ResultSet gerarRelatorioGeral;
        
        try {
            String sql = "select sum(total) as receita from venda where data_venda between ? and ?";
            preparo = conectar.prepareStatement(sql);
            
            preparo.setString(1, datas.getDataInicio());
            preparo.setString(2, datas.getDataFim());
            
            gerarRelatorioGeral = preparo.executeQuery();
            
            
            while (gerarRelatorioGeral.next()) {

                valorTotal = gerarRelatorioGeral.getDouble("receita");
                                
            }
            
        return valorTotal;
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe RelatorioDAO. pacote DAO. Metodo gerarReceita " + erro);
            return 0;
        }
        
    }
    
}
