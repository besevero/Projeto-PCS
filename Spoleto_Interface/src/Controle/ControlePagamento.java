/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaCartao;
import View.TelaInicial;
import View.TelaPagamento;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bernardo
 */
public class ControlePagamento {
    private Pedido pedido;
    private TelaPagamento TelaPagamento;
    
    public ControlePagamento(TelaPagamento TelaPagamento){
        this.pedido = new Pedido(0);
        this.TelaPagamento = TelaPagamento;
    }
    public void insereListaPgto(DefaultListModel modeloPedido){
        for(int i = 0; i<getPedido().getPratos().size();i++){
            modeloPedido.addElement((getPedido().getPratos().get(i).getNome()
                    + " ------- " + getPedido().getPratos().get(i).getValor()));
        }
        
    }
    public double totalCompra(){
        double totalCompra = 0;
         for(int i = 0; i<getPedido().getPratos().size();i++){
                 totalCompra = totalCompra + getPedido().getPratos().get(i).getValor();
         }
         return totalCompra;
    }
    public void insereCartao(){
        TelaCartao TelaCartao = new TelaCartao(pedido);
        TelaCartao.setVisible(true);
        getTelaPagamento().setVisible(false);
    }
    public void inicio(){
        TelaInicial TelaInicial = new TelaInicial(pedido);
        TelaInicial.setVisible(true);
        getTelaPagamento().setVisible(false);
    }

    /**
     * @return the pedido
     */
    public Pedido getPedido() {
        return pedido;
    }

    /**
     * @param pedido the pedido to set
     */
    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    /**
     * @return the TelaPagamento
     */
    public TelaPagamento getTelaPagamento() {
        return TelaPagamento;
    }

    /**
     * @param TelaPagamento the TelaPagamento to set
     */
    public void setTelaPagamento(TelaPagamento TelaPagamento) {
        this.TelaPagamento = TelaPagamento;
    }
}
