/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author PPGI
 */
public class Pedido {
      private ArrayList<Produto> pratos = new ArrayList();
      private int senha;

    public Pedido(int senha) {
        this.senha = senha;
    }

   public Pedido(){}
   
    void incluirProdPed(Produto p){
            getPratos().add(p);
    }
        
    ArrayList<Produto> mostrarPedido(){
        return getPratos();
    }

    /**
     * @return the pratos
     */
    public ArrayList<Produto> getPratos() {
        return pratos;
    }

    /**
     * @param pratos the pratos to set
     */
    public void setPratos(ArrayList<Produto> pratos) {
        this.pratos = pratos;
    }

    /**
     * @return the senha
     */
    public int getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(int senha) {
        this.senha = senha;
    }

           
}
