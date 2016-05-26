/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaInicial;
import View.TelaMassas;
import View.TelaPromo;

/**
 *
 * @author Bernardo
 */
public class ControleInicial{
    
    private Pedido pedido;
    private TelaInicial inicial;
    private TelaPromo promo = new TelaPromo(pedido);
    
            
    public ControleInicial(Pedido pedido, TelaInicial inicial){
        this.pedido = pedido;
        this.inicial = inicial;
    }
    
/*    public static void iniciaTela() {
                Pedido p = new Pedido(1);
                new TelaInicial(p).setVisible(true);
    }*/
    public void iniciaPromo(Pedido p, TelaInicial inicial, TelaPromo promo){
        inicial.setVisible(false);
        promo.setVisible(true);
    }
   /* public void iniciaMassa(Pedido p, TelaInicial inicial, TelaMassas massa){
        inicial.setVisible(false);
        massa.setVisible(true);
    }*/

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public TelaInicial getInicial() {
        return inicial;
    }
    public void setInicial(TelaInicial inicial) {
        this.inicial = inicial;
    }

    public TelaPromo getPromo() {
        return promo;
    }

    public void setPromo(TelaPromo promo) {
        this.promo = promo;
    }
}
