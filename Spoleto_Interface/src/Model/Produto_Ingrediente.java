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
public class Produto_Ingrediente extends Produto{
  
     ArrayList<Produto> ingrediente = new ArrayList();
    
     Produto_Ingrediente(){
        ingrediente.add(new Produto ("alcaparra", 0.00, 100));
        ingrediente.add(new Produto ("alho", 0.00, 100));
        ingrediente.add(new Produto ("alho poró", 0.00, 100));
        ingrediente.add(new Produto ("azeitona preta", 0.00, 100));
        ingrediente.add(new Produto ("bacon", 0.00, 100));
        ingrediente.add(new Produto ("brócolis", 0.00, 100));
        ingrediente.add(new Produto ("camarão", 0.00, 100));
        ingrediente.add(new Produto ("carne de sol", 0.00, 100));
        ingrediente.add(new Produto ("cenoura", 0.00, 100));
        ingrediente.add(new Produto ("champignon", 0.00, 100));
        ingrediente.add(new Produto ("cebola", 0.00, 100));
        ingrediente.add(new Produto ("ervilha", 0.00, 100));
        ingrediente.add(new Produto ("frango", 0.00, 100));
        ingrediente.add(new Produto ("gorgonzola", 0.00, 100));
        ingrediente.add(new Produto ("linguiça calabresa", 0.00, 100));
        ingrediente.add(new Produto ("milho", 0.00, 100));
        ingrediente.add(new Produto ("ovo de codorna", 0.00, 100));
        ingrediente.add(new Produto ("palmito", 0.00, 100));
        ingrediente.add(new Produto ("passas", 0.00, 100));
        ingrediente.add(new Produto ("peito de peru", 0.00, 100));
        ingrediente.add(new Produto ("queijo coalho", 0.00, 100));
        ingrediente.add(new Produto ("queijo minas", 0.00, 100));
        ingrediente.add(new Produto ("presunto", 0.00, 100));
        ingrediente.add(new Produto ("salmão", 0.00, 100));
        ingrediente.add(new Produto ("tomate", 0.00, 100));
        ingrediente.add(new Produto ("tomate seco", 0.00, 100));
    }
     
    public Produto_Ingrediente(String nome, float valor,
                               String Tipo_Ingrediente,int quantidade) {
        super(nome, valor, quantidade);
        
        
    }

    
    }
    
