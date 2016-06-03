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
     private Prato_Promocao pratos = new Prato_Promocao();
     
     public ControlePromo(TelaPromo promo){
         this.pedido = new Pedido(0);
         this.promo = promo;
     }
     public void iniciaBebida(){
        TelaBebidas bebidas = new TelaBebidas(pedido);
        promo.setVisible(false);
        bebidas.setVisible(true);
    }
     public void inicial(){
        TelaInicial TelaInicial = new TelaInicial(pedido);
        promo.setVisible(false);
        TelaInicial.setVisible(true);
     }
     public void proximo(String escolha){
         for(int i=0; i<pratos.getPromoc().size() ; i++)
            if(pratos.getPromoc().get(i).getNome().equals(escolha)){
                pedido.getPratos().add(pratos.getPromoc().get(i));
            }
         this.iniciaBebida();
     }
     public void voltarPromo(){
         if((pedido.getPratos().size())%2 != 0){
           pedido.getPratos().remove((pedido.getPratos().size()-1));
       }
         
         this.inicial();
     }
      public String selecao(int i){
         return pratos.getPromoc().get(i).getNome();
     }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    public TelaPromo getPromo() {
        return promo;
    }

    public void setPromo(TelaPromo promo) {
        this.promo = promo;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }

    public Prato_Promocao getPratos() {
        return pratos;
    }
    public void setPratos(Prato_Promocao pratos) {
        this.pratos = pratos;
    }
}
