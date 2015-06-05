package admin;
    import dao.JogadorDAO;
    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.JOptionPane;
    import modelo.Jogador;

public class jogadorManter extends javax.swing.JFrame {

    private List<Jogador> lista;
    Integer posicao; 
    
    public jogadorManter() {
        initComponents();
        
        //Buscar a lista no banco de dados 
        JogadorDAO dao = new JogadorDAO();
        lista = dao.listar();
        posicao = 0;
    }

    public void Limpar ()
    {
        txtEmail.setText("");
        txtSenha.setText("");
        txtLogin.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoPrimeiro = new javax.swing.JButton();
        botaoAnterior = new javax.swing.JButton();
        botaoProximo = new javax.swing.JButton();
        botaoUltimo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        botaoInserir = new javax.swing.JButton();
        botaoLimpar = new javax.swing.JButton();
        botaoExcluir = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JButton();
        botaoListagemJog = new javax.swing.JButton();
        botaoAtualizar = new javax.swing.JButton();
        txtEmail = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtLogin = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setText("JOGADOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 11, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Email:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Senha:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 258, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Login:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 315, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Navegação"));
        jPanel1.setForeground(new java.awt.Color(0, 0, 255));

        botaoPrimeiro.setBackground(new java.awt.Color(204, 0, 0));
        botaoPrimeiro.setForeground(new java.awt.Color(255, 255, 255));
        botaoPrimeiro.setText("Primeiro");
        botaoPrimeiro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPrimeiroActionPerformed(evt);
            }
        });

        botaoAnterior.setBackground(new java.awt.Color(204, 0, 0));
        botaoAnterior.setForeground(new java.awt.Color(255, 255, 255));
        botaoAnterior.setText("Anterior");
        botaoAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAnteriorActionPerformed(evt);
            }
        });

        botaoProximo.setBackground(new java.awt.Color(204, 0, 0));
        botaoProximo.setForeground(new java.awt.Color(255, 255, 255));
        botaoProximo.setText("Próximo");
        botaoProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoProximoActionPerformed(evt);
            }
        });

        botaoUltimo.setBackground(new java.awt.Color(204, 0, 0));
        botaoUltimo.setForeground(new java.awt.Color(255, 255, 255));
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
                .addGap(31, 31, 31)
                .addComponent(botaoPrimeiro)
                .addGap(29, 29, 29)
                .addComponent(botaoAnterior)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(botaoProximo)
                .addGap(27, 27, 27)
                .addComponent(botaoUltimo)
                .addGap(31, 31, 31))
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

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 51, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Ações"));

        botaoInserir.setBackground(new java.awt.Color(0, 0, 204));
        botaoInserir.setForeground(new java.awt.Color(255, 255, 255));
        botaoInserir.setText("Inserir");
        botaoInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInserirActionPerformed(evt);
            }
        });

        botaoLimpar.setBackground(new java.awt.Color(0, 0, 204));
        botaoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        botaoLimpar.setText("Limpar");
        botaoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLimparActionPerformed(evt);
            }
        });

        botaoExcluir.setBackground(new java.awt.Color(0, 0, 204));
        botaoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoConsultar.setBackground(new java.awt.Color(0, 0, 204));
        botaoConsultar.setForeground(new java.awt.Color(255, 255, 255));
        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        botaoListagemJog.setText("Ir para Listagem");
        botaoListagemJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoListagemJogActionPerformed(evt);
            }
        });

        botaoAtualizar.setBackground(new java.awt.Color(0, 0, 204));
        botaoAtualizar.setForeground(new java.awt.Color(255, 255, 255));
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoConsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botaoAtualizar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(botaoListagemJog)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoInserir)
                    .addComponent(botaoLimpar)
                    .addComponent(botaoExcluir)
                    .addComponent(botaoConsultar)
                    .addComponent(botaoAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoListagemJog)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 430, -1));
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 197, 346, -1));
        getContentPane().add(txtSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 255, 346, -1));
        getContentPane().add(txtLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 312, 346, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInserirActionPerformed
        Jogador item = new Jogador ();
        
        if (txtEmail.getText().isEmpty() || txtSenha.getText().isEmpty() || txtLogin.getText().isEmpty()) 
        {
            JOptionPane.showMessageDialog(rootPane,"Preencher todos os campos!");
        }
        else
        {
            item.setEmail(txtEmail.getText());
            item.setSenha(txtSenha.getText());
            item.setLogin(txtLogin.getText());
            
            //instanciando a classe de acesso a dados JogadorDAO       
            JogadorDAO dao = new JogadorDAO();
            
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

    private void botaoListagemJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoListagemJogActionPerformed
        jogadorListar tela = new jogadorListar();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botaoListagemJogActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        if (txtEmail.getText().isEmpty()==false)
        {      
            //instanciando a classe de acesso a dados JogadorDAO       
            JogadorDAO dao = new JogadorDAO();
            
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
        String login = JOptionPane.showInputDialog("Digite o login a ser pesquisado:");
        
        Boolean encontrou = false;
        Integer posicaoachou = 0;
        
        for (Jogador lista1 : lista) 
        {
            if (login.equalsIgnoreCase(lista1.getLogin()))
            {
                encontrou = true;
                posicao = posicaoachou;
                
                txtEmail.setText(lista1.getEmail().toString());
                txtSenha.setText(lista1.getSenha());
                txtLogin.setText(lista1.getLogin());
                
                break;
            }
            
            posicaoachou ++;
        }
        
        if (encontrou == false)
        {
            JOptionPane.showMessageDialog(null, "Jogador ainda não cadastrado!");
        }
    }//GEN-LAST:event_botaoConsultarActionPerformed

    private void botaoPrimeiroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPrimeiroActionPerformed
        botaoPrimeiro.setEnabled(true);
        botaoAnterior.setEnabled(false);
        botaoProximo.setEnabled(true);
        botaoUltimo.setEnabled(true);
        
        if (lista.size()>0)
        {
            posicao = 0;
            
            Jogador elemento = lista.get(0);
            
            txtEmail.setText(elemento.getEmail());
            txtSenha.setText(elemento.getSenha());
            txtLogin.setText(elemento.getLogin());
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
            
            Jogador elemento = lista.get(posicao);
            
            txtEmail.setText(elemento.getEmail());
            txtSenha.setText(elemento.getSenha());
            txtLogin.setText(elemento.getLogin());
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
        
            Jogador elemento = lista.get(posicao);
        
            txtEmail.setText(elemento.getEmail());
            txtSenha.setText(elemento.getSenha());
            txtLogin.setText(elemento.getLogin());
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
        
            Jogador elemento = lista.get(posicao);
        
            txtEmail.setText(elemento.getEmail());
            txtSenha.setText(elemento.getSenha());
            txtLogin.setText(elemento.getLogin());
        }
    }//GEN-LAST:event_botaoUltimoActionPerformed

    private void botaoAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarActionPerformed
        Jogador jogador = new Jogador();
        
        if (txtLogin.getText().isEmpty()==false)
        {
            jogador.setLogin(txtLogin.getText());
            jogador.setEmail(txtEmail.getText());
            jogador.setSenha(txtSenha.getText());
            JogadorDAO dao = new JogadorDAO();
            Boolean deucerto = dao.atualizar(jogador);
            
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
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jogadorManter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jogadorManter().setVisible(true);
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
    private javax.swing.JButton botaoListagemJog;
    private javax.swing.JButton botaoPrimeiro;
    private javax.swing.JButton botaoProximo;
    private javax.swing.JButton botaoUltimo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JTextField txtSenha;
    // End of variables declaration//GEN-END:variables
}
