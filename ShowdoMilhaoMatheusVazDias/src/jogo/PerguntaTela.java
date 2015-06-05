package jogo;

import Audio.Audio;
import dao.PerguntaDAO;
import java.util.List;
import javax.swing.ButtonGroup;
import modelo.Jogador;
import modelo.JogoCompleto;
import modelo.Pergunta;

public class PerguntaTela extends javax.swing.JFrame {

    private Jogador jogador;
    private Double premio;
    private Integer nivel;
    private Double errou;
    ButtonGroup bg1;
    private Object quantotem;
    private Object lblNome;
    
    public Jogador getJogador() {
        return jogador;
    }

    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    List<Pergunta> perguntas; //pergunta do jogo
    Pergunta perguntaAtual; //pergunta que está sendo exibida no momento
    JogoCompleto completo;
    
    public PerguntaTela() {
        initComponents();
        nivel = 1;
             
        //Criar e Adicionar elementos no grupo,

        //assim somente será possível clicar em uma opção

        //O processo é criar um grupo de botões e adicionar os radios ao grupo

        bg1  = new ButtonGroup();
               
        bg1.add(radio1);
        bg1.add(radio2);
        bg1.add(radio3);
        bg1.add(radio4);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel26 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblPerg = new javax.swing.JLabel();
        jPanel24 = new javax.swing.JPanel();
        radio4 = new javax.swing.JRadioButton();
        botaoParar = new javax.swing.JButton();
        botaoConfirmar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        radio3 = new javax.swing.JRadioButton();
        jPanel23 = new javax.swing.JPanel();
        radio2 = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        radio1 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Cartas = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Pular = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lblNomee = new javax.swing.JLabel();
        quantotemm = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel25 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtAcertar = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        txtParar = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jPanel17 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jPanel18 = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jPanel19 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jPanel22 = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtErrar = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 28, 0));
        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel26MouseClicked(evt);
            }
        });
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(14, 0, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Área de Perguntas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(254, 254, 254))); // NOI18N
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPerg.setBackground(new java.awt.Color(255, 255, 255));
        lblPerg.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        lblPerg.setForeground(new java.awt.Color(255, 255, 255));
        lblPerg.setText("Pergunta:");
        jPanel3.add(lblPerg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        jPanel24.setBackground(new java.awt.Color(0, 100, 255));
        jPanel24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel24.setForeground(new java.awt.Color(255, 255, 255));

        radio4.setBackground(new java.awt.Color(255, 0, 0));
        radio4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio4.setForeground(new java.awt.Color(255, 255, 255));
        radio4.setText("Opção 4");

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio4, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel24Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(radio4)
                .addContainerGap())
        );

        jPanel3.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 460, 60));

        botaoParar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Signal-Stop-48.png"))); // NOI18N
        botaoParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPararActionPerformed(evt);
            }
        });
        jPanel3.add(botaoParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 50, 50));

        botaoConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ok-48.png"))); // NOI18N
        botaoConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConfirmarActionPerformed(evt);
            }
        });
        jPanel3.add(botaoConfirmar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 50, 50));

        jPanel1.setBackground(new java.awt.Color(0, 100, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        radio3.setBackground(new java.awt.Color(255, 0, 0));
        radio3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio3.setForeground(new java.awt.Color(255, 255, 255));
        radio3.setText("Opção 3");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio3, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio3)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 460, -1));

        jPanel23.setBackground(new java.awt.Color(0, 100, 255));
        jPanel23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel23.setForeground(new java.awt.Color(255, 255, 255));

        radio2.setBackground(new java.awt.Color(255, 0, 0));
        radio2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio2.setForeground(new java.awt.Color(255, 255, 255));
        radio2.setText("Opção 2");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio2, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio2)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        jPanel4.setBackground(new java.awt.Color(0, 100, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel4.setForeground(new java.awt.Color(255, 255, 255));

        radio1.setBackground(new java.awt.Color(255, 0, 0));
        radio1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        radio1.setForeground(new java.awt.Color(255, 255, 255));
        radio1.setText("Opção 1");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio1, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(radio1)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel1.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("Parar");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, -1, -1));

        jLabel2.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("Ok");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        Cartas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Cards-48.png"))); // NOI18N
        Cartas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CartasActionPerformed(evt);
            }
        });
        jPanel3.add(Cartas, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("Ajuda");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 440, -1, 20));

        Pular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Arrow-skip-right-48.png"))); // NOI18N
        Pular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PularActionPerformed(evt);
            }
        });
        jPanel3.add(Pular, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 380, -1, -1));

        jLabel6.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(254, 254, 254));
        jLabel6.setText("Pular");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, -1, -1));

        jPanel26.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 480, 470));

        jPanel2.setBackground(new java.awt.Color(14, 0, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(254, 254, 254))); // NOI18N

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Super Homem.jpg"))); // NOI18N

        lblNomee.setText("Nome");

        quantotemm.setText("Pontuação");

        jLabel4.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(254, 254, 254));
        jLabel4.setText("Jogador:");

        jLabel5.setFont(new java.awt.Font("Cantarell", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(254, 254, 254));
        jLabel5.setText("Dinheiro:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomee)
                            .addComponent(quantotemm))))
                .addGap(42, 42, 42))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblNomee))
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(quantotemm))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel26.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 320, 390));

        jPanel25.setBackground(new java.awt.Color(14, 0, 255));
        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Atenção", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 0, 12), new java.awt.Color(254, 254, 254))); // NOI18N

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PARAR");

        jPanel5.setBackground(new java.awt.Color(0, 100, 255));
        jPanel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel5.setToolTipText("");
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtAcertar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtAcertar.setForeground(new java.awt.Color(254, 254, 254));
        txtAcertar.setText("2 MIL");
        jPanel5.add(txtAcertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel6.setBackground(new java.awt.Color(255, 255, 0));
        jPanel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel6.setToolTipText("");
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("500");
        jPanel6.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel9.setBackground(new java.awt.Color(255, 255, 0));
        jPanel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel9.setToolTipText("");
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        jLabel13.setText("500");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel10.setBackground(new java.awt.Color(255, 255, 0));
        jPanel10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel10.setToolTipText("");
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        jLabel14.setText("500");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel11.setBackground(new java.awt.Color(255, 255, 0));
        jPanel11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel11.setToolTipText("");
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        jLabel15.setText("500");
        jPanel11.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel12.setBackground(new java.awt.Color(255, 255, 0));
        jPanel12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel12.setToolTipText("");
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 0, 0));
        jLabel16.setText("500");
        jPanel12.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel13.setBackground(new java.awt.Color(255, 255, 0));
        jPanel13.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel13.setToolTipText("");
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 0, 0));
        jLabel17.setText("500");
        jPanel13.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel14.setBackground(new java.awt.Color(255, 255, 0));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel14.setToolTipText("");
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("500");
        jPanel14.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel5.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel15.setBackground(new java.awt.Color(0, 100, 255));
        jPanel15.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel15.setToolTipText("");
        jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtParar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtParar.setForeground(new java.awt.Color(254, 254, 254));
        txtParar.setText("1 MIL");
        jPanel15.add(txtParar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 255, 0));
        jPanel16.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel16.setToolTipText("");
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 0, 0));
        jLabel20.setText("500");
        jPanel16.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel15.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel17.setBackground(new java.awt.Color(255, 255, 0));
        jPanel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel17.setToolTipText("");
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 0, 0));
        jLabel21.setText("500");
        jPanel17.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel18.setBackground(new java.awt.Color(255, 255, 0));
        jPanel18.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel18.setToolTipText("");
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("500");
        jPanel18.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel17.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel15.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel19.setBackground(new java.awt.Color(255, 255, 0));
        jPanel19.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel19.setToolTipText("");
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 0, 0));
        jLabel23.setText("500");
        jPanel19.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel20.setBackground(new java.awt.Color(255, 255, 0));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel20.setToolTipText("");
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("500");
        jPanel20.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel21.setBackground(new java.awt.Color(255, 255, 0));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel21.setToolTipText("");
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 0, 0));
        jLabel25.setText("500");
        jPanel21.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel22.setBackground(new java.awt.Color(255, 255, 0));
        jPanel22.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel22.setToolTipText("");
        jPanel22.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 0, 0));
        jLabel26.setText("500");
        jPanel22.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel21.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel15.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, 70, 60));

        jPanel7.setBackground(new java.awt.Color(0, 100, 255));
        jPanel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel7.setToolTipText("");
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtErrar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtErrar.setForeground(new java.awt.Color(254, 254, 254));
        txtErrar.setText("500");
        jPanel7.add(txtErrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        jPanel8.setBackground(new java.awt.Color(255, 255, 0));
        jPanel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jPanel8.setToolTipText("");
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("500");
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 70, 60));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("ACERTAR");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ERRAR");

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel9))
                    .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel27))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel28)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel9)
                .addGap(26, 26, 26)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel27)
                .addGap(26, 26, 26)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel28)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel26.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, 200, 390));

        getContentPane().add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        lblNomee.setText(jogador.getLogin());
        
        
        //Começar o jogo
        completo = new JogoCompleto();
        completo.setJogador(jogador);
        premio = 2500.00;
        
        txtErrar.setText(" 0 ");
        txtParar.setText(" 0 ");
        txtAcertar.setText(premio.toString());
        
        
        
        nivel = 1;
        PerguntaDAO dao = new PerguntaDAO();
        perguntas = dao.listarNivel(nivel); //busca as perguntas do nível 1, que estão embaralhadas
        
        perguntaAtual = perguntas.get(0); //colocar a primeira que aparece no perguntaAtual
        
        //exibir na tela
        lblPerg.setText(perguntaAtual.getEnunciado());
        radio1.setText(perguntaAtual.getA());
        radio2.setText(perguntaAtual.getB());
        radio3.setText(perguntaAtual.getC());
        radio4.setText(perguntaAtual.getD());
    }//GEN-LAST:event_formWindowOpened

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
        Audio audio = new Audio();
        //para tocar a música
        audio.tocar("certeza;wav");
        //quando quisermos para o som
        audio.parar();
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radio2ActionPerformed

    private void jPanel26MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseClicked
        
    }//GEN-LAST:event_jPanel26MouseClicked

    private void botaoPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPararActionPerformed
        Fim tela = new Fim ();
        tela.setVisible(true);
        this.setVisible(false);

        tela.setCompleto(completo);
    }//GEN-LAST:event_botaoPararActionPerformed

    private void botaoConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConfirmarActionPerformed
        PerguntaDAO dao = new PerguntaDAO();
        Boolean acertou = false;
        String certa = perguntaAtual.getCerta(); //A, B, C ou D
        
        if (certa.equalsIgnoreCase("A") && radio1.isSelected())
        { 
            acertou = true;
        }
        else if (certa.equalsIgnoreCase("B") && radio2.isSelected())
        {
            acertou = true;
        }
        else if (certa.equalsIgnoreCase("C") && radio3.isSelected())
        {
            acertou = true;       
        }
        else if (certa.equalsIgnoreCase("D") && radio4.isSelected())
        {
            acertou = true;
        }
        else
        {
            acertou = false;
        }
        
        
        
        
        if (nivel==1)
        {
            if (acertou == true)
            {
                errou = premio/2;
                txtErrar.setText(errou.toString());
                txtParar.setText(premio.toString());
                completo.setGanhos(premio);
                premio = premio + 2500;     
                txtAcertar.setText(premio.toString());
                
                quantotemm.setText(completo.getGanhos().toString());
            }
            else
            {
                completo.setGanhos(errou);
            
                Fim tela = new Fim();
                tela.setCompleto(completo);
                tela.setVisible(true);
            
                this.setVisible(false);
            }
        }
        else if (nivel==2)
        {
            if (acertou == true)
            {
                errou = premio/2;
                txtErrar.setText(errou.toString());
                txtParar.setText(premio.toString());
                completo.setGanhos(premio);
                premio = premio + 5000;     
                txtAcertar.setText(premio.toString());  
                
                quantotemm.setText(completo.getGanhos().toString());
            }
            else
            {
                completo.setGanhos(errou);
            
                Fim tela = new Fim();
                tela.setCompleto(completo);
                tela.setVisible(true);
            
                this.setVisible(false);
            }
        }
        
       
    
        //elimina a pergunta que está sendo exibida
        perguntas.remove(0);
        
        if (perguntas.isEmpty())
        {
            nivel++;
            if (nivel == 3)
            {
                Fim fim = new Fim();
                completo.setGanhos(1000000D);
                fim.setCompleto(completo);
                fim.setVisible(true);
                this.setVisible(false);
                return;
            }
            else
            {           
                perguntas = dao.listarNivel(nivel);
            }       
        }
    
        perguntaAtual = perguntas.get(0);
        
        //exibir na tela
        lblPerg.setText(perguntaAtual.getEnunciado());
        radio1.setText(perguntaAtual.getA());
        radio2.setText(perguntaAtual.getB());
        radio3.setText(perguntaAtual.getC());
        radio4.setText(perguntaAtual.getD());
        
        //limpa o grupo de botões
        bg1.clearSelection();
    }//GEN-LAST:event_botaoConfirmarActionPerformed

    private void CartasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CartasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CartasActionPerformed

    private void PularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PularActionPerformed

    public static void main(String args[]) {
       
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
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PerguntaTela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerguntaTela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cartas;
    private javax.swing.JButton Pular;
    private javax.swing.JButton botaoConfirmar;
    private javax.swing.JButton botaoParar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblNomee;
    private javax.swing.JLabel lblPerg;
    private javax.swing.JLabel quantotemm;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    private javax.swing.JRadioButton radio4;
    private javax.swing.JLabel txtAcertar;
    private javax.swing.JLabel txtErrar;
    private javax.swing.JLabel txtParar;
    // End of variables declaration//GEN-END:variables
}
