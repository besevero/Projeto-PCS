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
    //private TelaMassas TelaMassa = new TelaMassas(pedido);
    
    
            
    public ControleInicial(Pedido pedido, TelaInicial inicial){
        this.pedido = pedido;
        this.inicial = inicial;
    }
    public void iniciaPromo(Pedido p){
        TelaPromo promo = new TelaPromo(p);
        inicial.setVisible(false);
        promo.setVisible(true);
    }
    public void telaMassa(Pedido p){
        TelaMassas TelaMassa = new TelaMassas(p);
        inicial.setVisible(false);
        TelaMassa.setVisible(true);
    }
  
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
}
