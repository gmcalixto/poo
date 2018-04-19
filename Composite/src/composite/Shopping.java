/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.*;

/**
 *
 * @author gustavo.mcalixto
 */
public class Shopping {
    private String nome;
    private final List<ILoja> lojas = new ArrayList<ILoja>();

    public Shopping(String nome) {
        this.nome = nome;
    }
    
    public List<ILoja> getLojas() {
        return lojas;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
   
    public void mostrarLojas(){
        for (ILoja loja : lojas) {
            loja.getInfo();
        }
    }
    
}
