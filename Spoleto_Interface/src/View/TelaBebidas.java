/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ControleBebida;
import Model.Pedido;


public class TelaBebidas extends javax.swing.JFrame {

    /**
     * Creates new form TelaBebidas
     */
    ControleBebida novo = new ControleBebida(this);
            
    public void desativar(){
        coca.setEnabled(false);
        iceTea.setEnabled(false);
        laranja.setEnabled(false);
        mate.setEnabled(false);
        uva.setEnabled(false);
        proximo.setEnabled(true);
    }
    public void ativar(){
        coca.setEnabled(true);
        iceTea.setEnabled(true);
        laranja.setEnabled(true);
        mate.setEnabled(true);
        uva.setEnabled(true);
        proximo.setEnabled(false);
    }
    public TelaBebidas(Pedido s) {
        initComponents();
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
        jPanel2 = new javax.swing.JPanel();
        voltar = new javax.swing.JButton();
        proximo = new javax.swing.JButton();
        escolhaBebida = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        coca = new javax.swing.JButton();
        iceTea = new javax.swing.JButton();
        laranja = new javax.swing.JButton();
        mate = new javax.swing.JButton();
        uva = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(247, 224, 182));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 600));

        jPanel2.setBackground(new java.awt.Color(252, 207, 132));
        jPanel2.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel2.setPreferredSize(new java.awt.Dimension(1021, 199));

        voltar.setBackground(new java.awt.Color(252, 207, 132));
        voltar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        voltar.setText("Voltar");
        voltar.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        proximo.setBackground(new java.awt.Color(252, 207, 132));
        proximo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        proximo.setText("Próximo");
        proximo.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        proximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proximoActionPerformed(evt);
            }
        });

        escolhaBebida.setBackground(new java.awt.Color(245, 156, 97));
        escolhaBebida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escolhaBebidaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Sua(s) Escolha(s) :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 939, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(escolhaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(voltar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(proximo, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(escolhaBebida, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(40, Short.MAX_VALUE))))
        );

        coca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_coca.png"))); // NOI18N
        coca.setMaximumSize(new java.awt.Dimension(103, 77));
        coca.setMinimumSize(new java.awt.Dimension(103, 77));
        coca.setPreferredSize(new java.awt.Dimension(103, 77));
        coca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cocaActionPerformed(evt);
            }
        });

        iceTea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_iceTea.png"))); // NOI18N
        iceTea.setMaximumSize(new java.awt.Dimension(103, 77));
        iceTea.setMinimumSize(new java.awt.Dimension(103, 77));
        iceTea.setPreferredSize(new java.awt.Dimension(103, 77));
        iceTea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iceTeaActionPerformed(evt);
            }
        });

        laranja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_suco_laranja.png"))); // NOI18N
        laranja.setMaximumSize(new java.awt.Dimension(103, 77));
        laranja.setMinimumSize(new java.awt.Dimension(103, 77));
        laranja.setPreferredSize(new java.awt.Dimension(103, 77));
        laranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laranjaActionPerformed(evt);
            }
        });

        mate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_matte.png"))); // NOI18N
        mate.setMaximumSize(new java.awt.Dimension(103, 77));
        mate.setMinimumSize(new java.awt.Dimension(103, 77));
        mate.setPreferredSize(new java.awt.Dimension(103, 77));
        mate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mateActionPerformed(evt);
            }
        });

        uva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/botao_suco_uva.png"))); // NOI18N
        uva.setMaximumSize(new java.awt.Dimension(103, 77));
        uva.setMinimumSize(new java.awt.Dimension(103, 77));
        uva.setPreferredSize(new java.awt.Dimension(103, 77));
        uva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uvaActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/titulo_bebidas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 1000, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(coca, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(iceTea, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(laranja, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(uva, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(327, 327, 327)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(iceTea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(coca, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(laranja, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(uva, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
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
 
    private void proximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proximoActionPerformed
        // TODO add your handling code here:
        novo.proximoBebida(escolhaBebida.getText());
    }//GEN-LAST:event_proximoActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        novo.voltaBebida();
    }//GEN-LAST:event_voltarActionPerformed

    private void cocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cocaActionPerformed
        // TODO add your handling code here:
        escolhaBebida.setText(novo.selecao(3));
        desativar();
    }//GEN-LAST:event_cocaActionPerformed

    private void iceTeaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iceTeaActionPerformed
        // TODO add your handling code here:
        escolhaBebida.setText(novo.selecao(4));
        desativar();
    }//GEN-LAST:event_iceTeaActionPerformed

    private void laranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laranjaActionPerformed
        // TODO add your handling code here:
        escolhaBebida.setText(novo.selecao(2));
        desativar();
    }//GEN-LAST:event_laranjaActionPerformed

    private void escolhaBebidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escolhaBebidaActionPerformed
        // TODO add your handling code here:
       ativar();
       escolhaBebida.setText("");
    }//GEN-LAST:event_escolhaBebidaActionPerformed

    private void mateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mateActionPerformed
        // TODO add your handling code here:
        desativar();
        escolhaBebida.setText(novo.selecao(0));
    }//GEN-LAST:event_mateActionPerformed

    private void uvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uvaActionPerformed
        // TODO add your handling code here:
        desativar();
        escolhaBebida.setText(novo.selecao(1));
    }//GEN-LAST:event_uvaActionPerformed

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
            java.util.logging.Logger.getLogger(TelaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaBebidas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TelaBebidas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton coca;
    private javax.swing.JButton escolhaBebida;
    private javax.swing.JButton iceTea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton laranja;
    private javax.swing.JButton mate;
    private javax.swing.JButton proximo;
    private javax.swing.JButton uva;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
