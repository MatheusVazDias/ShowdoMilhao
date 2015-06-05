package admin;
    import dao.PerguntaDAO;
    import java.util.ArrayList;
    import java.util.List;
    import javax.swing.table.DefaultTableModel;
    import modelo.Pergunta;
public class perguntaListar extends javax.swing.JFrame {

    public perguntaListar() {
        initComponents();
        PerguntaDAO dao = new PerguntaDAO();
        List<Pergunta> lista = dao.listar();
        
        Pergunta item = new Pergunta();
        
        /*
        item.setId(1);
        item.setEnunciado("É frágil, temporária e dura de 4 a 8 anos: ");
        item.setA("Política de Governo ou Partidária");
        item.setB("Política Estadual");
        item.setC("Política de Gestão");
        item.setD("Política Parlamentar");
        item.setCerta("C");
        item.setNivel(1);
        lista.add(item);
        
        item = new Pergunta();
        
        item.setId(2);
        item.setEnunciado("Como podem ser definidas as políticas públicas? ");
        item.setA("Ações geradas no Estado");
        item.setB("Ações geradas no Governo");
        item.setC("É uma lei permanente");
        item.setD("Ações geradas no município");
        item.setCerta("A");
        item.setNivel(2);
        lista.add(item);
        
        item = new Pergunta();
        
        item.setId(3);
        item.setEnunciado("Como é chamada a lei que acabou com a escravidão no Brasil? ");
        item.setA("Lei de Laura");
        item.setB("Lei Dourada");
        item.setC("Lei Áurea");
        item.setD("Lei do Ventre Livre");
        item.setCerta("C");
        item.setNivel(1);
        lista.add(item); */
        
        DefaultTableModel modelo = (DefaultTableModel)tabelaPergunta.getModel();
        
        Object[] linha = new Object [modelo.getColumnCount()]; //tamanho do array

        for (Pergunta perg : lista) 
        {
            linha[0] = perg.getId(); //linha da coluna 0
            linha[1] = perg.getEnunciado(); //linha da coluna 1
            linha[2] = perg.getA();
            linha[3] = perg.getB();
            linha[4] = perg.getC();
            linha[5] = perg.getD();
            linha[6] = perg.getCerta();
            linha[7] = perg.getNivel();
           
            modelo.addRow(linha);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botaoGerenPergunta = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPergunta = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoGerenPergunta.setText("Gerenciar Pergunta");
        botaoGerenPergunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoGerenPerguntaActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Listagem"));

        tabelaPergunta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Enunciado", "A", "B", "C", "D", "Certa", "Nível"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaPergunta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 739, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botaoGerenPergunta)
                .addGap(317, 317, 317))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botaoGerenPergunta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoGerenPerguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoGerenPerguntaActionPerformed
        perguntaManter tela = new perguntaManter();
        tela.setVisible(true);
        tela.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_botaoGerenPerguntaActionPerformed

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
            java.util.logging.Logger.getLogger(perguntaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perguntaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perguntaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perguntaListar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perguntaListar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoGerenPergunta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaPergunta;
    // End of variables declaration//GEN-END:variables
}
