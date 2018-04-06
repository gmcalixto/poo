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
public class PC implements Interruptor {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PC(String nome) {
        this.nome = nome;
    }
    
    
    @Override
    public void liga() {
        System.out.println(this.nome + " ligado");
    }

    @Override
    public void desliga() {
        System.out.println(this.nome + " desligado");
    }

    @Override
    public void show() {
        System.out.println("PC " + this.nome);
    }
    
}
