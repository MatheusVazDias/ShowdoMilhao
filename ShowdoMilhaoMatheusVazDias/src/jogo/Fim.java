package jogo;

import dao.RankingDAO;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Jogador;
import modelo.JogoCompleto;
import modelo.Ranking;

public class Fim extends javax.swing.JFrame {

    private JogoCompleto completo;
    private RankingDAO dao;
    
    public JogoCompleto getCompleto() {
        return completo;
    }

    public void setCompleto(JogoCompleto completo) {
        this.completo = completo;
    }
  
    public Fim() 
    {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtGanhoFinal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botaoRanking = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(254, 254, 254));
        jLabel1.setText("FIM!!!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 28, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtGanhoFinal.setBackground(new java.awt.Color(0, 0, 255));
        txtGanhoFinal.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        txtGanhoFinal.setForeground(new java.awt.Color(254, 254, 254));
        txtGanhoFinal.setText("*******");
        jPanel1.add(txtGanhoFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 360, 50));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(254, 254, 254));
        jLabel2.setText("VOCÊ GANHOU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, -1, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(254, 254, 254));
        jLabel3.setText("DE  REAIS!!");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, -1, -1));

        botaoRanking.setText(" Ranking");
        botaoRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRankingActionPerformed(evt);
            }
        });
        jPanel1.add(botaoRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/moedas_chuva.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 520));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     txtGanhoFinal.setText(completo.getGanhos().toString()); 
     
     Ranking r = new Ranking();
     r.setData(new Date());
     r.setJogador(completo.getJogador());
     r.setPontos(completo.getGanhos().intValue());
     dao.inserir(r);
    }//GEN-LAST:event_formWindowOpened

    private void botaoRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRankingActionPerformed
       
        rankingListar tela;
        try 
        {
            tela = new  rankingListar();
            tela.setVisible(true);
            this.setVisible(false);
        } 
        catch (ParseException ex) {
            Logger.getLogger(Fim.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_botaoRankingActionPerformed

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
            java.util.logging.Logger.getLogger(Fim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fim.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRanking;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txtGanhoFinal;
    // End of variables declaration//GEN-END:variables
}
