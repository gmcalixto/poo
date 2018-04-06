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
public class Triangulo {
    
    //atributos
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public Triangulo() {
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    
    
    public boolean isTriangulo(){
        return ((this.ladoA + this.ladoB) > this.ladoC) && ((this.ladoB + this.ladoC) > this.ladoA) && ((this.ladoA + this.ladoC) > this.ladoB);
    }
    
    public boolean isEquilatero(){
        return this.isTriangulo() && ((this.ladoA == this.ladoB) && (this.ladoB == this.ladoC));
    }
    
    public boolean isEscaleno(){
        return this.isTriangulo() && ((this.ladoA != this.ladoB) && (this.ladoB != this.ladoC) && (this.ladoA != this.ladoC));
    }
    
    public boolean isIsosceles(){
        return !this.isEscaleno() && !this.isEquilatero();
    }
    
    public double getPerimetro(){
        return this.ladoA + this.ladoB + this.ladoC;
    }
    
    public double getArea(){
        double p = this.getPerimetro()/2;
        return Math.sqrt(p*(p-this.ladoA)*(p-this.ladoB)*(p-this.ladoC));
    }
}
