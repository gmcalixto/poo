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
public class Projeto {
    private String nome;
    private String dataInicio;
    private final List<IComponente> componentes = new ArrayList<IComponente>();

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public List<IComponente> getComponentes() {
        return componentes;
    }
    
    public String getInfoPlaca() {
        String msg = "Nome do Projeto: " + this.getNome() + " Data: " + this.getDataInicio();
        
        for (IComponente componente : componentes) {
            msg += "\n" + componente.getInfo();
        }
        
        return msg;
    }
    
}
