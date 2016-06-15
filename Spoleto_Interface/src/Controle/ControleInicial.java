/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaFavorito;
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

    public ControleInicial(TelaInicial inicial){
        this.pedido = new Pedido();
        this.inicial = inicial;
    }
    public void iniciaPromo(){
        TelaPromo promo = new TelaPromo(pedido);
        inicial.setVisible(false);
        promo.setVisible(true);
    }
    public void telaMassa(){
        TelaMassas TelaMassa = new TelaMassas(pedido);
        inicial.setVisible(false);
        TelaMassa.setVisible(true);
    }
     public void telaFavorito(){
        TelaFavorito TelaFavorito = new TelaFavorito(pedido);
        inicial.setVisible(false);
        TelaFavorito.setVisible(true);
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
