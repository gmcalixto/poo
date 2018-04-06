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
public abstract class Poligono {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Poligono(String id) {
        this.id = id;
    }
   
    public abstract double getArea();
    public abstract double getPerimetro();
    public abstract boolean isPoligono();
}
