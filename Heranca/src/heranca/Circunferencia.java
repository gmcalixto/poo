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
public class Circunferencia extends Poligono {
    
    public double raio;

    public Circunferencia(double raio, String id) {
        super(id);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double getArea() {
        return Math.PI*Math.pow(this.raio,2);
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*this.raio;
    }

    @Override
    public boolean isPoligono() {
        return this.raio > 0;
    }
    
    
    
    
    
}
