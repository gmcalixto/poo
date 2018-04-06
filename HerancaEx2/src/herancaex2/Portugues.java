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
public class Portugues extends Lingua{
    @Override
    public String sayHello() {
        return "Olá";
    }

    @Override
    public String sayYes() {
        return "Sim!!!";
    }

    @Override
    public String sayNo() {
        return "Não!!!!";
    }

    @Override
    public String sayGoodBye() {
        return "Adeus!!!";
    }
}
