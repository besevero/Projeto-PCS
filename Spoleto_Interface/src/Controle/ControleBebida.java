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
     private Bebida bebida = new Bebida();
     
     public ControleBebida(TelaBebidas TelaBebidas){
         this.pedido = new Pedido();
         this.TelaBebidas = TelaBebidas;
     }
     
     public void iniciaPedido(){
        TelaPedido TelaPedido = new TelaPedido(getPedido());
        getTelaBebidas().setVisible(false);
        TelaPedido.setVisible(true);
     }
     public void iniciaPromocao(){
        TelaPromo TelaPromo = new TelaPromo(getPedido());
        getTelaBebidas().setVisible(false);
        TelaPromo.setVisible(true);
     }
     public void proximoBebida(String escolha){
            for(int i=0; i<getBebida().getIdBebida().size(); i++){
                if(getBebida().getIdBebida().get(i).getNome().equals(escolha)){
                    getPedido().getPratos().add(getBebida().getIdBebida().get(i));
                    
                }
                
            }
            this.iniciaPedido();
     }
     public void voltaBebida(){
         getPedido().getPratos().remove((getPedido().getPratos().size()-1));
         this.iniciaPromocao();
     }
     public String selecao(int i){
         return getBebida().getIdBebida().get(i).getNome();
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
     * @return the TelaBebidas
     */
    public TelaBebidas getTelaBebidas() {
        return TelaBebidas;
    }

    /**
     * @param TelaBebidas the TelaBebidas to set
     */
    public void setTelaBebidas(TelaBebidas TelaBebidas) {
        this.TelaBebidas = TelaBebidas;
    }

    /**
     * @return the produtos
     */
    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    /**
     * @param produtos the produtos to set
     */
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    /**
     * @return the bebida
     */
    public Bebida getBebida() {
        return bebida;
    }

    /**
     * @param bebida the bebida to set
     */
    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }
}

