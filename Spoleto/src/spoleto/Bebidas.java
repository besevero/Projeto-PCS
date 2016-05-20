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
    
    
    
    
    ArrayList<Produto> bebid = new ArrayList();
    public Bebidas(String nome, float valor) {
        super(nome, valor);
        
        bebid.add(new Produto ("mate", 3.50));
        bebid.add(new Produto ("suco de uva", 5.00));
        bebid.add(new Produto ("suco de laranja", 5.00));
        bebid.add(new Produto ("refrigerante", 4.50));
        bebid.add(new Produto ("ice tea", 4.50));
        
        
    }
    //teste para o github
    //nov teste
    @Override
    public double getValor() {
        return super.getValor(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
    

