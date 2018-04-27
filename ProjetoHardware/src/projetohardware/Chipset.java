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
public class Chipset extends Componente {
    private String tipo;

    public Chipset(String tipo, String id) {
        super(id);
        this.tipo = tipo;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getInfo() {
       return "Chipset ID: " + super.getId() + " Tipo: " + this.getTipo();
    }
    
    
}
