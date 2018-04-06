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
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Circunferencia c = new Circunferencia(5, "circ1");
        
        if(c.isPoligono()){
            System.out.println("Raio: " + c.getRaio());
            System.out.println("ID: " + c.getId());
            System.out.println("Area: " + c.getArea());
            System.out.println("Perimetro: " + c.getPerimetro());
        }
 
    }
}