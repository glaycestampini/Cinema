package DAO;

import java.sql.Connection;
import Classes.Venda;

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
    
    PreparedStatement preparo;
    
 
    
    
    public ArrayList<Venda> pesquisarVenda() {
        ArrayList<Venda> listaVenda = new ArrayList<>();
        ResultSet rst;
        
        try {
            String sql = "Select * from venda";
            preparo = conectar.prepareStatement(sql);
            rst = preparo.executeQuery();
            
            
            while (rst.next()) {

                Venda objVenda = new Venda();
                objVenda.setId_venda(rst.getInt("ID_VENDA"));
                objVenda.setId_filme(rst.getInt("ID_FILME"));
                objVenda.setIngresso(rst.getInt("INGRESSO"));
                objVenda.setPreço(rst.getDouble("PREÇO"));
                objVenda.setTotal(rst.getDouble("TOTAL"));
                

                listaVenda.add(objVenda);

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
            String sql = "INSERT INTO venda (id_filme, ingresso ,PREÇO, TOTAL) "
                    + "VALUES (?, ?, ?,?)";

            preparo = conectar.prepareStatement(sql);
            preparo.setInt(1, adcVenda.getId_filme());
            preparo.setInt(2, adcVenda.getIngresso());
            preparo.setDouble(3, adcVenda.getPreço());
            preparo.setDouble(4, adcVenda.getTotal());
            
         
            
          

            
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe VemdaDAO pacote DAO. Metodo gerar Venda" + erro);

        }

    }
        
     public void excluirVenda(Venda objVenda){
    
         conectar = new ConectarDAO().ConectarBD();
        try {
            String sqlFunc = "delete from venda where id_venda= ?";

            preparo = conectar.prepareStatement(sqlFunc);
            preparo.setInt(1, objVenda.getId_filme());

            
            preparo.execute();
            preparo.close();

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe VendaDAO. pacote DAO. Metodo Excluir Venda  " + erro);

        }
    
    
    }
          
    
        
        
    }
    
    
    
    

            
            
            
     
