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
public class Molho extends Produto{
    
     private ArrayList<Produto> molho = new ArrayList();
    
     public Molho(){        
        molho.add(new Produto ("bolonhesa", 0.00, 30));
        molho.add(new Produto ("4 queijos", 0.00, 30));
        molho.add(new Produto ("sugo", 0.00, 30));
        molho.add(new Produto ("funghi", 0.00,30));
        molho.add(new Produto ("branco", 0.00, 30));
     }
    public Molho(String nome, float valor, int quantidade) {
        super(nome, valor, quantidade);
        

    }

    /**
     * @return the molho
     */
    public ArrayList<Produto> getMolho() {
        return molho;
    }

    /**
     * @param molho the molho to set
     */
    public void setMolho(ArrayList<Produto> molho) {
        this.molho = molho;
    }
    
}
