package DAO;


import classes.*;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataHorarioDAO {

    public static DataHorario selecionarDataHorarioPeloId(int id) {

        Connection conn = ConectarDAO.ConectarBD();
        List<DataHorario> dataHorarioList = new ArrayList<>();

        ResultSet rs;
        PreparedStatement pstm;

        try {
            String sql = "Select * from dataHorario where id_dataHorario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,id);
            rs = pstm.executeQuery();

            DataHorario dataHorario = new DataHorario(
                    rs.getInt("id_dataHorario"),
                    rs.getDate("data"),
                    rs.getString("horario")
            );


            ConectarDAO.closeConnection(conn, pstm);

            return dataHorario;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
        }


        return null;
    }
    
}
