/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoleto;


public class Montar_Prato extends Produto{
    
    private Produto_Massa massa;
    private Produto_Ingrediente[] ingrediente;
    private Molho molho;
    private Produto_Extra produtoExtra;
    private boolean adProdutoExtra;
    private boolean adIngredienteExtra;
    private double custo=0.0;
    
    public Montar_Prato(Produto_Massa m, Produto_Ingrediente[] ingr, Molho mol, 
                        Produto_Extra prodEx, boolean adProdEx, boolean adIngredExtra, 
                        String nome, double valor, int qtde) {
        super(nome, valor, qtde);
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
       
        custo= m.getValor();
        
        if(adIngredienteExtra == true){
            for (int i=0; i<4; i++){ 
                ingrExtra= new Produto_Ingrediente[4];
                ingrExtra[i].getNome();
        
                if (ingrExtra[i].getQuantidade()>0){
                    quantidade--;
                }
            }
      
           custo= m.getValor()+ 6.00;
        }  
        
        return custo;

    }
    
    double acrescentaprodutoExtra(Produto_Extra p){
       
        if(adIngredienteExtra == true){
            p.getNome();
         
            if(p.getQuantidade()>0){
                custo = custo + p.getValor();
                quantidade--;
            }
        }
        
        return custo;
    }
}
