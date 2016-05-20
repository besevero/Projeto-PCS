/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spoleto;

/**
 *
 * @author PPGI
 */
public class Venda {
    private double valor_venda;
    private String campeao_venda;
    

    public Venda(double valor_venda, String campeao_venda) {
        this.valor_venda = valor_venda;
        this.campeao_venda = campeao_venda;
    }

    public String getCampeao_venda() {
        return campeao_venda;
    }

    public void setCampeao_venda(String campeao_venda) {
        this.campeao_venda = campeao_venda;
    }

    public void setValor_venda(double valor_venda) {
        this.valor_venda = valor_venda;
    }
    
    
    
    
}
