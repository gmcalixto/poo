/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetohardware;
import java.util.*;

/**
 *
 * @author gustavo.mcalixto
 */
public class Placa extends Componente{

    private String tipoPlaca;
    private final List<IComponente> componentes = new ArrayList<IComponente>();

    public Placa(String tipoPlaca, String id) {
        super(id);
        this.tipoPlaca = tipoPlaca;
    }

    public List<IComponente> getComponentes() {
        return componentes;
    }

    
    public String getTipoPlaca() {
        return tipoPlaca;
    }

    public void setTipoPlaca(String tipoPlaca) {
        this.tipoPlaca = tipoPlaca;
    }
    
    
    
    @Override
    public String getInfo() {
        String msg = "Placa ID: " + super.getId() + " Tipo: " + this.getTipoPlaca();
        
        for (IComponente componente : componentes) {
            msg += "\n" + componente.getInfo();
        }
        
        return msg;
    }
    
}
