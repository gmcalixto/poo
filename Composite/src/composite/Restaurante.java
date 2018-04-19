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
public class Restaurante extends Loja {

    private String tipoComida;

    public Restaurante(String tipoComida, String nomeLoja, String local) {
        super(nomeLoja, local);
        this.tipoComida = tipoComida;
    }

    
    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }
    
    
    
    @Override
    public void getInfo() {
        System.out.println("Dados Restaurante: " + this.nomeLoja + " " + this.getLocal()+ " " + this.tipoComida);
    }

    @Override
    public void getNomeLoja() {
        System.out.println("Nome Loja: " + this.nomeLoja);
    }
    
}
