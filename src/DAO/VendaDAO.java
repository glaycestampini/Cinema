package DAO;

import classes.Sessao;
import java.sql.Connection;
import classes.Venda;

import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;

import java.util.ArrayList;

public class VendaDAO {

    public VendaDAO() {
    }

    ConectarDAO objDAO = new ConectarDAO();
    Connection conectar = objDAO.ConectarBD();
    
    PreparedStatement pstm;
    
 
    
    
    public ArrayList<Venda> pesquisarVenda(Venda data) {
        ArrayList<Venda> listaVenda = new ArrayList<>();
        ResultSet rst;
        
        try {
            String sql = "Select id_venda, id_filme, sessao_filme, ingresso, preço, total from venda where data_venda = ? ";
            pstm = conectar.prepareStatement(sql);
            
            pstm.setString(1, data.getDataVenda());
            rst = pstm.executeQuery();
            
            
            while (rst.next()) {

                Venda venda = new Venda();
                venda.setIdVenda(rst.getInt("id_venda"));
                venda.setPreco(rst.getInt("ingresso"));
                venda.setPreco(rst.getDouble("preco"));
                venda.setTotal(rst.getDouble("total"));
                venda.setDataVenda(rst.getString("data_venda"));
                venda.setSessao(new Sessao(rst.getInt("id_sessao")));   


                listaVenda.add(venda);

            }
            
               } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe de VendaDAO. No metodo PesquisarVENDA" + erro);
            return null;
        }

        return listaVenda;

    }
    
    
    public void gerarVenda(Venda adcVenda){
    
        conectar = new ConectarDAO().ConectarBD();
        try {
            String sql = "INSERT INTO venda (id_sessao, ingresso ,preco, total, data_venda) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

            pstm = conectar.prepareStatement(sql);
            pstm.setInt(1, adcVenda.getIdVenda());
            pstm.setInt(2, adcVenda.getSessao().getIdSessao());
            pstm.setInt(3, adcVenda.getIngresso());
            pstm.setDouble(4, adcVenda.getPreco());
            pstm.setDouble(5, adcVenda.getTotal());
            pstm.setString(6, adcVenda.getDataVenda());
            

            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe VemdaDAO pacote DAO. Metodo gerar Venda" + erro);

        }

    }
        
     public void excluirVenda(Venda objVenda){
    
         conectar = new ConectarDAO().ConectarBD();
        try {
            String sql = "delete from venda where id_venda= ?";

            pstm = conectar.prepareStatement(sql);
            pstm.setInt(1, objVenda.getIdVenda());

            
            pstm.execute();
            pstm.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe VendaDAO. pacote DAO. Metodo Excluir Venda  " + erro);

        }
    
    
    }
          
    
        
        
    }
    
    
    
    

            
            
            
     
