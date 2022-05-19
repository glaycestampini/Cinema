package Telas;

import Classes.Funcionario;
import DAO.FuncionarioDAO;
import TELAS.GerenteTela;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class CadastroFuncionarioTela extends javax.swing.JFrame {
    
    public CadastroFuncionarioTela() {
        initComponents();
        pesquisarFuncionario();
        ativDesatBotoesCRUD(false);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnADCFunci = new javax.swing.JButton();
        btnSAIRcadastroFunci = new javax.swing.JButton();
        btnCADASTRARFuncio = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbTabelaFuncionario = new javax.swing.JTable();
        btnALTERARFuncio = new javax.swing.JButton();
        btnEXCLUIRFunci = new javax.swing.JButton();
        txtID_Funcionario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnCarreegarfunc = new javax.swing.JButton();
        btnCANCELARFunc = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtLoginFuncionario = new javax.swing.JTextField();
        txtNomeFuncionario = new javax.swing.JTextField();
        txtEndereçoFuncionario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSenhaFuncionario = new javax.swing.JTextField();
        txtCargoFuncionario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtTelefoneFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionario");

        jPanel1.setBackground(new java.awt.Color(235, 237, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnADCFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-mais-24 (1).png"))); // NOI18N
        btnADCFunci.setText("Novo");
        btnADCFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADCFunciActionPerformed(evt);
            }
        });

        btnSAIRcadastroFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-desligar-24.png"))); // NOI18N
        btnSAIRcadastroFunci.setText("Sair");
        btnSAIRcadastroFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSAIRcadastroFunciActionPerformed(evt);
            }
        });

        btnCADASTRARFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-ok-24 (1).png"))); // NOI18N
        btnCADASTRARFuncio.setText("Cadastrar");
        btnCADASTRARFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCADASTRARFuncioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnADCFunci)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCADASTRARFuncio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSAIRcadastroFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADCFunci)
                    .addComponent(btnCADASTRARFuncio)
                    .addComponent(btnSAIRcadastroFunci))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(235, 237, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jtbTabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Login", "Nome", "Senha", "Telefone", "Endereço", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbTabelaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbTabelaFuncionarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbTabelaFuncionario);
        if (jtbTabelaFuncionario.getColumnModel().getColumnCount() > 0) {
            jtbTabelaFuncionario.getColumnModel().getColumn(0).setResizable(false);
            jtbTabelaFuncionario.getColumnModel().getColumn(1).setResizable(false);
            jtbTabelaFuncionario.getColumnModel().getColumn(2).setResizable(false);
            jtbTabelaFuncionario.getColumnModel().getColumn(3).setResizable(false);
            jtbTabelaFuncionario.getColumnModel().getColumn(4).setResizable(false);
            jtbTabelaFuncionario.getColumnModel().getColumn(5).setResizable(false);
            jtbTabelaFuncionario.getColumnModel().getColumn(6).setResizable(false);
        }

        btnALTERARFuncio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-editar-24.png"))); // NOI18N
        btnALTERARFuncio.setText("Alterar");
        btnALTERARFuncio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnALTERARFuncioActionPerformed(evt);
            }
        });

        btnEXCLUIRFunci.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-remover-24.png"))); // NOI18N
        btnEXCLUIRFunci.setText("Excluir");
        btnEXCLUIRFunci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRFunciActionPerformed(evt);
            }
        });

        txtID_Funcionario.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("ID:");

        btnCarreegarfunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-girar-24.png"))); // NOI18N
        btnCarreegarfunc.setText("Carregar");
        btnCarreegarfunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreegarfuncActionPerformed(evt);
            }
        });

        btnCANCELARFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-excluir-24.png"))); // NOI18N
        btnCANCELARFunc.setText("Cancelar");
        btnCANCELARFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELARFuncActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtID_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(btnCANCELARFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCarreegarfunc, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEXCLUIRFunci, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnALTERARFuncio, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtID_Funcionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCANCELARFunc)
                    .addComponent(btnCarreegarfunc)
                    .addComponent(btnEXCLUIRFunci)
                    .addComponent(btnALTERARFuncio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Login:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Nome:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Senha:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Endereço:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Telefone");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Cargo");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEndereçoFuncionario))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(txtLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(27, 27, 27)
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNomeFuncionario))))))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtLoginFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtSenhaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtEndereçoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCargoFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel6)
                    .addComponent(txtTelefoneFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSAIRcadastroFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSAIRcadastroFunciActionPerformed
        // TODO add your handling code here:
        GerenteTela telaGerente = new GerenteTela();
        telaGerente.setVisible(true);
        dispose();

    }//GEN-LAST:event_btnSAIRcadastroFunciActionPerformed

    private void btnCADASTRARFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCADASTRARFuncioActionPerformed
        // TODO add your handling code here:
        cadastrarFuncionario();
        pesquisarFuncionario();
        limparCampos();

    }//GEN-LAST:event_btnCADASTRARFuncioActionPerformed

    private void jtbTabelaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbTabelaFuncionarioMouseClicked
        // TODO add your handling code here:
           btnCarreegarfunc.setEnabled(true);
            btnCANCELARFunc.setEnabled(true);
            ativDesativarBotoesCadastro(false);

    }//GEN-LAST:event_jtbTabelaFuncionarioMouseClicked

    private void btnALTERARFuncioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnALTERARFuncioActionPerformed
        // TODO add your handling code here:
        alterarFuncionario();
        pesquisarFuncionario();
        limparCampos();
        
        
    }//GEN-LAST:event_btnALTERARFuncioActionPerformed

    private void btnEXCLUIRFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRFunciActionPerformed
        // TODO add your handling code here:
        excluirFuncionario();
        pesquisarFuncionario();
        limparCampos();
        

    }//GEN-LAST:event_btnEXCLUIRFunciActionPerformed

    private void btnCarreegarfuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarreegarfuncActionPerformed
            carregarCampos();
            ativDesatBotoesCRUD(true);

    }//GEN-LAST:event_btnCarreegarfuncActionPerformed

    private void btnCANCELARFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELARFuncActionPerformed
        // TODO add your handling code here:
        ativDesativarBotoesCadastro(true);
        ativDesatBotoesCRUD(false);
             limparCampos();

    }//GEN-LAST:event_btnCANCELARFuncActionPerformed

    private void btnADCFunciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADCFunciActionPerformed
        // TODO add your handling code here:
         limparCampos();
    }//GEN-LAST:event_btnADCFunciActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroFuncionarioTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroFuncionarioTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADCFunci;
    private javax.swing.JButton btnALTERARFuncio;
    private javax.swing.JButton btnCADASTRARFuncio;
    private javax.swing.JButton btnCANCELARFunc;
    private javax.swing.JButton btnCarreegarfunc;
    private javax.swing.JButton btnEXCLUIRFunci;
    private javax.swing.JButton btnSAIRcadastroFunci;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtbTabelaFuncionario;
    private javax.swing.JTextField txtCargoFuncionario;
    private javax.swing.JTextField txtEndereçoFuncionario;
    private javax.swing.JTextField txtID_Funcionario;
    private javax.swing.JTextField txtLoginFuncionario;
    private javax.swing.JTextField txtNomeFuncionario;
    private javax.swing.JTextField txtSenhaFuncionario;
    private javax.swing.JTextField txtTelefoneFuncionario;
    // End of variables declaration//GEN-END:variables

    public void cadastrarFuncionario() {
        
        String login_func = txtLoginFuncionario.getText();
        String nome_func = txtNomeFuncionario.getText();
        String senha_func = txtSenhaFuncionario.getText();
        String telefone_func = txtTelefoneFuncionario.getText();
        String endereço_func = txtEndereçoFuncionario.getText();
        String cargo_func = txtCargoFuncionario.getText();
        
        Funcionario objFun = new Funcionario();
        
        objFun.setLogin(login_func);
        objFun.setNome(nome_func);
        objFun.setSenha(senha_func);
        objFun.setTelefone(telefone_func);
        objFun.setEndereço(endereço_func);
        objFun.setCargo(cargo_func);
        
        FuncionarioDAO objFuncionario = new FuncionarioDAO();
        objFuncionario.AdicionarFuncionario(objFun);
        
    }
    
    public void pesquisarFuncionario() {
        try {
            FuncionarioDAO objFuncionario = new FuncionarioDAO();
            
            DefaultTableModel tabelaModel = (DefaultTableModel) jtbTabelaFuncionario.getModel();
            tabelaModel.setNumRows(0);
            
            ArrayList<Funcionario> listaFuncionario = objFuncionario.pesquisarFuncionario();
            
            for (int num = 0; num < listaFuncionario.size(); num++) {
                tabelaModel.addRow(new Object[]{
                    listaFuncionario.get(num).getId(),
                    listaFuncionario.get(num).getLogin(),
                    listaFuncionario.get(num).getNome(),
                    listaFuncionario.get(num).getSenha(),
                    listaFuncionario.get(num).getTelefone(),
                    listaFuncionario.get(num).getEndereço(),
                    listaFuncionario.get(num).getCargo(),});
            }
            
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no botao pesquisar funcionario" + erro);
            
        }
        
    }
    
    public void limparCampos() {
        
        txtLoginFuncionario.setText("");
        txtNomeFuncionario.setText("");
        txtSenhaFuncionario.setText("");
        txtTelefoneFuncionario.setText("");
        txtCargoFuncionario.setText("");
        txtEndereçoFuncionario.setText("");
        txtID_Funcionario.setText("");
        
    }
    
    public void alterarFuncionario() {
        
        int id_funcionario;
        id_funcionario = Integer.parseInt(txtID_Funcionario.getText());
        
        String login_func = txtLoginFuncionario.getText();
        String nome_func = txtNomeFuncionario.getText();
        String senha_func = txtSenhaFuncionario.getText();
        String telefone_func = txtTelefoneFuncionario.getText();
        String endereço_func = txtEndereçoFuncionario.getText();
        String cargo_func = txtCargoFuncionario.getText();
        
        Funcionario objFuncionario = new Funcionario();
        
        objFuncionario.setId(id_funcionario);
        objFuncionario.setLogin(login_func);
        objFuncionario.setSenha(senha_func);
        objFuncionario.setTelefone(telefone_func);
        objFuncionario.setEndereço(endereço_func);
        objFuncionario.setNome(nome_func);
        objFuncionario.setCargo(cargo_func);
        
        FuncionarioDAO objDAO = new FuncionarioDAO();
        objDAO.alterarFuncionario(objFuncionario);
        
    }
    
    public void excluirFuncionario() {
        
        int id_funcionario;
        id_funcionario = Integer.parseInt(txtID_Funcionario.getText());
        
        String login_func = txtLoginFuncionario.getText();
        String nome_func = txtNomeFuncionario.getText();
        String senha_func = txtSenhaFuncionario.getText();
        String telefone_func = txtTelefoneFuncionario.getText();
        String endereço_func = txtEndereçoFuncionario.getText();
        String cargo_func = txtCargoFuncionario.getText();
        
        Funcionario objFuncionario = new Funcionario();
        
        objFuncionario.setId(id_funcionario);
        objFuncionario.setLogin(login_func);
        objFuncionario.setSenha(senha_func);
        objFuncionario.setTelefone(telefone_func);
        objFuncionario.setEndereço(endereço_func);
        objFuncionario.setNome(nome_func);
        objFuncionario.setCargo(cargo_func);
        
        FuncionarioDAO objDAO = new FuncionarioDAO();
        objDAO.excluirFuncionario(objFuncionario);
        
    }
    
    
    
    public void carregarCampos()
    {
    
         int linha = jtbTabelaFuncionario.getSelectedRow();

        txtID_Funcionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 0).toString());
        txtLoginFuncionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 1).toString());
        txtNomeFuncionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 2).toString());
        txtSenhaFuncionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 3).toString());
        txtTelefoneFuncionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 4).toString());
        txtEndereçoFuncionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 5).toString());
        txtCargoFuncionario.setText(jtbTabelaFuncionario.getModel().getValueAt(linha, 6).toString());
    }
    
    
    public void ativDesatBotoesCRUD(boolean status) 
    {
        
        btnCANCELARFunc.setEnabled(status);
        btnALTERARFuncio.setEnabled(status);
        btnEXCLUIRFunci.setEnabled(status);
        btnCarreegarfunc.setEnabled(status);

    }
    
    
    public void ativDesativarBotoesCadastro(boolean status){
         btnCADASTRARFuncio.setEnabled(status);
        btnADCFunci.setEnabled(status);
        
    
    
    }
    
    
    
    
}
