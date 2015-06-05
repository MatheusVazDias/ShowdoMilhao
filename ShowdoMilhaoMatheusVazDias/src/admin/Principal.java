package admin;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        lblSilvio = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuGerenJog = new javax.swing.JMenuItem();
        menuListarJog = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuGerenPerg = new javax.swing.JMenuItem();
        menuGerenListarPerg = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblSilvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/logo.jpg"))); // NOI18N
        lblSilvio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSilvioMouseClicked(evt);
            }
        });

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 204));

        jMenu1.setBackground(new java.awt.Color(0, 0, 204));
        jMenu1.setForeground(new java.awt.Color(0, 0, 204));
        jMenu1.setText("Jogador");

        menuGerenJog.setText("Gerenciar");
        menuGerenJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenJogActionPerformed(evt);
            }
        });
        jMenu1.add(menuGerenJog);

        menuListarJog.setText("Listar");
        menuListarJog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuListarJogActionPerformed(evt);
            }
        });
        jMenu1.add(menuListarJog);

        jMenuBar1.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(0, 0, 204));
        jMenu2.setText("Pergunta");

        menuGerenPerg.setText("Gerenciar");
        menuGerenPerg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenPergActionPerformed(evt);
            }
        });
        jMenu2.add(menuGerenPerg);

        menuGerenListarPerg.setText("Listar");
        menuGerenListarPerg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGerenListarPergActionPerformed(evt);
            }
        });
        jMenu2.add(menuGerenListarPerg);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(lblSilvio, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSilvio)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuGerenPergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenPergActionPerformed
        perguntaManter tela = new perguntaManter();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenPergActionPerformed

    private void menuGerenJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenJogActionPerformed
        jogadorManter tela = new jogadorManter();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenJogActionPerformed

    private void menuListarJogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuListarJogActionPerformed
        jogadorListar tela = new jogadorListar();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuListarJogActionPerformed

    private void menuGerenListarPergActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGerenListarPergActionPerformed
        perguntaListar tela = new perguntaListar();
        
        //fechar apenas a janela
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        tela.setVisible(true);
    }//GEN-LAST:event_menuGerenListarPergActionPerformed

    private void lblSilvioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSilvioMouseClicked
        lblSilvio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/silviosantos.jpg")));
    }//GEN-LAST:event_lblSilvioMouseClicked

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JLabel lblSilvio;
    private javax.swing.JMenuItem menuGerenJog;
    private javax.swing.JMenuItem menuGerenListarPerg;
    private javax.swing.JMenuItem menuGerenPerg;
    private javax.swing.JMenuItem menuListarJog;
    // End of variables declaration//GEN-END:variables
}
