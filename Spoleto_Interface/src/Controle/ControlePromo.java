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
     private ArrayList<Produto> produtos = new ArrayList();
     private Prato_Promocao pratos = new Prato_Promocao("Mate", 3, 3, produtos);
     
     public ControlePromo(Pedido pedido, TelaPromo promo){
         this.pedido = pedido;
         this.promo = promo;
     }
     public void iniciaBebida(Pedido p){
        TelaBebidas bebidas = new TelaBebidas(p);
        promo.setVisible(false);
        bebidas.setVisible(true);
    }
     public void inicial(Pedido p){
        TelaInicial TelaInicial = new TelaInicial(p);
        promo.setVisible(false);
        TelaInicial.setVisible(true);
     }
     public void proximo(String escolha, Pedido p){
         for(int i=0; i<pratos.getPromoc().size() ; i++)
            if(pratos.getPromoc().get(i).getNome().equals(escolha)){
                p.getPratos().add(pratos.getPromoc().get(i));
            }
         this.iniciaBebida(p);
     }
     public void voltarPromo(Pedido p){
         if((p.getPratos().size())%2 != 0){
           p.getPratos().remove((p.getPratos().size()-1));
       }
         
         this.inicial(p);
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
