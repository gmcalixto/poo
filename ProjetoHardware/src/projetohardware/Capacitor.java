/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohardware;

/**
 *
 * @author gustavo.mcalixto
 */
public class Capacitor extends Componente{

    
    private Integer valor;

    public Capacitor(Integer valor, String id) {
        super(id);
        this.valor = valor;
    }

    
    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }
    
    
    
    
    @Override
    public String getInfo() {
        return "Capacitor ID: " + super.getId() + " Valor: " + this.getValor();
    }
    
}
