/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplointerface;

/**
 *
 * @author gustavo.mcalixto
 */
public class TV implements Interruptor{
    
    private String nome;
    private String canal;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public TV(String nome, String canal) {
        this.nome = nome;
        this.canal = canal;
    }

    @Override
    public void liga() {
        System.out.println(this.nome + " ligado canal " + this.canal);
    }

    @Override
    public void desliga() {
        System.out.println(this.nome + " ligado canal " + this.canal);
    }

    @Override
    public void show() {
        System.out.println("TV " + this.nome);
    }
    
    
    
}
