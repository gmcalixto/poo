/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;

import java.util.*;

/**
 *
 * @author gustavo.mcalixto
 */
public class Sala {
    
    //objeto nasce com lista zerada
    private List<Interruptor> equipamentos = new ArrayList<>();

    public List<Interruptor> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<Interruptor> equipamentos) {
        this.equipamentos = equipamentos;
    }
    
    public void mostrarEquipamentos(){
        for (Interruptor equipamento : equipamentos) {
            equipamento.show();
        }
    }
    
    public void adicionarEquipamento(Interruptor i){
        this.equipamentos.add(i);
    }
    
    public void ligarEquipamentos(){
        for (Interruptor equipamento : equipamentos) {
            equipamento.liga();
        }
    }
    
    public void desligarEquipamentos(){
        for (Interruptor equipamento : equipamentos) {
            equipamento.desliga();
        }
    }
    
    
}
