/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoleto;

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

   
        
    void incluirProdPed(Produto p){
            pratos.add(p);
    }
        
    ArrayList<Produto> mostrarPedido(){
        return pratos;
    }
        
}
