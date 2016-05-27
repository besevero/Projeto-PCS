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
     private ArrayList<Produto> produtos = new ArrayList();
     private Bebida bebida = new Bebida("Mate", 1, 1, produtos);
     
     public ControleBebida(Pedido pedido, TelaBebidas TelaBebidas){
         this.pedido = pedido;
         this.TelaBebidas = TelaBebidas;
     }
     
     public void iniciaPedido(Pedido p){
        TelaPedido TelaPedido = new TelaPedido(p);
        TelaBebidas.setVisible(false);
        TelaPedido.setVisible(true);
     }
     public void iniciaPromocao(Pedido p){
        TelaPromo TelaPromo = new TelaPromo(p);
        TelaBebidas.setVisible(false);
        TelaPromo.setVisible(true);
     }
     public void proximoBebida(String escolha, Pedido p){
            for(int i=0; i<bebida.getIdBebida().size(); i++){
                if(bebida.getIdBebida().get(i).getNome().equals(escolha)){
                    p.getPratos().add(bebida.getIdBebida().get(i));
                    
                }
                
            }
            this.iniciaPedido(p);
     }
     public void voltaBebida(Pedido p){
         p.getPratos().remove((p.getPratos().size()-1));
         this.iniciaPromocao(p);
     }
     public String selecao(int i){
         return bebida.getIdBebida().get(i).getNome();
     }
}

