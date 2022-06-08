package TELAS;

import Classes.Filme;
import DAO.VendaDAO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Classes.Venda;

import DAO.FilmeDAO;
import Telas.CadastroFilmeTela;
import Telas.CadastroFuncionarioTela;
import Telas.LoginTela;

public class GerenteTela extends javax.swing.JFrame {

    public GerenteTela() {
        initComponents();
        pesquisarFilme();
        pesquisarVenda();
        desativarBotoesTELAvenda(false);

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
        btnBuscarFilmeMenu = new javax.swing.JButton();
        btnBuscarVendasMenu = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        txtID_VENDA = new javax.swing.JTextField();
        btnBuscarVendasMenu1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtIDVendaFilme = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbModelFilmeMenu = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtValorIngressos = new javax.swing.JTextField();
        txtMenuTOTAL = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnMenuFinalizar = new javax.swing.JButton();
        btnMenuCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtQuantidadeIngressos = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastrar = new javax.swing.JMenu();
        jMenuCadastrarFUNC = new javax.swing.JMenuItem();
        jMenuCadastrarFILM = new javax.swing.JMenuItem();
        jMenuVenda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
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
                .addContainerGap(56, Short.MAX_VALUE))
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
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID_venda", "id_filme", "ingressos", "valor", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jtbModelVendaMenu1);
        if (jtbModelVendaMenu1.getColumnModel().getColumnCount() > 0) {
            jtbModelVendaMenu1.getColumnModel().getColumn(0).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(1).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(1).setHeaderValue("id_filme");
            jtbModelVendaMenu1.getColumnModel().getColumn(2).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(3).setResizable(false);
            jtbModelVendaMenu1.getColumnModel().getColumn(4).setResizable(false);
        }

        btnBuscarFilmeMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-visualizar-arquivo-24 (1).png"))); // NOI18N
        btnBuscarFilmeMenu.setText("Filme");
        btnBuscarFilmeMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarFilmeMenuActionPerformed(evt);
            }
        });

        btnBuscarVendasMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-visualizar-arquivo-24 (1).png"))); // NOI18N
        btnBuscarVendasMenu.setText("Vendas");
        btnBuscarVendasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendasMenuActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("ID_VENDA:");

        txtID_VENDA.setEnabled(false);

        btnBuscarVendasMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-girar-24.png"))); // NOI18N
        btnBuscarVendasMenu1.setText("Carregar Venda");
        btnBuscarVendasMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVendasMenu1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("ID_FILME:");

        txtIDVendaFilme.setEnabled(false);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBuscarFilmeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarVendasMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarVendasMenu1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel13))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(9, 9, 9)
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(txtID_VENDA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtIDVendaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtID_VENDA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtIDVendaFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscarFilmeMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarVendasMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscarVendasMenu1))
                .addGap(22, 22, 22))
        );

        jPanel3.setBackground(new java.awt.Color(235, 237, 236));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jtbModelFilmeMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Categoria", "Classificação", "Sala", "Sessão"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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
            jtbModelFilmeMenu.getColumnModel().getColumn(0).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(1).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(2).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(3).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(4).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(5).setResizable(false);
            jtbModelFilmeMenu.getColumnModel().getColumn(5).setHeaderValue("Sessão");
        }

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FILMES");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane2))
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(235, 237, 236));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("VALOR:");

        txtMenuTOTAL.setEnabled(false);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("TOTAL:");

        btnMenuFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-ok-24 (1).png"))); // NOI18N
        btnMenuFinalizar.setText("Concluir Venda");
        btnMenuFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuFinalizarActionPerformed(evt);
            }
        });

        btnMenuCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-excluir-24.png"))); // NOI18N
        btnMenuCancelar.setText("Finalizar Venda");
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
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValorIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQuantidadeIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnMenuFinalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMenuCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMenuTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMenuTOTAL, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(txtQuantidadeIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtValorIngressos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(btnMenuFinalizar)
                    .addComponent(btnMenuCancelar))
                .addGap(16, 16, 16))
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

        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagem/icons8-excluir-24.png"))); // NOI18N
        jMenuItem1.setText("Excluir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenuVenda.add(jMenuItem1);

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

    private void btnBuscarFilmeMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarFilmeMenuActionPerformed
        // TODO add your handling code here:
        pesquisarFilme();

    }//GEN-LAST:event_btnBuscarFilmeMenuActionPerformed

    private void btnBuscarVendasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVendasMenuActionPerformed
        // TODO add your handling code here:
        pesquisarVenda();

    }//GEN-LAST:event_btnBuscarVendasMenuActionPerformed

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


    }//GEN-LAST:event_btnBuscarVendasMenu1ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        ExluirVenda();
        pesquisarVenda();
        limparCampos();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void JMSAIRTELAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMSAIRTELAActionPerformed
        // TODO add your handling code here:
        LoginTela login = new LoginTela();
        login.setVisible(true);
        dispose();
        
        
        
        
    }//GEN-LAST:event_JMSAIRTELAActionPerformed

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
    private javax.swing.JButton btnBuscarFilmeMenu;
    private javax.swing.JButton btnBuscarVendasMenu;
    private javax.swing.JButton btnBuscarVendasMenu1;
    private javax.swing.JButton btnCarregar;
    private javax.swing.JButton btnMenuCancelar;
    private javax.swing.JButton btnMenuFinalizar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JMenuItem jMenuItem1;
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

        try {
            VendaDAO objDAO = new VendaDAO();
            DefaultTableModel tabelaModel = (DefaultTableModel) jtbModelVendaMenu1.getModel();
            tabelaModel.setNumRows(0);
            ArrayList<Venda> listaFilme = objDAO.pesquisarVenda();
            for (int num = 0; num < listaFilme.size(); num++) {
                tabelaModel.addRow(new Object[]{
                    listaFilme.get(num).getId_venda(),
                    listaFilme.get(num).getId_filme(),
                    listaFilme.get(num).getIngresso(),
                    listaFilme.get(num).getPreço(),
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

    public void limparCampos() {
        txtMenuID.setText("");
        txtNomeMenu.setText("");
        txtMeNuSESSAO.setText("");
        txtMenuSala.setText("");
        txtValorIngressos.setText("");
        txtMenuTOTAL.setText("");
        txtQuantidadeIngressos.setText("");

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

        objVenda.setId_filme(idFilme);
        objVenda.setIngresso(quantIngressos);
        objVenda.setPreço(valorIngressos);
        objVenda.setTotal(calculo);

        objDAO.gerarVenda(objVenda);

    }

    public void pesquisarFilme() {

        try {
            FilmeDAO objDAO = new FilmeDAO();

            DefaultTableModel tabelaModel = (DefaultTableModel) jtbModelFilmeMenu.getModel();
            tabelaModel.setNumRows(0);

            ArrayList<Filme> listaFilme = objDAO.pesquisarFilme();

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
            JOptionPane.showMessageDialog(null, "Erro metodo pesquisarFilme. Na tela de GerenteTela" + erro);

        }

    }

    public void ExluirVenda() {
        Venda objVenda = new Venda();
        VendaDAO objDAO = new VendaDAO();
        
        
        int id_venda = Integer.parseInt(txtID_VENDA.getText());
        objVenda.setId_venda(id_venda);
    
        
        objDAO.excluirVenda(objVenda);
        
    }

}