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
    
    public ControlePagamento(Pedido pedido, TelaPagamento TelaPagamento){
        this.pedido = pedido;
        this.TelaPagamento = TelaPagamento;
    }

    public void insereListaPgto(DefaultListModel modeloPedido, Pedido p){
        for(int i = 0; i<p.getPratos().size();i++){
            modeloPedido.addElement((p.getPratos().get(i).getNome()
                    + " ------- " + p.getPratos().get(i).getValor()));
        }
        
    }
    public double totalCompra(Pedido p){
        double totalCompra = 0;
         for(int i = 0; i<p.getPratos().size();i++){
                 totalCompra = totalCompra + p.getPratos().get(i).getValor();
         }
         return totalCompra;
    }
    public void insereCartao(Pedido p){
        TelaCartao TelaCartao = new TelaCartao(p);
        TelaCartao.setVisible(true);
        TelaPagamento.setVisible(false);
    }
    public void inicio(Pedido p){
        TelaInicial TelaInicial = new TelaInicial(p);
        TelaInicial.setVisible(true);
        TelaPagamento.setVisible(false);
    }
}
