/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaex2;

/**
 *
 * @author gustavo.mcalixto
 */
public class Espanhol extends Lingua {
    @Override
    public String sayHello() {
        return "Hola!";
    }

    @Override
    public String sayYes() {
        return "Si!";
    }

    @Override
    public String sayNo() {
        return "No!";
    }

    @Override
    public String sayGoodBye() {
        return "Adios!";
    }
}
