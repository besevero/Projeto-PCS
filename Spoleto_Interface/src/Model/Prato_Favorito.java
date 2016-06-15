/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;


public class Prato_Favorito extends Produto{
    
     private ArrayList<Produto> favorito = new ArrayList();

    public Prato_Favorito(String nome, double valor, int quantidade, ArrayList<Produto> promoc) {
        super(nome, valor, quantidade);
        this.favorito = favorito;
    
    }
    public Prato_Favorito(){    
        favorito.add(new Produto ("Lasanha", 25.00, 30));
        favorito.add(new Produto ("Penne a Matriciana", 25.00, 30));
    }
    /**
     * @return the favorito
     */
    public ArrayList<Produto> getFavorito() {
        return favorito;
    }

   
    public void setfavorito(ArrayList<Produto> favorito) {
        this.favorito = favorito;
    }
    
     
}
