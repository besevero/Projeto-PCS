/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoleto;


public class Montar_Prato {
    
    private Produto_Massa massa;
    private Produto_Ingrediente[] ingrediente;
    private Molho molho;
    private Produto_Extra produtoExtra;
    private boolean adProdutoExtra;
    private boolean adIngredienteExtra;
    private double custo=0.0;
    
    public Montar_Prato(Produto_Massa m, Produto_Ingrediente[] ingr, Molho mol, Produto_Extra prodEx, boolean adProdEx, boolean adIngredExtra) {
        this.massa = m;
        this.ingrediente = ingr;
        this.molho = mol;
        this.produtoExtra = prodEx;
        this.adProdutoExtra = adProdEx;
        this.adIngredienteExtra = adIngredExtra;
        ingr = new Produto_Ingrediente [8];
    }
    
    double acrescentaIngrdExtra(Produto_Massa m){
        Produto_Ingrediente[] ingrExtra;
        
        if( adIngredienteExtra==true){
         ingrExtra= new Produto_Ingrediente[4];
         
         custo= m.getValor()+ 6.00;
        }
        else {
            custo= m.getValor();
        }
        return custo;
}
    
        
    
    double acrescentaprodutoExtra(Produto_Extra p){
       
        if( adProdutoExtra==true){
         custo= custo + p.getValor();
        }
        return custo;
}
}
