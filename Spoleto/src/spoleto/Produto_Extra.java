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
public class Produto_Extra extends Produto{
    
    
    ArrayList<Produto> prodExtra = new ArrayList();
    
    public Produto_Extra(String nome, float valor, int quantidade) {
        super(nome, valor, quantidade);
        
        prodExtra.add(new Produto ("almondega", 6.00, 35));
        prodExtra.add(new Produto ("frango a parmegiana", 7.00, 35));
        prodExtra.add(new Produto ("frango dourado", 5.00, 35));
        prodExtra.add(new Produto ("peito de peru", 4.00, 35));
        prodExtra.add(new Produto ("polpetone de carne", 8.00, 35));
       
    }
    
}
