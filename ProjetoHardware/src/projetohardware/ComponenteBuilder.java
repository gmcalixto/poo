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
public final class ComponenteBuilder {
    
    private ComponenteBuilder(){
    }
    
    public static Placa geraPlaca(String tipoPlaca, String id){
        return new Placa(tipoPlaca,id);
    }
    
    public static Resistor geraResistor(Integer valor, String id){
        return new Resistor(valor,id);
    }
    
    public static Indutor geraIndutor(Integer valor, String id){
        return new Indutor(valor,id);
    }
    
    public static Capacitor geraCapacitor(Integer valor, String id){
        return new Capacitor(valor,id);
    }
    
    public static Chipset geraChipset(String tipo, String id){
        return new Chipset(tipo,id);
    }
    
    public static Memoria geraMemoria(Integer tamanho, String id){
        return new Memoria(tamanho,id);
    }
    
}
