/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controle.ControleEstoque;
import javax.swing.DefaultListModel;
import Controle.Arquivos;
import Model.Bebida;
import Model.Molho;
import Model.Prato_Favorito;
import Model.Prato_Promocao;
import Model.Produto_Extra;
import Model.Produto_Ingrediente;
import Model.Produto_Massa;
import java.util.ArrayList;

/**
 *
 * @author labccet
 */
public class TelaVisualizarEstoque extends javax.swing.JFrame {

    private DefaultListModel modeloEstoque = new DefaultListModel();  
    private ControleEstoque controleEstoque;
    private String nome;
    private TelaAtendente atendente;
    private TelaEstoque estoque;
    private boolean reposicao = false;
    private ArrayList produto = new ArrayList();
    
    public void AdicionaEstoque(String nomes){
        
        Arquivos persistencia = new Arquivos(nomes);
                
        modeloEstoque.clear();

        if(nomes.equals("Bebida.xml")){
            Bebida bebida = new Bebida();
            bebida.setIdBebida(persistencia.lerXML());
            for(int i = 0 ; i<bebida.getIdBebida().size();i++){
                modeloEstoque.addElement(bebida.getIdBebida().get(i).getNome()
                        + " ------ " + bebida.getIdBebida().get(i).getQuantidade());
            }
            if(isReposicao() == true){
                for(int i = 0 ; i<bebida.getIdBebida().size();i++){
                    bebida.getIdBebida().get(i).setQuantidade(35);
                }
                setReposicao(false);
                persistencia.setEscrever(bebida.getIdBebida());
                persistencia.imprimir();
            }
            
            
        }
         if(nomes.equals("Molho.xml")){
            Molho molho= new Molho();
            molho.setMolho(persistencia.lerXML());
            for(int i = 0 ; i<molho.getMolho().size();i++){
                modeloEstoque.addElement(molho.getMolho().get(i).getNome()
                        + " ------ " + molho.getMolho().get(i).getQuantidade());
            }
            if(isReposicao() == true){
                for(int i = 0 ; i<molho.getMolho().size();i++){
                    molho.getMolho().get(i).setQuantidade(35);
                }
                setReposicao(false);
                persistencia.setEscrever(molho.getMolho());
                persistencia.imprimir();
            }
            
        }
          if(nomes.equals("Favorito.xml")){
            Prato_Favorito favorito= new Prato_Favorito();
            favorito.setfavorito(persistencia.lerXML());
            for(int i = 0 ; i<favorito.getFavorito().size();i++){
                modeloEstoque.addElement(favorito.getFavorito().get(i).getNome()
                        + " ------ " + favorito.getFavorito().get(i).getQuantidade());
            }
            if(isReposicao() == true){
                for(int i = 0 ; i<favorito.getFavorito().size();i++){
                    favorito.getFavorito().get(i).setQuantidade(35);
                }
                setReposicao(false);
                persistencia.setEscrever(favorito.getFavorito());
                persistencia.imprimir();
            }
            
        }
           if(nomes.equals("Promocao.xml")){
            Prato_Promocao promocao = new Prato_Promocao();
            promocao.setPromoc(persistencia.lerXML());
            for(int i = 0 ; i<promocao.getPromoc().size();i++){
                modeloEstoque.addElement(promocao.getPromoc().get(i).getNome()
                        + " ------ " + promocao.getPromoc().get(i).getQuantidade());
            }
            if(isReposicao() == true){
                for(int i = 0 ; i<promocao.getPromoc().size();i++){
                    promocao.getPromoc().get(i).setQuantidade(35);
                }
                setReposicao(false);
                persistencia.setEscrever(promocao.getPromoc());
                persistencia.imprimir();
            }
            
        }
            if(nomes.equals("Extra.xml")){
               Produto_Extra extra = new Produto_Extra();
                extra.setProdExtra(persistencia.lerXML());
                for(int i = 0 ; i<extra.getProdExtra().size();i++){
                    modeloEstoque.addElement(extra.getProdExtra().get(i).getNome()
                        + " ------ " + extra.getProdExtra().get(i).getQuantidade());
            }
                if(isReposicao() == true){
                for(int i = 0 ; i<extra.getProdExtra().size();i++){
                    extra.getProdExtra().get(i).setQuantidade(35);
                }
                setReposicao(false);
                persistencia.setEscrever(extra.getProdExtra());
                persistencia.imprimir();
            }
        }
            if(nomes.equals("Ingrediente.xml")){
                Produto_Ingrediente ingrediente = new Produto_Ingrediente();
                ingrediente.setIdIngrediente(persistencia.lerXML());
                for(int i = 0 ; i<ingrediente.getIdIngrediente().size();i++){
                    modeloEstoque.addElement(ingrediente.getIdIngrediente().get(i).getNome()
                            + " ------ " + ingrediente.getIdIngrediente().get(i).getQuantidade());
            }
                if(isReposicao() == true){
                for(int i = 0 ; i<ingrediente.getIdIngrediente().size();i++){
                    ingrediente.getIdIngrediente().get(i).setQuantidade(100);
                }
                setReposicao(false);
                persistencia.setEscrever(ingrediente.getIdIngrediente());
                persistencia.imprimir();
            }
            if(nomes.equals("Massa.xml")){
                Produto_Massa massa = new Produto_Massa();
                massa.setIdMassa(persistencia.lerXML());
                for(int i = 0 ; i<massa.getIdMassa().size();i++){
                modeloEstoque.addElement(massa.getIdMassa().get(i).getNome()
                        + " ------ " + massa.getIdMassa().get(i).getQuantidade());
            }
                if(isReposicao() == true){
                for(int i = 0 ; i<massa.getIdMassa().size();i++){
                    massa.getIdMassa().get(i).setQuantidade(35);
                }
                    setReposicao(false);
                persistencia.setEscrever(massa.getIdMassa());
                persistencia.imprimir();
            }
        }
        }
            
    }
    public TelaVisualizarEstoque(String nome, TelaAtendente atendente, TelaEstoque estoque) {
        this.nome = nome;
        this.atendente = atendente;
        this.estoque = estoque;
        initComponents();        
        if(nome.equals("Promocao.xml")){
                titulo.setText("Pratos Promoção");
        }
        else    titulo.setText(nome.substring(0, (nome.length()-4)));
        AdicionaEstoque(nome);
        listaDoEstoque.setModel(modeloEstoque);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ok = new javax.swing.JButton();
        voltar = new javax.swing.JButton();
        repor = new javax.swing.JButton();
        titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaDoEstoque = new javax.swing.JList<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Visualizando Estoque");
        setResizable(false);

        ok.setText("OK");
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });

        voltar.setText("VOLTAR");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });

        repor.setText("REPOR ESTOQUE");
        repor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reporActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(listaDoEstoque);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(repor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(voltar)
                .addGap(32, 32, 32)
                .addComponent(ok)
                .addGap(58, 58, 58))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(187, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ok)
                    .addComponent(voltar)
                    .addComponent(repor))
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
      estoque.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_voltarActionPerformed

    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
      atendente.setVisible(true);
      this.dispose();
    }//GEN-LAST:event_okActionPerformed

    private void reporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reporActionPerformed
        setReposicao(true);
        AdicionaEstoque(nome);
    }//GEN-LAST:event_reporActionPerformed

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
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaVisualizarEstoque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               //new TelaVisualizarEstoque().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaDoEstoque;
    private javax.swing.JButton ok;
    private javax.swing.JButton repor;
    private javax.swing.JLabel titulo;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the reposicao
     */
    public boolean isReposicao() {
        return reposicao;
    }

    /**
     * @param reposicao the reposicao to set
     */
    public void setReposicao(boolean reposicao) {
        this.reposicao = reposicao;
    }
}
