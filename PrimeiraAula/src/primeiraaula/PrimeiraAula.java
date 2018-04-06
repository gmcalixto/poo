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
        
        Triangulo t1 = new Triangulo();
        
        t1.setLadoA(2);
        t1.setLadoB(2);
        t1.setLadoC(2*Math.sqrt(2));
        
        System.out.println("Triangulo: " + t1.isTriangulo());
        System.out.println("Equilatero: " + t1.isEquilatero());
        System.out.println("Escaleno: " + t1.isEscaleno());
        System.out.println("Isosceles: " + t1.isIsosceles());
        System.out.println("Perimetro " + t1.getPerimetro());
        System.out.println("Area " + t1.getArea());
        
        
        
        
        //Retangulo r1 = new Retangulo();
        //Retangulo r1 = new Retangulo(3, 3);
        
        //r1.setLadoA(2);
        //r1.setLadoB(5);
        
        
        /*
        System.out.println("Lado A: " + r1.getLadoA());
        System.out.println("Lado B: " + r1.getLadoB());
        System.out.println("Retangulo?: " + r1.isRetangulo());
        
        if(r1.isRetangulo()){
            System.out.println("Quadrado?: " + r1.isQuadrado());
            System.out.println("Area: " + r1.getArea());
            System.out.println("Perimentro: " + r1.getPerimetro());
        }        
        
        */
        
        
    }
    
}
