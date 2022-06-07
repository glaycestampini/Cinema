package DAO;

import classes.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class SessaoDAO {

    ConectarDAO objConectarDAO = new ConectarDAO();
    Connection conn = objConectarDAO.ConectarBD();
    

public List<Sessao> selecionarSessaoPorIdFilme(int idFilme) {

   List<Sessao> listSessao = new ArrayList<>();

   ResultSet rs;
   PreparedStatement pstm;

    try {
            String sql = "Select * from sessao where id_filme = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1,idFilme);
            rs = pstm.executeQuery();


            while (rs.next()) {
                Sessao sessao = new Sessao();

                sessao.setIdSessao(rs.getInt("id_sessao"));
                sessao.setSala(new Sala(rs.getInt("id_sala")));
                sessao.setFilme(new Filme(rs.getInt("id_filme")));
                sessao.setAssento(new Assento(rs.getInt("id_assento")));
                sessao.setDataHorario(DataHorarioDAO.selecionarDataHorarioPeloId(rs.getInt("id_dataHorario")));

                listSessao.add(sessao);
            }

            ConectarDAO.closeConnection(conn, pstm);

            return listSessao;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro na classe FILMEDAO.  pacote DAO. Metodo PESQUISAR" + erro);
        }


return null;
}
}
