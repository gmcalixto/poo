/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeiraaula;

/**
 *
 * @author gustavo.mcalixto
 */
public class Retangulo {
    
    //atributos
    private int ladoA;
    private int ladoB;
    
    //getters
    public int getLadoA(){
        return this.ladoA;
    }
    public int getLadoB(){
        return this.ladoB;
    }
    
    //setters
    public void setLadoA(int la){
        this.ladoA = la;
    }
    public void setLadoB(int lb){
        this.ladoB = lb;
    }
    
    //outros metodos
    public boolean isRetangulo(){
        return (this.ladoA > 0) && (this.ladoB > 0);
    }
    
    public boolean isQuadrado(){
        return (this.isRetangulo()) && (this.ladoA == this.ladoB);
    }
    
    public int getArea(){
        return this.ladoA * this.ladoB;
    }
    
    public int getPerimetro(){
        return 2*(this.ladoA + this.ladoB);
    }
}
