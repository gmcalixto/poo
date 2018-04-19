/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

//meucomentario

package composite;

/**
 *
 * @author gustavo.mcalixto
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Shopping s = new Shopping("SPMarket");
        
        s.getLojas().add(new Restaurante("fastfood", "KFC", "praca alimentação"));
        s.getLojas().add(new Restaurante("comida caseira", "Divino Fogão", "praca alimentacao"));
        s.getLojas().add(new Departamento("roupas","Renner","bloco A"));
        
        Supermercado sp  = new Supermercado(40, "RICOY", "SPMarket");
        sp.getLojas().add(new Restaurante("fastfood", "Subway", "ricoy"));
        sp.getLojas().add(new Departamento("eletronico", "Games", "ricoy"));
        
        s.getLojas().add(sp);
        
        s.mostrarLojas();
        
        
        
    }
    
}
