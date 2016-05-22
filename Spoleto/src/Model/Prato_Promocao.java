/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;


public class Prato_Promocao extends Produto{
    
     ArrayList<Produto> promoc = new ArrayList();

    public Prato_Promocao(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
        
        promoc.add(new Produto ("Penne a Carbonara", 15.00, 30));
        promoc.add(new Produto ("Spaghetti alho e oleo", 15.00, 30));
    }
    
     
}
