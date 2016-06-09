/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ControleTelaMassas;
import Model.Pedido;
import javax.swing.ImageIcon;

/**
 *
 * @author Diagramar
 */
public class TelaMassas extends javax.swing.JFrame {
    
    private ControleTelaMassas novo = new ControleTelaMassas(this);
    
    /**
     * Creates new form TelaMassas
     */
    
    public TelaMassas(Pedido s) {
        initComponents();
        novo.setPedido(s);
        proximo.setEnabled(false);
    }
    
    public void desativar(){
        spaghetti.setEnabled(false);
        farfalle.setEnabled(false);
        fetuccine.setEnabled(false);
        penne.setEnabled(false);        
        gnochi.setEnabled(false);
        ravioliGorgonzola.setEnabled(false);
        ravioliTomateSeco.setEnabled(false);
        ravioliRicota.setEnabled(false);
        ravioliQueijoPresunto.setEnabled(false);
        cappellettiCarne.setEnabled(false);
        cappellettiFrango.setEnabled(false);
        proximo.setEnabled(true);
    }
    public void ativar(){
        spaghetti.setEnabled(true);
        farfalle.setEnabled(true);
        fetuccine.setEnabled(true);
        penne.setEnabled(true);        
        gnochi.setEnabled(true);
        ravioliGorgonzola.setEnabled(true);
        ravioliTomateSeco.setEnabled(true);
        ravioliRicota.setEnabled(true);
        ravioliQueijoPresunto.setEnabled(true);
        cappellettiCarne.setEnabled(true);
        cappellettiFrango.setEnabled(true);
        proximo.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cappellettiCarne = new javax.swing.JButton();
        ravioliQueijoPresunto = new javax.swing.JButton();
        penne = new javax.swing.JButton();
        farfalle = new javax.swing.JButton();
        gnochi = new javax.swing.JButton();
        spaghetti = new javax.swing.JButton();
        fetuccine = new javax.swing.JButton();
        cappellettiFrango = new javax.swing.JButton();
        ravioliGorgonzola = new javax.swing.JButton();
        ravioliTomateSeco = new javax.swing.JButton();
        ravioliRicota = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        escolhaMassa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        proximo = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 224, 182));

        cappellettiCarne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_cappelletti_carne.png"))); // NOI18N
        cappellettiCarne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappellettiCarneActionPerformed(evt);
            }
        });

        ravioliQueijoPresunto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_ravioli_queijo.png"))); // NOI18N
        ravioliQueijoPresunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ravioliQueijoPresuntoActionPerformed(evt);
            }
        });

        penne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_penne.png"))); // NOI18N
        penne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penneActionPerformed(evt);
            }
        });

        farfalle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_farfalhe.png"))); // NOI18N
        farfalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                farfalleActionPerformed(evt);
            }
        });

        gnochi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_gnocchi.png"))); // NOI18N
        gnochi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gnochiActionPerformed(evt);
            }
        });

        spaghetti.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_spaghetti.png"))); // NOI18N
        spaghetti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                spaghettiActionPerformed(evt);
            }
        });

        fetuccine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_fettuccine.png"))); // NOI18N
        fetuccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fetuccineActionPerformed(evt);
            }
        });

        cappellettiFrango.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_cappelletti_frango.png"))); // NOI18N
        cappellettiFrango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cappellettiFrangoActionPerformed(evt);
            }
        });

        ravioliGorgonzola.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_ravioli_gorgonzola.png"))); // NOI18N
        ravioliGorgonzola.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ravioliGorgonzolaActionPerformed(evt);
            }
        });

        ravioliTomateSeco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_ravioli_tomate.png"))); // NOI18N
        ravioliTomateSeco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ravioliTomateSecoActionPerformed(evt);
            }
        });

        ravioliRicota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_ravioli_ricota.png"))); // NOI18N
        ravioliRicota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ravioliRicotaActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(252, 207, 132));

        escolhaMassa.setBackground(new java.awt.Color(245, 156, 97));
        escolhaMassa.setFont(new java.awt.Font("BlackJack", 1, 11)); // NOI18N
        escolhaMassa.setToolTipText("");
        escolhaMassa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 102, 0), 1, true));
        escolhaMassa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaMassaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sua(s) Escolha(s) :");

        proximo.setBackground(new java.awt.Color(252, 207, 132));
        proximo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proximo.setText("Próximo");
        proximo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        voltar.setBackground(new java.awt.Color(252, 207, 132));
        voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(252, 207, 132));
        cancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(793, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(escolhaMassa, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(escolhaMassa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/titulo_massas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(spaghetti, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(farfalle, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fetuccine, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(penne, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(gnochi, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cappellettiCarne, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cappellettiFrango, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(ravioliGorgonzola, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ravioliQueijoPresunto, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ravioliRicota, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ravioliTomateSeco, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(188, 188, 188)))
                .addGap(76, 76, 76))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(350, 350, 350)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cappellettiCarne)
                    .addComponent(gnochi)
                    .addComponent(spaghetti)
                    .addComponent(farfalle)
                    .addComponent(fetuccine)
                    .addComponent(penne)
                    .addComponent(cappellettiFrango))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ravioliQueijoPresunto)
                    .addComponent(ravioliGorgonzola)
                    .addComponent(ravioliRicota)
                    .addComponent(ravioliTomateSeco))
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void escolhaMassaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaMassaActionPerformed
        escolhaMassa.setText("");
        ativar();
    }//GEN-LAST:event_escolhaMassaActionPerformed

    private void spaghettiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_spaghettiActionPerformed
        escolhaMassa.setText("Spaghetti");
        desativar();
    }//GEN-LAST:event_spaghettiActionPerformed

    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
       
        novo.proximoMassa(escolhaMassa.getText());
        
    }//GEN-LAST:event_proximoActionPerformed

    private void farfalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_farfalleActionPerformed
       escolhaMassa.setText("Farfalle");
       desativar();
    }//GEN-LAST:event_farfalleActionPerformed

    private void fetuccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fetuccineActionPerformed
       escolhaMassa.setText("Fetccine");
       desativar();
    }//GEN-LAST:event_fetuccineActionPerformed

    private void penneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penneActionPerformed
       escolhaMassa.setText("Penne");
       desativar();
    }//GEN-LAST:event_penneActionPerformed

    private void gnochiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gnochiActionPerformed
        escolhaMassa.setText("Gnochi");
        desativar();
    }//GEN-LAST:event_gnochiActionPerformed

    private void cappellettiCarneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappellettiCarneActionPerformed
      escolhaMassa.setText("Cappelletti de Carne");
      desativar();
    }//GEN-LAST:event_cappellettiCarneActionPerformed

    private void cappellettiFrangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cappellettiFrangoActionPerformed
      escolhaMassa.setText("Cappelletti de Frango");
      desativar();
    }//GEN-LAST:event_cappellettiFrangoActionPerformed

    private void ravioliGorgonzolaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ravioliGorgonzolaActionPerformed
       escolhaMassa.setText("Ravioli de Gorgonzola");
       desativar();
    }//GEN-LAST:event_ravioliGorgonzolaActionPerformed

    private void ravioliQueijoPresuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ravioliQueijoPresuntoActionPerformed
       escolhaMassa.setText("Ravioli de Queijo com Presunto");
       desativar();
    }//GEN-LAST:event_ravioliQueijoPresuntoActionPerformed

    private void ravioliRicotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ravioliRicotaActionPerformed
       escolhaMassa.setText("Ravioli de Ricota");
       desativar();
    }//GEN-LAST:event_ravioliRicotaActionPerformed

    private void ravioliTomateSecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ravioliTomateSecoActionPerformed
      escolhaMassa.setText("Ravioli de Tomate Seco");
      desativar();
    }//GEN-LAST:event_ravioliTomateSecoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        novo.voltaMassa();
    }//GEN-LAST:event_voltarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        novo.cancelar();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(TelaMassas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMassas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMassas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMassas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaMassas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton cappellettiCarne;
    private javax.swing.JButton cappellettiFrango;
    private javax.swing.JButton escolhaMassa;
    private javax.swing.JButton farfalle;
    private javax.swing.JButton fetuccine;
    private javax.swing.JButton gnochi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton penne;
    private javax.swing.JButton proximo;
    private javax.swing.JButton ravioliGorgonzola;
    private javax.swing.JButton ravioliQueijoPresunto;
    private javax.swing.JButton ravioliRicota;
    private javax.swing.JButton ravioliTomateSeco;
    private javax.swing.JButton spaghetti;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
