/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import View.TelaInicial;
import View.TelaNotaFiscal;
/**
 *
 * @author Bernardo
 */
public class ControleTelaNotaFiscal {
    private Pedido pedido;
    private TelaNotaFiscal TelaNotaFiscal;
    
    public ControleTelaNotaFiscal(TelaNotaFiscal TelaNotaFiscal){
        this.pedido = new Pedido();
        this.TelaNotaFiscal = TelaNotaFiscal;
    }
    public void finalizar(){
        TelaInicial TelaInicial = new TelaInicial(pedido);
        TelaNotaFiscal.setVisible(false);
        TelaInicial.setVisible(true);
        
        pedido.incrementaSenha();
        pedido.getPratos().clear();
        
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
     * @return the TelaNotaFiscal
     */
    public TelaNotaFiscal getTelaNotaFiscal() {
        return TelaNotaFiscal;
    }

    /**
     * @param TelaNotaFiscal the TelaNotaFiscal to set
     */
    public void setTelaNotaFiscal(TelaNotaFiscal TelaNotaFiscal) {
        this.TelaNotaFiscal = TelaNotaFiscal;
    }
    
    
    
}
