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
public class Supermercado extends Loja {

    private Integer numPrateleiras;
    private final List<ILoja> lojas = new ArrayList<ILoja>();

    public List<ILoja> getLojas() {
        return lojas;
    }
    
    public Supermercado(Integer numPrateleiras, String nomeLoja, String local) {
        super(nomeLoja, local);
        this.numPrateleiras = numPrateleiras;
    }

    
    public Integer getNumPrateleiras() {
        return numPrateleiras;
    }

    public void setNumPrateleiras(Integer numPrateleiras) {
        this.numPrateleiras = numPrateleiras;
    }
    
    
    
    @Override
    public void getInfo() {
        System.out.println("Dados Supermercado: " + this.getNomeLj() + " " + " " + this.getLocal() + this.numPrateleiras);
        
        for (ILoja loja : lojas) {
            loja.getInfo();
        }
    }

    @Override
    public void getNomeLoja() {
        System.out.println("Nome Loja: " + this.nomeLoja);
    }
    
    
}
