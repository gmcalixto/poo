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
public class Resistor extends Componente {
    
    private Integer valor;

    public Resistor(Integer valor, String id) {
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
       return "Resistor ID: " + super.getId() + " Valor: " + this.getValor();
    }
    
    
    
}
