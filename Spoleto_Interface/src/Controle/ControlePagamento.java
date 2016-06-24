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
import View.TelaPedido;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bernardo
 */
public class ControlePagamento {
    private Pedido pedido;
    private TelaPagamento TelaPagamento;
    
    public ControlePagamento(TelaPagamento TelaPagamento){
        this.pedido = new Pedido();
        this.TelaPagamento = TelaPagamento;
    }
    public void insereListaPgto(DefaultListModel modeloPedido){
        for(int i = 0; i<getPedido().getPratos().size();i++){
            modeloPedido.addElement((getPedido().getPratos().get(i).getNome()
                    + " ------- " + (double)getPedido().getPratos().get(i).getPreco()));
        }
        
    }
    public double totalCompra(){
        double totalCompra = 0;
         for(int i = 0; i<getPedido().getPratos().size();i++){
                 totalCompra = totalCompra + getPedido().getPratos().get(i).getPreco();
         }
         return totalCompra;
    }
    public void insereCartao(){
        TelaCartao TelaCartao = new TelaCartao(pedido);
        TelaCartao.setVisible(true);
        TelaPagamento.setVisible(false);
    }
    public void inicio(){
        TelaInicial TelaInicial = new TelaInicial(pedido);
        TelaInicial.setVisible(true);
        getTelaPagamento().setVisible(false);
    }
    public void voltar(){
        TelaPedido TelaPedido = new TelaPedido(pedido);
        TelaPedido.setVisible(true);
        getTelaPagamento().setVisible(false);
    }
    
    public void apagaPedido(){
            pedido.getPratos().clear();
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TelaPagamento getTelaPagamento() {
        return TelaPagamento;
    }

    public void setTelaPagamento(TelaPagamento TelaPagamento) {
        this.TelaPagamento = TelaPagamento;
    }
}
