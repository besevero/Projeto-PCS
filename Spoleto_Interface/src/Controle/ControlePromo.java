/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Prato_Promocao;
import Model.Produto;
import java.util.ArrayList;
import View.TelaBebidas;
import View.TelaInicial;
import View.TelaPromo;

/**
 *
 * @author Bernardo
 */
public class ControlePromo{
     private Pedido pedido;
     private TelaPromo promo;
     private TelaBebidas bebidas = new TelaBebidas(pedido);
     private ArrayList<Produto> produtos = new ArrayList();
     private Prato_Promocao pratos = new Prato_Promocao("Mate", 3, 3, produtos);
     
     public ControlePromo(Pedido pedido, TelaPromo promo){
         this.pedido = pedido;
         this.promo = promo;
     }
     public void iniciaBebida(Pedido p, TelaPromo promo){
        TelaBebidas TelaBebida = new TelaBebidas(p);
         promo.setVisible(false);
        TelaBebida.setVisible(true);
    }
     public void inicial(Pedido p, TelaPromo promo){
        TelaInicial TelaInicial = new TelaInicial(p);
        promo.setVisible(false);
        TelaInicial.setVisible(true);
     }
     public void proximoPromo(String escolha){
         for(int i=0; i<pratos.getPromoc().size() ; i++)
            if(pratos.getPromoc().get(i).getNome().equals(escolha)){
                pedido.getPratos().add(pratos.getPromoc().get(i));
            }
         this.iniciaBebida(pedido, promo);
     }
     public void voltarPromo(){
         if((pedido.getPratos().size())%2 != 0){
           pedido.getPratos().remove((pedido.getPratos().size()-1));
       }
         this.inicial(pedido, promo);
     }
     
     public String selecao(int i){
         return pratos.getPromoc().get(i).getNome();
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
     * @return the promo
     */
    public TelaPromo getPromo() {
        return promo;
    }

    /**
     * @param promo the promo to set
     */
    public void setPromo(TelaPromo promo) {
        this.promo = promo;
    }

    /**
     * @return the bebidas
     */
    public TelaBebidas getBebidas() {
        return bebidas;
    }

    /**
     * @param bebidas the bebidas to set
     */
    public void setBebidas(TelaBebidas bebidas) {
        this.bebidas = bebidas;
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
     * @return the pratos
     */
    public Prato_Promocao getPratos() {
        return pratos;
    }

    /**
     * @param pratos the pratos to set
     */
    public void setPratos(Prato_Promocao pratos) {
        this.pratos = pratos;
    }
}
