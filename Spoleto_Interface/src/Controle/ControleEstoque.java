/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

import Model.Pedido;
import Model.Produto;
import View.TelaBebidas;
import View.TelaEstoque;
import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class ControleEstoque {
    private Pedido pedido; 
    private TelaEstoque TelaEstoque;
    private ArrayList<Produto> produtos = new ArrayList();

    public ControleEstoque(Pedido pedido, TelaEstoque TelaEstoque) {
        this.pedido = pedido;
        this.TelaEstoque = TelaEstoque;
    }
     
  
    int visualizarEstoqueProduto(Produto p){
     
     return p.getQuantidade();
 }
 
    
    int acrescentarQtdeProduto ( Produto p, int quantidade){
        int novaQuantidade=0;
        novaQuantidade = p.getQuantidade() + quantidade;
        return novaQuantidade;
 
    }
    
    int diminuirEstoque (Produto p, int qtde){
        int novaQuantidade=0;
        novaQuantidade = p.getQuantidade() - qtde;
        return novaQuantidade;
    }
   
    void visualizarTodoEstoque(Produto[] p){
      for ( int i=0; i< p.length; i ++){
          System.out.println(p[i].getNome() + " " + p[i].getQuantidade());
      }
      
  }
}
