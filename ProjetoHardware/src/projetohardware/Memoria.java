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
public class Memoria extends Componente {
    private Integer tamanho;

    public Memoria(Integer tamanho, String id) {
        super(id);
        this.tamanho = tamanho;
    }

    
    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String getInfo() {
        return "Memoria ID: " + super.getId() + " Tamanho: " + this.getTamanho();
    }
    
    
          
}
