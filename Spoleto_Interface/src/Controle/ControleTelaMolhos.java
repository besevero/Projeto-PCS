/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Molho;
import Model.Pedido;
import View.TelaMolhos;

/**
 *
 * @author Bernardo
 */
public class ControleTelaMolhos {
         private Pedido pedido;
         private TelaMolhos TelaMolhos;
         private Molho molho = new Molho();
         
         
         public ControleTelaMolhos(TelaMolhos TelaMolhos){
             Pedido p = new Pedido();
             this.TelaMolhos = TelaMolhos;
                     
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
     * @return the TelaMolhos
     */
    public TelaMolhos getTelaMolhos() {
        return TelaMolhos;
    }

    /**
     * @param TelaMolhos the TelaMolhos to set
     */
    public void setTelaMolhos(TelaMolhos TelaMolhos) {
        this.TelaMolhos = TelaMolhos;
    }

    /**
     * @return the molho
     */
    public Molho getMolho() {
        return molho;
    }

    /**
     * @param molho the molho to set
     */
    public void setMolho(Molho molho) {
        this.molho = molho;
    }
}
