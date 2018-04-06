/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author gustavo.mcalixto
 */
public class Retangulo extends Poligono {

    public double ladoA;
    public double ladoB;

    public Retangulo(double ladoA, double ladoB, String id) {
        super(id);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
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
    
    @Override
    public double getArea() {
        return this.ladoA*this.ladoB;
    }

    @Override
    public double getPerimetro() {
        return 2*(this.ladoA+this.ladoB);
    }

    @Override
    public boolean isPoligono() {
        return this.ladoA>0 && this.ladoB>0;
    }
    
    public boolean isQuadrado(){
        return this.isPoligono() && this.ladoA == this.ladoB;
    }
    
}
