package admin;
    import dao.PerguntaDAO;
    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;
    import modelo.Pergunta;
    
public class perguntaManter extends javax.swing.JFrame {

    private List<Pergunta> lista;
    Integer posicao; 
    
    public perguntaManter() {
        initComponents();
        PerguntaDAO dao = new PerguntaDAO();
        lista = dao.listar();
        posicao = 0;
    }
    
    public void Limpar ()
    {
        txtId.setText("");
        txtEnunciado.setText("");
        txtA.setText("");
        txtB.setText("");
        txtC.setText("");
        txtD.setText("");
        cboCerta.setSelectedIndex(0);
        cboNivel.setSelectedIndex(0);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        botaoInserir = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoListagemPer = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtA = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        botaoPrimeiro = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        txtId = new javax.swing.JTextField();
        txtEnunciado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtB = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtD = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cboCerta = new javax.swing.JComboBox();
        cboNivel = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("PERGUNTA");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoListagemPer.setText("Ir para Listagem");
        botaoListagemPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListagemPerActionPerformed(evt);
            }
        });

        botaoAtualizar.setText("Atualizar");
        botaoAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botaoInserir)
                        .addGap(18, 18, 18)
                        .addComponent(botaoLimpar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(botaoConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(botaoAtualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(botaoListagemPer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserir)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoConsultar)
                    .addComponent(botaoAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(botaoListagemPer))
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Id:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Enunciado:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("A:");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));

        botaoPrimeiro.setText("Primeiro");
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });

        botaoAnterior.setText("Anterior");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoProximo.setText("Próximo");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoUltimo.setText("Último");
        botaoUltimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUltimoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(botaoPrimeiro)
                .addGap(42, 42, 42)
                .addComponent(botaoAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(botaoProximo)
                .addGap(44, 44, 44)
                .addComponent(botaoUltimo)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoPrimeiro)
                    .addComponent(botaoAnterior)
                    .addComponent(botaoProximo)
                    .addComponent(botaoUltimo))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        txtId.setEditable(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("B:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("C:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("D:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Certa:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Nível:");

        cboCerta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "A", "B", "C", "D" }));

        cboNivel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione", "1", "2", "3", "4", "5" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(240, 240, 240))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(48, 48, 48)
                                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtA, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
                                        .addComponent(txtB)
                                        .addComponent(txtC)
                                        .addComponent(txtD)
                                        .addComponent(cboCerta, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cboNivel, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEnunciado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboCerta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cboNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        Pergunta item = new Pergunta ();
           
        if (txtEnunciado.getText().isEmpty() || txtA.getText().isEmpty() || txtB.getText().isEmpty() || txtC.getText().isEmpty() || txtD.getText().isEmpty() || cboCerta.getSelectedItem().equals("Selecione") || cboNivel.getSelectedItem().equals("Selecione")) 
            {
                JOptionPane.showMessageDialog(rootPane,"Preencher todos os campos!");
                
            }
            else
            {              
                    item.setEnunciado(txtEnunciado.getText());
                    item.setA(txtA.getText());
                    item.setB(txtB.getText());
                    item.setC(txtC.getText());
                    item.setD(txtD.getText());
                    
                    if (cboCerta.getSelectedItem().equals("A"))
                    {
                        item.setCerta("A");
                    }
                    else if (cboCerta.getSelectedItem().equals("B"))
                    {
                        item.setCerta("B");
                    }
                    else if (cboCerta.getSelectedItem().equals("C"))
                    {
                        item.setCerta("C");
                    }
                    else if (cboCerta.getSelectedItem().equals("D"))
                    {
                        item.setCerta("D");
                    }
                    
                    if (cboNivel.getSelectedItem().equals("1"))
                    {
                        item.setNivel(1);
                    }
                    else if (cboNivel.getSelectedItem().equals("2"))
                    {
                        item.setNivel(2);
                    }
                    else if (cboNivel.getSelectedItem().equals("3"))
                    {
                        item.setNivel(3);
                    }
                    else if (cboNivel.getSelectedItem().equals("4"))
                    {
                        item.setNivel(4);
                    }
         
                    
                    PerguntaDAO dao = new PerguntaDAO();
            
                    //chamo o inserir
                    boolean deucerto = dao.inserir(item);
            
                    if (deucerto == true)
                    {
                        JOptionPane.showMessageDialog(rootPane,"Cadastrado com sucesso!");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(rootPane,"Erro ao cadastrar!");
                    }
                    
                    lista = dao.listar();
                    Limpar ();
                }
                
             
    }//GEN-LAST:event_botaoInserirActionPerformed

    private void botaoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLimparActionPerformed
        Limpar ();
    }//GEN-LAST:event_botaoLimparActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (txtId.getText().isEmpty()==false)
        {
            //instanciando a classe de acesso a dados JogadorDAO       
            PerguntaDAO dao = new PerguntaDAO();
            
            //chamo o inserir
            boolean deucerto = dao.remover(lista.get(posicao));
            
            if (deucerto == true)
            {
                JOptionPane.showMessageDialog(rootPane,"Excluído com sucesso!");
            }
            else 
            {
                JOptionPane.showMessageDialog(rootPane,"Erro ao excluir!");
            }
            lista = dao.listar();
            Limpar();
        }
        
        else
        {
            
        }
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        String pergunta = JOptionPane.showInputDialog("Digite a pergunta a ser pesquisada:");

        Boolean encontrou = false;
        Integer posicaoachou = 0;

        for (Pergunta lista1 : lista)
        {
            if (pergunta.equalsIgnoreCase(lista1.getEnunciado()))
            {
                encontrou = true;
                posicao = posicaoachou;

                txtId.setText(lista1.getId().toString());
                txtEnunciado.setText(lista1.getEnunciado());
                txtA.setText(lista1.getA());
                txtB.setText(lista1.getB());
                txtC.setText(lista1.getC());
                txtD.setText(lista1.getD());
                    
                    if (lista1.getCerta().equals("A"))
                    {
                        cboCerta.setSelectedIndex(1);
                    }
                    else if (lista1.getCerta().equals("B"))
                    {
                        cboCerta.setSelectedIndex(2);
                    }
                    else if (lista1.getCerta().equals("C"))
                    {
                        cboCerta.setSelectedIndex(3);
                    }
                    else if (lista1.getCerta().equals("D"))
                    {
                        cboCerta.setSelectedIndex(4);
                    }
                    
                    if (lista1.getNivel()==1) 
                    {
                        cboNivel.setSelectedIndex(1);
                    }
                    else if (lista1.getNivel()==2)
                    {
                        cboNivel.setSelectedIndex(2);
                    }
                    else if (lista1.getNivel()==3)
                    {
                        cboNivel.setSelectedIndex(3);
                    }
                    else if (lista1.getNivel()==4)
                    {
                        cboNivel.setSelectedIndex(4);
                    }
                    

                break;
            }

            posicaoachou ++;
        }

        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Pergunta ainda não cadastrada!");
        }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoListagemPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListagemPerActionPerformed
        perguntaListar tela = new perguntaListar();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botaoListagemPerActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(false);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);

        if (lista.size()>0)
        {
            posicao = 0;

            Pergunta elemento = lista.get(0);

            txtId.setText(elemento.getId().toString());
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            
            if (elemento.getCerta().equals("A"))
            {
                cboCerta.setSelectedIndex(1);
            }
            else if (elemento.getCerta().equals("B"))
            {
                cboCerta.setSelectedIndex(2);
            }
            else if (elemento.getCerta().equals("C"))
            {
                cboCerta.setSelectedIndex(3);
            }
            else if (elemento.getCerta().equals("D"))
            {
                cboCerta.setSelectedIndex(4);
            }
            
            if (elemento.getNivel()==1)
            {
                cboNivel.setSelectedIndex(1);
            }
            else if (elemento.getNivel()==2)
            {
                cboNivel.setSelectedIndex(2);
            }
            else if (elemento.getNivel()==3)
            {
                cboNivel.setSelectedIndex(3);
            }
            else if (elemento.getNivel()==4)
            {
                cboNivel.setSelectedIndex(4);
            }
        }
    }//GEN-LAST:event_botaoPrimeiroActionPerformed

    private void botaoAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAnteriorActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);

        if (posicao > 0)
        {
            posicao = posicao - 1;

            Pergunta elemento = lista.get(posicao);

            txtId.setText(elemento.getId().toString());
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            
            if (elemento.getCerta().equals("A"))
            {
                cboCerta.setSelectedIndex(1);
            }
            else if (elemento.getCerta().equals("B"))
            {
                cboCerta.setSelectedIndex(2);
            }
            else if (elemento.getCerta().equals("C"))
            {
                cboCerta.setSelectedIndex(3);
            }
            else if (elemento.getCerta().equals("D"))
            {
                cboCerta.setSelectedIndex(4);
            }
            
            if (elemento.getNivel()==1)
            {
                cboNivel.setSelectedIndex(1);
            }
            else if (elemento.getNivel()==2)
            {
                cboNivel.setSelectedIndex(2);
            }
            else if (elemento.getNivel()==3)
            {
                cboNivel.setSelectedIndex(3);
            }
            else if (elemento.getNivel()==4)
            {
                cboNivel.setSelectedIndex(4);
            }
        }

        if (posicao == 0)
        {
            botaoPrimeiro.setEnabled(false);
            botaoAnterior.setEnabled(false);
        }

        if (lista.size() == 1)
        {
            botaoProximo.setEnabled(false);
            botaoAnterior.setEnabled(false);
        }
    }//GEN-LAST:event_botaoAnteriorActionPerformed

    private void botaoProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoProximoActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);

        if (posicao <lista.size() - 1)
        {
            posicao = posicao + 1;

            Pergunta elemento = lista.get(posicao);

            txtId.setText(elemento.getId().toString());
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
            
            if (elemento.getCerta().equals("A"))
            {
                cboCerta.setSelectedIndex(1);
            }
            else if (elemento.getCerta().equals("B"))
            {
                cboCerta.setSelectedIndex(2);
            }
            else if (elemento.getCerta().equals("C"))
            {
                cboCerta.setSelectedIndex(3);
            }
            else if (elemento.getCerta().equals("D"))
            {
                cboCerta.setSelectedIndex(4);
            }
            
            if (elemento.getNivel()==1)
            {
                cboNivel.setSelectedIndex(1);
            }
            else if (elemento.getNivel()==2)
            {
                cboNivel.setSelectedIndex(2);
            }
            else if (elemento.getNivel()==3)
            {
                cboNivel.setSelectedIndex(3);
            }
            else if (elemento.getNivel()==4)
            {
                cboNivel.setSelectedIndex(4);
            }
        }

        if (lista.size() - 1 == posicao)
        {
            botaoProximo.setEnabled(false);
            botaoUltimo.setEnabled(false);
        }
    }//GEN-LAST:event_botaoProximoActionPerformed

    private void botaoUltimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUltimoActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(true);
        botaoProximo.setEnabled(false);
        botaoUltimo.setEnabled(false);

        if (lista.size()>0)
        {
            posicao = lista.size()-1;

            Pergunta elemento = lista.get(posicao);

            txtId.setText(elemento.getId().toString());
            txtEnunciado.setText(elemento.getEnunciado());
            txtA.setText(elemento.getA());
            txtB.setText(elemento.getB());
            txtC.setText(elemento.getC());
            txtD.setText(elemento.getD());
        
            if (elemento.getCerta().equals("A"))
            {
                cboCerta.setSelectedIndex(1);
            }
            else if (elemento.getCerta().equals("B"))
            {
                cboCerta.setSelectedIndex(2);
            }
            else if (elemento.getCerta().equals("C"))
            {
                cboCerta.setSelectedIndex(3);
            }
            else if (elemento.getCerta().equals("D"))
            {
                cboCerta.setSelectedIndex(4);
            }
            
            if (elemento.getNivel()==1)
            {
                cboNivel.setSelectedIndex(1);
            }
            else if (elemento.getNivel()==2)
            {
                cboNivel.setSelectedIndex(2);
            }
            else if (elemento.getNivel()==3)
            {
                cboNivel.setSelectedIndex(3);
            }
            else if (elemento.getNivel()==4)
            {
                cboNivel.setSelectedIndex(4);
            }
        }
    }//GEN-LAST:event_botaoUltimoActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        Pergunta pergunta = new Pergunta();
        
        if (txtId.getText().isEmpty()==false)
        {
            pergunta.setId(Integer.parseInt(txtId.getText()));
            pergunta.setEnunciado(txtEnunciado.getText());
            pergunta.setA(txtA.getText());
            pergunta.setB(txtB.getText());
            pergunta.setC(txtC.getText());
            pergunta.setD(txtD.getText());
            pergunta.setCerta(cboCerta.getSelectedItem().toString());
            pergunta.setNivel(Integer.parseInt(cboNivel.getSelectedItem().toString()));
            PerguntaDAO dao = new PerguntaDAO();
            Boolean deucerto = dao.atualizar(pergunta);
            
            if (deucerto == true)
            {
                JOptionPane.showMessageDialog(rootPane, "Registro atualizado com sucesso!");
            }
            else
            {
                JOptionPane.showMessageDialog(rootPane, "Erro ao atualizar registro!");
            }
            
            lista = dao.listar();
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane, "Registro não informado");
        }
    }//GEN-LAST:event_botaoAtualizarActionPerformed

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
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntaManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntaManter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAnterior;
    private javax.swing.JButton botaoAtualizar;
    private javax.swing.JButton botaoConsultar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoInserir;
    private javax.swing.JButton botaoLimpar;
    private javax.swing.JButton botaoListagemPer;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoUltimo;
    private javax.swing.JComboBox cboCerta;
    private javax.swing.JComboBox cboNivel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtA;
    private javax.swing.JTextField txtB;
    private javax.swing.JTextField txtC;
    private javax.swing.JTextField txtD;
    private javax.swing.JTextField txtEnunciado;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
