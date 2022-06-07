package telaSistema;

import classes.Filme;
import DAO.VendaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import classes.Venda;

import DAO.FilmeDAO;
import telaSistema.CadastroFilmeTela;
import telaSistema.CadastroFuncionarioTela;
import telaSistema.LoginTela;
import telaSistema.RelatorioTela;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class GerenteTela extends javax.swing.JFrame {

    public GerenteTela() {
        initComponents();
        pesquisarFilme();
        pesquisarVenda();
        desativarBotoesTELAvenda(false);
        desBotoesVenda(false);
        setDataHoje();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtMenuID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMeNuSESSAO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMenuSala = new javax.swing.JTextField();
        txtNomeMenu = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnCarregar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtbModelVendaMenu1 = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        txtID_VENDA = new javax.swing.JTextField();
        btnBuscarVendasMenu1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtIDVendaFilme = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnEXCLUIRVenda = new javax.swing.JButton();
        btnCANCELARVenda = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbModelFilmeMenu = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        cboxOrdem = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtValorIngressos = new javax.swing.JTextField();
        txtMenuTOTAL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnMenuFinalizar = new javax.swing.JButton();
        btnMenuCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtQuantidadeIngressos = new javax.swing.JTextField();
        btnMenuCalcular = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        txtData = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuCadastrarFUNC = new javax.swing.JMenuItem();
        jMenuCadastrarFILM = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        btnRelatorio = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        JMSAIRTELA = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Gerente");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(235, 237, 236));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("SALA:");

        txtMenuID.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("NOME:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("ID_FILME:");

        txtMeNuSESSAO.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("SESSÃO:");

        txtMenuSala.setEnabled(false);

        txtNomeMenu.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnCarregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-girar-24.png"))); // NOI18N
        btnCarregar.setText("Carregar");
        btnCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtMenuID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMeNuSESSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMenuSala, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNomeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(133, 133, 133))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMenuID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel1)
                        .addComponent(txtMeNuSESSAO, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(txtMenuSala, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnCarregar))
                .addGap(65, 65, 65)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(235, 237, 236));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("VENDAS");

        jtbModelVendaMenu1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Venda", "ID Filme", "Sessão", "Ingressos", "Valor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtbModelVendaMenu1);
        if (jtbModelVendaMenu1.getColumnModel().getColumnCount() > 0) {
            jtbModelVendaMenu1.getColumnModel().getColumn(0).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(1).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(3).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(4).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(5).setResizable(false);
        }

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("ID_VENDA:");

        txtID_VENDA.setEnabled(false);

        btnBuscarVendasMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-girar-24.png"))); // NOI18N
        btnBuscarVendasMenu1.setText("Carregar ");
        btnBuscarVendasMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendasMenu1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("ID_FILME:");

        txtIDVendaFilme.setEnabled(false);
        txtIDVendaFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDVendaFilmeActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        btnEXCLUIRVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-remover-24.png"))); // NOI18N
        btnEXCLUIRVenda.setText("Excluir");
        btnEXCLUIRVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEXCLUIRVendaActionPerformed(evt);
            }
        });

        btnCANCELARVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMAGEM/icons8-excluir-24.png"))); // NOI18N
        btnCANCELARVenda.setText("Cancelar");
        btnCANCELARVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCANCELARVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(btnBuscarVendasMenu1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnEXCLUIRVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnCANCELARVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtID_VENDA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtIDVendaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))))))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtID_VENDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtIDVendaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarVendasMenu1)
                    .addComponent(btnEXCLUIRVenda)
                    .addComponent(btnCANCELARVenda))
                .addGap(23, 23, 23))
        );

        jPanel3.setBackground(new java.awt.Color(235, 237, 236));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtbModelFilmeMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Gênero", "Classificação", "Duração", "Sala", "Sessão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtbModelFilmeMenu);
        if (jtbModelFilmeMenu.getColumnModel().getColumnCount() > 0) {
            jtbModelFilmeMenu.getColumnModel().getColumn(0).setPreferredWidth(15);
            jtbModelFilmeMenu.getColumnModel().getColumn(1).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(1).setPreferredWidth(100);
            jtbModelFilmeMenu.getColumnModel().getColumn(2).setPreferredWidth(50);
            jtbModelFilmeMenu.getColumnModel().getColumn(3).setPreferredWidth(30);
            jtbModelFilmeMenu.getColumnModel().getColumn(4).setPreferredWidth(20);
            jtbModelFilmeMenu.getColumnModel().getColumn(5).setPreferredWidth(15);
            jtbModelFilmeMenu.getColumnModel().getColumn(6).setPreferredWidth(30);
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FILMES");

        cboxOrdem.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Data de cadastro", "Crescente (alfabético)", "Decrescente (alfabético)" }));
        cboxOrdem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxOrdemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(cboxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboxOrdem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(235, 237, 236));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("VALOR:");

        txtMenuTOTAL.setEnabled(false);
        txtMenuTOTAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMenuTOTALActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("TOTAL:");

        btnMenuFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-ok-24 (1).png"))); // NOI18N
        btnMenuFinalizar.setText("Finalizar");
        btnMenuFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuFinalizarActionPerformed(evt);
            }
        });

        btnMenuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-excluir-24.png"))); // NOI18N
        btnMenuCancelar.setText("Cancelar");
        btnMenuCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCancelarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("INGRESSOS:");

        txtQuantidadeIngressos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQuantidadeIngressosActionPerformed(evt);
            }
        });

        btnMenuCalcular.setText("Calcular");
        btnMenuCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuCalcularActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("DATA:");

        txtData.setEditable(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtQuantidadeIngressos, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addComponent(txtValorIngressos))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(btnMenuCalcular))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMenuTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenuCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenuFinalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(txtQuantidadeIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)
                        .addComponent(txtData, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnMenuFinalizar))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnMenuCancelar)
                    .addComponent(btnMenuCalcular, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtMenuTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14))
        );

        jMenuBar1.setToolTipText("");

        jMenuCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-mais-24 (1).png"))); // NOI18N
        jMenuCadastrar.setMnemonic('C');
        jMenuCadastrar.setText("Cadastrar");

        jMenuCadastrarFUNC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuCadastrarFUNC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-usuário-24.png"))); // NOI18N
        jMenuCadastrarFUNC.setText("Funcionário");
        jMenuCadastrarFUNC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarFUNCActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadastrarFUNC);

        jMenuCadastrarFILM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuCadastrarFILM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-rolo-de-filme-24.png"))); // NOI18N
        jMenuCadastrarFILM.setText("Filme");
        jMenuCadastrarFILM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCadastrarFILMActionPerformed(evt);
            }
        });
        jMenuCadastrar.add(jMenuCadastrarFILM);

        jMenuBar1.add(jMenuCadastrar);

        jMenuVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-remover-tag-24.png"))); // NOI18N
        jMenuVenda.setText("Venda");

        btnRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-visualizar-arquivo-24.png"))); // NOI18N
        btnRelatorio.setText("Relatórios");
        btnRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRelatorioActionPerformed(evt);
            }
        });
        jMenuVenda.add(btnRelatorio);

        jMenuBar1.add(jMenuVenda);

        jMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-desligar-24.png"))); // NOI18N

        JMSAIRTELA.setText("Sair");
        JMSAIRTELA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMSAIRTELAActionPerformed(evt);
            }
        });
        jMenuSair.add(JMSAIRTELA);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuCadastrarFILMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarFILMActionPerformed
        // TODO add your handling code here:

        CadastroFilmeTela telaCadastro = new CadastroFilmeTela();
        telaCadastro.setVisible(true);
        dispose();


    }//GEN-LAST:event_jMenuCadastrarFILMActionPerformed

    private void jMenuCadastrarFUNCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCadastrarFUNCActionPerformed
            CadastroFuncionarioTela cadasFunci = new CadastroFuncionarioTela();
            cadasFunci.setVisible(true);
            dispose();

    }//GEN-LAST:event_jMenuCadastrarFUNCActionPerformed

    private void btnMenuFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuFinalizarActionPerformed
        // TODO add your handling code here:
        gerarVenda();
        pesquisarVenda();
        limparCampos();

    }//GEN-LAST:event_btnMenuFinalizarActionPerformed

    private void txtQuantidadeIngressosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQuantidadeIngressosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQuantidadeIngressosActionPerformed

    private void btnCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarregarActionPerformed
        // TODO add your handling code here:
        carregarComponentesFILME();
        desativarBotoesTELAvenda(true);


    }//GEN-LAST:event_btnCarregarActionPerformed

    private void btnMenuCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCancelarActionPerformed
        // TODO add your handling code here:
        limparCampos();


    }//GEN-LAST:event_btnMenuCancelarActionPerformed

    private void btnBuscarVendasMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendasMenu1ActionPerformed
        // TODO add your handling code here:
        carregarComponentesVenda();
        desBotoesVenda(true);


    }//GEN-LAST:event_btnBuscarVendasMenu1ActionPerformed

    private void JMSAIRTELAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMSAIRTELAActionPerformed
        // TODO add your handling code here:
        LoginTela login = new LoginTela();
        login.setVisible(true);
        dispose();
        
        
        
        
    }//GEN-LAST:event_JMSAIRTELAActionPerformed

    private void btnRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRelatorioActionPerformed
        // TODO add your handling code here:
        new RelatorioTela().setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRelatorioActionPerformed

    private void btnMenuCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuCalcularActionPerformed
        // TODO add your handling code here:
        double quantidade = Double.valueOf(txtQuantidadeIngressos.getText());
        double valor = Double.valueOf(txtValorIngressos.getText());

        double valorTotal = quantidade * valor;
        txtMenuTOTAL.setText(String.valueOf(valorTotal));

    }//GEN-LAST:event_btnMenuCalcularActionPerformed

    private void btnEXCLUIRVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEXCLUIRVendaActionPerformed
        // TODO add your handling code here:
        ExcluirVenda();
        pesquisarVenda();
        limparCampos();
        desBotoesVenda(false);
        
        
        
        
    }//GEN-LAST:event_btnEXCLUIRVendaActionPerformed

    private void btnCANCELARVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCANCELARVendaActionPerformed
        // TODO add your handling code here:
        limparCampos();
        desBotoesVenda(false);
    }//GEN-LAST:event_btnCANCELARVendaActionPerformed

    private void txtIDVendaFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDVendaFilmeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDVendaFilmeActionPerformed

    private void txtMenuTOTALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMenuTOTALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMenuTOTALActionPerformed

    private void cboxOrdemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxOrdemActionPerformed
        pesquisarFilme();
    }//GEN-LAST:event_cboxOrdemActionPerformed

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
            java.util.logging.Logger.getLogger(GerenteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenteTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenteTela().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem JMSAIRTELA;
    private javax.swing.JButton btnBuscarVendasMenu1;
    private javax.swing.JButton btnCANCELARVenda;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnEXCLUIRVenda;
    private javax.swing.JButton btnMenuCalcular;
    private javax.swing.JButton btnMenuCancelar;
    private javax.swing.JButton btnMenuFinalizar;
    private javax.swing.JMenuItem btnRelatorio;
    private javax.swing.JComboBox<String> cboxOrdem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastrar;
    private javax.swing.JMenuItem jMenuCadastrarFILM;
    private javax.swing.JMenuItem jMenuCadastrarFUNC;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuVenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jtbModelFilmeMenu;
    private javax.swing.JTable jtbModelVendaMenu1;
    private javax.swing.JTextField txtData;
    private javax.swing.JTextField txtIDVendaFilme;
    private javax.swing.JTextField txtID_VENDA;
    private javax.swing.JTextField txtMeNuSESSAO;
    private javax.swing.JTextField txtMenuID;
    private javax.swing.JTextField txtMenuSala;
    private javax.swing.JTextField txtMenuTOTAL;
    private javax.swing.JTextField txtNomeMenu;
    private javax.swing.JTextField txtQuantidadeIngressos;
    private javax.swing.JTextField txtValorIngressos;
    // End of variables declaration//GEN-END:variables

    public void desativarComponentes(boolean retorno) {

        txtNomeMenu.setEnabled(retorno);
        txtMeNuSESSAO.setEnabled(retorno);
        txtMenuSala.setEnabled(retorno);
        txtValorIngressos.setEnabled(retorno);
        txtMenuTOTAL.setEnabled(retorno);

    }
    
    
    
     public void ExcluirVenda() {
        Venda classe = new Venda();
        VendaDAO conexão = new VendaDAO();

        int id_venda = Integer.parseInt(txtID_VENDA.getText());
        classe.setIdVenda(id_venda);

        conexão.excluirVenda(classe);

    }
    
    
    
    

    public void carregarComponentesFILME() {
        int linha = jtbModelFilmeMenu.getSelectedRow();

        txtMenuID.setText(jtbModelFilmeMenu.getModel().getValueAt(linha, 0).toString());
        txtNomeMenu.setText(jtbModelFilmeMenu.getModel().getValueAt(linha, 1).toString());
        txtMenuSala.setText(jtbModelFilmeMenu.getModel().getValueAt(linha, 4).toString());
        txtMeNuSESSAO.setText(jtbModelFilmeMenu.getModel().getValueAt(linha, 5).toString());

    }

    public void carregarComponentesVenda() {
        int linha = jtbModelVendaMenu1.getSelectedRow();

        txtID_VENDA.setText(jtbModelVendaMenu1.getModel().getValueAt(linha, 0).toString());
        txtIDVendaFilme.setText(jtbModelVendaMenu1.getModel().getValueAt(linha, 1).toString());

    }

    public void pesquisarVenda() {
        
        Venda objVenda = new Venda();
        objVenda.setDataVenda(setDataBD());

        try {
            VendaDAO objDAO = new VendaDAO();
            DefaultTableModel tabelaModel = (DefaultTableModel) jtbModelVendaMenu1.getModel();
            tabelaModel.setNumRows(0);
            ArrayList<Venda> listaFilme = objDAO.pesquisarVenda(objVenda);
            for (int num = 0; num < listaFilme.size(); num++) {
                tabelaModel.addRow(new Object[]{
                    listaFilme.get(num).getIdVenda(),
                    listaFilme.get(num).getIngresso(),
                    listaFilme.get(num).getSessao(),
                    listaFilme.get(num).getIngresso(),
                    listaFilme.get(num).getPreco(),
                    listaFilme.get(num).getTotal(),});
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro metodo pesquisarVenda. Na tela de GerenteTela" + erro);
        }
    }

    public void desativarBotoesTELAvenda(boolean status) {
        txtQuantidadeIngressos.setEnabled(status);
        txtValorIngressos.setEnabled(status);

    }
    
    
      public void desBotoesVenda(boolean resultado) {
        btnCANCELARVenda.setEnabled(resultado);
        btnEXCLUIRVenda.setEnabled(resultado);

    }
    
    
    
    

    public void limparCampos() {
        txtMenuID.setText("");
        txtNomeMenu.setText("");
        txtMeNuSESSAO.setText("");
        txtMenuSala.setText("");
        txtValorIngressos.setText("");
        txtMenuTOTAL.setText("");
        txtQuantidadeIngressos.setText("");
        txtID_VENDA.setText("");
        txtIDVendaFilme.setText("");

    }

    public void gerarVenda() {
        Venda objVenda = new Venda();
        VendaDAO objDAO = new VendaDAO();

        int quantIngressos = Integer.parseInt(txtQuantidadeIngressos.getText());
        double valorIngressos = Double.parseDouble(txtValorIngressos.getText());
        double calculo = (quantIngressos * valorIngressos);

        String valorTotal = String.valueOf(calculo);
        txtMenuTOTAL.setText(valorTotal);

        int idFilme = Integer.parseInt(txtMenuID.getText());

        objVenda.setIdVenda(idFilme);
        objVenda.setIngresso(quantIngressos);
        objVenda.setPreco(valorIngressos);
        objVenda.setTotal(calculo);
        objVenda.setDataVenda(setDataBD());

        objDAO.gerarVenda(objVenda);

    }

    public void pesquisarFilme() {
        try {
            FilmeDAO daoFilme = new FilmeDAO();

            DefaultTableModel tabelaModel = (DefaultTableModel) jtbModelFilmeMenu.getModel();
            tabelaModel.setNumRows(0);

            List<Filme> listaFilme = new ArrayList<>();
            String escolha = cboxOrdem.getSelectedItem().toString();

            if (escolha.equalsIgnoreCase("Crescente (alfabético)")) {
                listaFilme = daoFilme.pesquisarFilmeAlfabetico();
            } 
            else if(escolha.equalsIgnoreCase("Decrescente (alfabético)")){
                listaFilme = daoFilme.pesquisarFilmeAlfabeticoDesc();
            }
            else{
                listaFilme = daoFilme.pesquisarFilme();
            }

            for (int num = 0; num < listaFilme.size(); num++) {
                tabelaModel.addRow(new Object[]{
                    listaFilme.get(num).getIdFilme(),
                    listaFilme.get(num).getNomeFilme(),
                    listaFilme.get(num).getCategoriaFilme(),
                    listaFilme.get(num).getClassificacaoFilme(),
                    listaFilme.get(num).getDuracaoFilme(),
                    listaFilme.get(num).getDataFilme()});
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no botao pesquisar" + erro);

        }
    }

    
    public void setDataHoje(){
        
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date date = new Date();
	txtData.setText(dateFormat.format(date));
    
}
    public String setDataBD(){
        
	DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	Date date = new Date();
        return dateFormat.format(date);
    
}
    

}
