/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author gustavo.mcalixto
 */
public abstract class Loja implements ILoja {
    protected String nomeLoja;
    private String local;

    public Loja(String nomeLoja, String local) {
        this.nomeLoja = nomeLoja;
        this.local = local;
    }

    
    public String getNomeLj() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
  
}
