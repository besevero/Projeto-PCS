/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Molho;
import Model.Pedido;
import View.TelaBebidas;
import View.TelaExtras;
import View.TelaInicial;
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
             this.pedido = new Pedido();
             this.TelaMolhos = TelaMolhos;
                     
         }
         public void iniciaBebida(){
            TelaBebidas TelaBebidas = new TelaBebidas(pedido);
            TelaBebidas.setVisible(true);
            TelaMolhos.setVisible(false);
         }
         public void proximo(String escolha){
            for(int i=0; i<molho.getMolho().size() ; i++)
            if(molho.getMolho().get(i).getNome().equals(escolha)){
                pedido.getPratos().add(molho.getMolho().get(i));
            }
         this.iniciaBebida();
         }
        public void inicial(){
            TelaInicial TelaInicial = new TelaInicial(pedido);
            TelaMolhos.setVisible(false);
            TelaInicial.setVisible(true);
        }
        public void voltar(){
                if((pedido.getPratos().size())%2 != 0){
                    pedido.getPratos().remove((pedido.getPratos().size()-1));
                }
                TelaExtras TelaExtras = new TelaExtras(pedido);
                TelaExtras.setVisible(true);
                TelaMolhos.setVisible(false);
            }
        public void apagaPedido(){
             pedido.getPratos().clear();
        }
        public void cancelar(){
          apagaPedido();
          inicial();
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
