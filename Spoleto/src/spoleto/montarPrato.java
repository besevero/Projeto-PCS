/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoleto;


public class montarPrato {
    
    private Produto_Massa m;
    private Produto_Ingrediente[] ingr;
    private Molho mol;
    private Produto_Extra prodex;
    private boolean addprodex;
    private boolean addingredExtra;
    private double custo=0.0;
    public montarPrato(Produto_Massa m, Produto_Ingrediente[] ingr, Molho mol, Produto_Extra prodex, boolean addprodex, boolean addingredExtra) {
        this.m = m;
        this.ingr = ingr;
        this.mol = mol;
        this.prodex = prodex;
        this.addprodex = addprodex;
        this.addingredExtra = addingredExtra;
        ingr= new Produto_Ingrediente [8];
    }
    
    double acrescentaIngrdExtra(Produto_Massa m){
        Produto_Ingrediente[] ingrExtra;
        
        if( addingredExtra==true){
         ingrExtra= new Produto_Ingrediente[4];
         
         custo= m.getValor()+ 6.00;
        }
        else {
            custo= m.getValor();
        }
        return custo;
}
    
        
    
    double acrescentaprodutoExtra(Produto_Extra p){
       
        if( addprodex==true){
         custo= custo + p.getValor();
        }
        return custo;
}
}
