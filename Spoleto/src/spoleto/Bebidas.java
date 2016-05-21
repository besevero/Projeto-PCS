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
public class Bebidas extends Produto{
    
    
    
    
    ArrayList<Produto> idBebida = new ArrayList();
    public Bebidas(String nome, float valor,int quantidade) {
        super(nome, valor, quantidade);
        
        idBebida.add(new Produto ("mate", 3.50, 20));
        idBebida.add(new Produto ("suco de uva", 5.00, 20));
        idBebida.add(new Produto ("suco de laranja", 5.00, 20));
        idBebida.add(new Produto ("refrigerante", 4.50, 20));
        idBebida.add(new Produto ("ice tea", 4.50, 20));
        
        
    }
 
    @Override
    public double getValor() {
        return super.getValor(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
    

