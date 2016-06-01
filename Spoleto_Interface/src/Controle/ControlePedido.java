/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaInicial;
import View.TelaPagamento;
import View.TelaPedido;
import javax.swing.DefaultListModel;

/**
 *
 * @author Bernardo
 */
public class ControlePedido {
    
   private Pedido pedido;
    private TelaPedido TelaPedido;
    
    public ControlePedido(TelaPedido TelaPedido){
        this.pedido = new Pedido(1);
        this.TelaPedido = TelaPedido;
    }
    
    public void insereLista(DefaultListModel modeloPedido, Pedido p){
        for(int i = 0; i<p.getPratos().size();i++){
            modeloPedido.addElement((p.getPratos().get(i).getNome() 
                    + " ------- " + p.getPratos().get(i).getValor()));
        }
    }
    public void inicial(){
        TelaInicial TelaInicial = new TelaInicial(pedido);
        TelaPedido.setVisible(false);
        TelaInicial.setVisible(true);
    }
    public void gerarPedido(){
        TelaPagamento TelaPagamento = new TelaPagamento(pedido);
        TelaPedido.setVisible(false);
        TelaPagamento.setVisible(true);
    }
}
