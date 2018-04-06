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
public class PrimeiraAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Retangulo r1 = new Retangulo();
        
        r1.setLadoA(0);
        r1.setLadoB(5);
        
        
        
        System.out.println("Lado A: " + r1.getLadoA());
        System.out.println("Lado B: " + r1.getLadoB());
        System.out.println("Retangulo?: " + r1.isRetangulo());
        
        if(r1.isRetangulo()){
            System.out.println("Quadrado?: " + r1.isQuadrado());
            System.out.println("Area: " + r1.getArea());
            System.out.println("Perimentro: " + r1.getPerimetro());
        }        
        
        
        
        
    }
    
}
