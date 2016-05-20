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
public class Produto_Massa extends Produto{

        ArrayList<Produto> massa = new ArrayList();
    public Produto_Massa(String nome, double valor) {
        super(nome, valor);
        
        massa.add(new Produto ("farfalle", 18.00));
        massa.add(new Produto ("fettuccine", 18.00));
        massa.add(new Produto ("spaghetti", 17.00));
        massa.add(new Produto ("penne", 17.00));
        massa.add(new Produto ("ravioli de queijo com presunto", 24.00));
        massa.add(new Produto ("ravioli de ricota", 22.00));
        massa.add(new Produto ("ravioli de tomate seco", 24.00));
        massa.add(new Produto ("ravioli de gorgonzola", 25.00));
        massa.add(new Produto ("gnocchi", 20.00));
        massa.add(new Produto ("cappelletti de carne", 20.00));
        massa.add(new Produto ("cappelleti de frango", 20.00));
        
    }
    
    
    
   
   
 
    
}
