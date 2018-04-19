/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author gustavo.mcalixto
 */
public class Departamento extends Loja {

    private String tipoProduto;

    public Departamento(String tipoProduto, String nomeLoja, String local) {
        super(nomeLoja, local);
        this.tipoProduto = tipoProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
    
    
    
    @Override
    public void getInfo() {
        System.out.println("Dados Dpto: " + this.nomeLoja + " " + this.getLocal()+ " " + this.tipoProduto);
    }

    @Override
    public void getNomeLoja() {
        System.out.println("Nome Loja: " + this.nomeLoja);
    }
    
}
