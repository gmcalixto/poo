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
public class ExemploInterface {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Sala s = new Sala();
        
        s.adicionarEquipamento(new TV("LG", "24"));
        s.adicionarEquipamento(new PC("dell"));
        s.adicionarEquipamento(new TV("CCE", "13"));
        s.adicionarEquipamento(new PC("positivo"));
        
        s.mostrarEquipamentos();
        s.ligarEquipamentos();
        s.desligarEquipamentos();
        
        
        
    }
    
}
