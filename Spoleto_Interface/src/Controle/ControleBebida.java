/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Bebida;
import Model.Pedido;
import Model.Produto;
import View.TelaBebidas;
import View.TelaPedido;
import View.TelaPromo;
import java.util.ArrayList;

/**
 *
 * @author Bernardo
 */
public class ControleBebida {
     private Pedido pedido;
     private TelaBebidas TelaBebidas;
     private TelaPedido TelaPedidos = new TelaPedido(pedido);
     private ArrayList<Produto> produtos = new ArrayList();
     private Bebida bebida = new Bebida("Mate", 1, 1, produtos);
     
     public ControleBebida(Pedido pedido, TelaBebidas TelaBebidas){
         this.pedido = pedido;
         this.TelaBebidas = TelaBebidas;
     }
     
     public void iniciaPedido(Pedido p, TelaBebidas bebida){
        TelaPedido TelaPedido = new TelaPedido(p);
        bebida.setVisible(false);
        TelaPedido.setVisible(true);
     }
     public void iniciaPromocao(Pedido p, TelaBebidas bebida){
        TelaPromo TelaPromo = new TelaPromo(p);
        bebida.setVisible(false);
        TelaPromo.setVisible(true);
     }
     public void proximoBebida(String escolha){
            for(int i=0; i<bebida.getIdBebida().size(); i++){
                if(bebida.getIdBebida().get(i).getNome().equals(escolha)){
                    pedido.getPratos().add(bebida.getIdBebida().get(i));
                }
            }
            this.iniciaPedido(pedido, TelaBebidas);
     }
     public void voltaBebida(){
         pedido.getPratos().remove((pedido.getPratos().size()-1));
         this.iniciaPromocao(pedido, TelaBebidas);
     }
     public String selecao(int i){
         return bebida.getIdBebida().get(i).getNome();
     }
}
