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
public class Produto_Extra extends Produto{
    
    
    private ArrayList<Produto> prodExtra = new ArrayList();
    public Produto_Extra(){       
        prodExtra.add(new Produto ("Almôndega", 6.00, 35));
        prodExtra.add(new Produto ("Frango à Parmegiana", 7.00, 35));
        prodExtra.add(new Produto ("Frango Dourado", 5.00, 35));
        prodExtra.add(new Produto ("Peito de Peru", 4.00, 35));
        prodExtra.add(new Produto ("Polpetone", 8.00, 35));
    }
    public Produto_Extra(String nome, float valor, int quantidade) {
        super(nome, valor, quantidade);
        

    }

    /**
     * @return the prodExtra
     */
    public ArrayList<Produto> getProdExtra() {
        return prodExtra;
    }

    /**
     * @param prodExtra the prodExtra to set
     */
    public void setProdExtra(ArrayList<Produto> prodExtra) {
        this.prodExtra = prodExtra;
    }
    
}
