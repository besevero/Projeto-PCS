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
public class Bebida extends Produto{
    
    private ArrayList<Produto> idBebida = new ArrayList();
    
    public Bebida(String nome, float valor,int quantidade, ArrayList<Produto> idBebida) {
        super(nome, valor, quantidade);
        
        this.idBebida = idBebida;
        idBebida.add(new Produto ("Mate", 3.50, 20));
        idBebida.add(new Produto ("Suco de uva", 5.00, 20));
        idBebida.add(new Produto ("Suco de laranja", 5.00, 20));
        idBebida.add(new Produto ("Coca-cola", 4.50, 20));
        idBebida.add(new Produto ("Ice tea", 4.50, 20));
        
        
    }

    /**
     * @return the idBebida
     */
    public ArrayList<Produto> getIdBebida() {
        return idBebida;
    }

    /**
     * @param idBebida the idBebida to set
     */
    public void setIdBebida(ArrayList<Produto> idBebida) {
        this.idBebida = idBebida;
    }
    
    
    
}
    

