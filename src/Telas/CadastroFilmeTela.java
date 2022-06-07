package Telas;

import Classes.Filme;
import DAO.FilmeDAO;
import TELAS.GerenteTela;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CadastroFilmeTela extends javax.swing.JFrame {

    public CadastroFilmeTela() {
        initComponents();
        ativDesatBotoesCRUD(false);
        pesquisarFilme();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnADCFilme = new javax.swing.JButton();
        btnSAIRcadastroFilme = new javax.swing.JButton();
        btnCADASTRARFilme = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaFilme = new javax.swing.JTable();
        btnALTERARFilme = new javax.swing.JButton();
        btnEXCLUIRFilme = new javax.swing.JButton();
        txtID_FILME = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCarreegar = new javax.swing.JButton();
        btnCANCELARFilme = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNomeFilme = new javax.swing.JTextField();
        txtCategoriaFilme = new javax.swing.JTextField();
        txtSessãoFilme = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tCBOXClassificaçao = new javax.swing.JComboBox<>();
        tCBOXSala = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Filme");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(235, 237, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnADCFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-mais-24 (1).png"))); // NOI18N
        btnADCFilme.setText("Novo");
        btnADCFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADCFilmeActionPerformed(evt);
            }
        });

        btnSAIRcadastroFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-desligar-24.png"))); // NOI18N
        btnSAIRcadastroFilme.setText("Sair");
        btnSAIRcadastroFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRcadastroFilmeActionPerformed(evt);
            }
        });

        btnCADASTRARFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-ok-24 (1).png"))); // NOI18N
        btnCADASTRARFilme.setText("Cadastrar");
        btnCADASTRARFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRARFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnADCFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCADASTRARFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSAIRcadastroFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADCFilme)
                    .addComponent(btnSAIRcadastroFilme)
                    .addComponent(btnCADASTRARFilme))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(235, 237, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbTabelaFilme.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nome", "Categoria", "Classificação", "Sala", "Sessão"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTabelaFilme.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTabelaFilmeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTabelaFilme);
        if (jtbTabelaFilme.getColumnModel().getColumnCount() > 0) {
            jtbTabelaFilme.getColumnModel().getColumn(0).setResizable(false);
            jtbTabelaFilme.getColumnModel().getColumn(1).setResizable(false);
            jtbTabelaFilme.getColumnModel().getColumn(2).setResizable(false);
            jtbTabelaFilme.getColumnModel().getColumn(3).setResizable(false);
            jtbTabelaFilme.getColumnModel().getColumn(4).setResizable(false);
            jtbTabelaFilme.getColumnModel().getColumn(5).setResizable(false);
        }

        btnALTERARFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-editar-24.png"))); // NOI18N
        btnALTERARFilme.setText("Alterar");
        btnALTERARFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARFilmeActionPerformed(evt);
            }
        });

        btnEXCLUIRFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-remover-24.png"))); // NOI18N
        btnEXCLUIRFilme.setText("Excluir");
        btnEXCLUIRFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRFilmeActionPerformed(evt);
            }
        });

        txtID_FILME.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("ID:");

        btnCarreegar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-girar-24.png"))); // NOI18N
        btnCarreegar.setText("Carregar");
        btnCarreegar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreegarActionPerformed(evt);
            }
        });

        btnCANCELARFilme.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-excluir-24.png"))); // NOI18N
        btnCANCELARFilme.setText("Cancelar");
        btnCANCELARFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELARFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnALTERARFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEXCLUIRFilme, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCarreegar, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtID_FILME, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCANCELARFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnALTERARFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEXCLUIRFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarreegar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(btnCANCELARFilme)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID_FILME, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Categoria:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Classificação:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Sessão:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Sala:");

        tCBOXClassificaçao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "Livre", "+10", "+12", "+14", "+16", "+18", " " }));
        tCBOXClassificaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCBOXClassificaçaoActionPerformed(evt);
            }
        });

        tCBOXSala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar", "sala 1", "sala 2", "sala 3", "sala 4", "sala 5", "sala 6", "sala 7", "sala 8", "sala 9", "sala 10", " ", " ", " " }));
        tCBOXSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tCBOXSalaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomeFilme)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(tCBOXSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCategoriaFilme, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(tCBOXClassificaçao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtSessãoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(tCBOXSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCategoriaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(tCBOXClassificaçao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txtSessãoFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEXCLUIRFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRFilmeActionPerformed
        // TODO add your handling code here:
        excluirFilme();
        pesquisarFilme();
        limparComponentes();
        
        
    }//GEN-LAST:event_btnEXCLUIRFilmeActionPerformed

    private void btnCADASTRARFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRARFilmeActionPerformed
        // TODO add your handling code here:
        cadastrarFilme();
        pesquisarFilme();
        limparComponentes();


    }//GEN-LAST:event_btnCADASTRARFilmeActionPerformed

    private void btnSAIRcadastroFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRcadastroFilmeActionPerformed
        // TODO add your handling code here:
        GerenteTela telaGerente = new GerenteTela();
        telaGerente.setVisible(true);
        dispose();


    }//GEN-LAST:event_btnSAIRcadastroFilmeActionPerformed


    private void tCBOXClassificaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCBOXClassificaçaoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_tCBOXClassificaçaoActionPerformed


    private void tCBOXSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tCBOXSalaActionPerformed
        // TODO add your handling code here:
        String escolherSala_filme = tCBOXSala.getSelectedItem().toString();

    }//GEN-LAST:event_tCBOXSalaActionPerformed

    private void btnCarreegarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarreegarActionPerformed
        ativDesatBotoesCRUD(true);
        carregarComponentes();
      


    }//GEN-LAST:event_btnCarreegarActionPerformed

    private void jtbTabelaFilmeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTabelaFilmeMouseClicked
        // TODO add your handling code here:
        btnCarreegar.setEnabled(true);
        btnCANCELARFilme.setEnabled(true);
        ativDesativarBotoesCadastro(false);
        
        
    }//GEN-LAST:event_jtbTabelaFilmeMouseClicked

    private void btnCANCELARFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELARFilmeActionPerformed
        // TODO add your handling code here:
         ativDesativarBotoesCadastro(true);
         ativDesatBotoesCRUD(false);
         limparComponentes();
        
        
    }//GEN-LAST:event_btnCANCELARFilmeActionPerformed

    private void btnALTERARFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARFilmeActionPerformed
        // TODO add your handling code here:
        alterarFilmes();
        pesquisarFilme();
        
        
        
    }//GEN-LAST:event_btnALTERARFilmeActionPerformed

    private void btnADCFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADCFilmeActionPerformed
        // TODO add your handling code here:
        limparComponentes();
        
        
    }//GEN-LAST:event_btnADCFilmeActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFilmeTela().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADCFilme;
    private javax.swing.JButton btnALTERARFilme;
    private javax.swing.JButton btnCADASTRARFilme;
    private javax.swing.JButton btnCANCELARFilme;
    private javax.swing.JButton btnCarreegar;
    private javax.swing.JButton btnEXCLUIRFilme;
    private javax.swing.JButton btnSAIRcadastroFilme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbTabelaFilme;
    private javax.swing.JComboBox<String> tCBOXClassificaçao;
    private javax.swing.JComboBox<String> tCBOXSala;
    private javax.swing.JTextField txtCategoriaFilme;
    private javax.swing.JTextField txtID_FILME;
    private javax.swing.JTextField txtNomeFilme;
    private javax.swing.JTextField txtSessãoFilme;
    // End of variables declaration//GEN-END:variables

    public void cadastrarFilme() {

        Filme objFilme = new Filme();
        FilmeDAO daoFilme = new FilmeDAO();

        String escolherSala_filme = tCBOXSala.getSelectedItem().toString();
        String classificação_filme = tCBOXClassificaçao.getSelectedItem().toString();

        objFilme.setClassificaçao_filme(classificação_filme);
        objFilme.setSala_filme(escolherSala_filme);
        String nome_filme = txtNomeFilme.getText();
        String Categoria_filme = txtCategoriaFilme.getText();
        String sessão_filme = txtSessãoFilme.getText();

        objFilme.setNome_filme(nome_filme);
        objFilme.setCategoria_filme(Categoria_filme);
        objFilme.setSessao_filme(sessão_filme);

        daoFilme.cadastrarFilme(objFilme);

    }

    public void ativDesatBotoesCRUD(boolean status) 
    {
        btnCANCELARFilme.setEnabled(status);
        btnALTERARFilme.setEnabled(status);
        btnEXCLUIRFilme.setEnabled(status);
        btnCarreegar.setEnabled(status);

    }
    
    
    public void ativDesativarBotoesCadastro(boolean status){
         btnCADASTRARFilme.setEnabled(status);
        btnADCFilme.setEnabled(status);
        
    
    
    }

    public void carregarComponentes() {
        int linha = jtbTabelaFilme.getSelectedRow();

        txtID_FILME.setText(jtbTabelaFilme.getModel().getValueAt(linha, 0).toString());
        txtNomeFilme.setText(jtbTabelaFilme.getModel().getValueAt(linha, 1).toString());
        txtCategoriaFilme.setText(jtbTabelaFilme.getModel().getValueAt(linha, 2).toString());
        tCBOXClassificaçao.setSelectedItem(jtbTabelaFilme.getModel().getValueAt(linha, 3).toString());
        tCBOXSala.setSelectedItem(jtbTabelaFilme.getModel().getValueAt(linha, 4).toString());
        txtSessãoFilme.setText(jtbTabelaFilme.getModel().getValueAt(linha, 5).toString());

    }
    

    public void limparComponentes() {

        txtID_FILME.setText("");
        txtNomeFilme.setText("");
        txtCategoriaFilme.setText("");
        tCBOXClassificaçao.setSelectedIndex(0);
        tCBOXSala.setSelectedIndex(0);
        txtSessãoFilme.setText("");

    }

    public void pesquisarFilme() {

        try {
            FilmeDAO daoFilme = new FilmeDAO();

            DefaultTableModel tabelaModel = (DefaultTableModel) jtbTabelaFilme.getModel();
            tabelaModel.setNumRows(0);

            ArrayList<Filme> listaFilme = daoFilme.pesquisarFilme();

            for (int num = 0; num < listaFilme.size(); num++) {
                tabelaModel.addRow(new Object[]{
                    listaFilme.get(num).getId_filme(),
                    listaFilme.get(num).getNome_filme(),
                    listaFilme.get(num).getCategoria_filme(),
                    listaFilme.get(num).getClassificaçao_filme(),
                    listaFilme.get(num).getSala_filme(),
                    listaFilme.get(num).getSessao_filme(),});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no botao pesquisar" + erro);

        }

    }
    
    
    public void alterarFilmes(){
        
        int id_filme;
        id_filme = Integer.parseInt(txtID_FILME.getText());
        String nome = txtNomeFilme.getText();
        String  categoria = txtCategoriaFilme.getText();
        String sala = tCBOXSala.getSelectedItem().toString();
        String classificação = tCBOXClassificaçao.getSelectedItem().toString();
        String sessao = txtSessãoFilme.getText();
    
    
        Filme objFilme = new Filme();
        
       
        
        objFilme.setId_filme(id_filme);
        objFilme.setNome_filme(nome);
        objFilme.setCategoria_filme(categoria);
        objFilme.setSala_filme(sala);
        objFilme.setSessao_filme(sessao);
        objFilme.setClassificaçao_filme(classificação);
        
    
        FilmeDAO objDAO = new FilmeDAO();
        objDAO.alterarFilme(objFilme);
        
    }
    
    
    public void excluirFilme()
    {
         int id_filme;
        id_filme = Integer.parseInt(txtID_FILME.getText());
        String nome = txtNomeFilme.getText();
        String  categoria = txtCategoriaFilme.getText();
        String sala = tCBOXSala.getSelectedItem().toString();
        String classificação = tCBOXClassificaçao.getSelectedItem().toString();
        String sessao = txtSessãoFilme.getText();
    
    
        Filme objFilme = new Filme();
        
        objFilme.setId_filme(id_filme);
        objFilme.setNome_filme(nome);
        objFilme.setCategoria_filme(categoria);
        objFilme.setSala_filme(sala);
        objFilme.setSessao_filme(sessao);
        objFilme.setClassificaçao_filme(classificação);
        
    
        FilmeDAO objDAO = new FilmeDAO();
        objDAO.excluirFilme(objFilme);
        
        
    
    
    
    }
    
    
    
    

}
