/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herancaex2;

import java.util.Scanner;

/**
 *
 * @author gustavo.mcalixto
 */
public class HerancaEx2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Escolha uma lingua:");
        System.out.println("1- Espanhol 2-Ingles 3-Portugues");
        System.out.print("Opcao:");

        Scanner s = new Scanner(System.in);
        Integer respostaLingua = s.nextInt();

        System.out.println("Escolha uma mensagem:");
        System.out.println("1- Ola 2-Sim 3-Não 4-Adeus");
        System.out.print("Opcao:");

        Integer respostaMensagem = s.nextInt();

        switch (respostaLingua) {
            case 1:
                switch (respostaMensagem) {
                    case 1:
                        System.out.println(new Espanhol().sayHello());
                        break;
                    case 2:
                        System.out.println(new Espanhol().sayYes());
                        break;
                    case 3:
                        System.out.println(new Espanhol().sayNo());
                        break;
                    case 4:
                        System.out.println(new Espanhol().sayGoodBye());
                        break;
                }
                break;
            case 2:
                switch (respostaMensagem) {
                    case 1:
                        System.out.println(new Ingles().sayHello());
                        break;
                    case 2:
                        System.out.println(new Ingles().sayYes());
                        break;
                    case 3:
                        System.out.println(new Ingles().sayNo());
                        break;
                    case 4:
                        System.out.println(new Ingles().sayGoodBye());
                        break;
                }
                break;

            case 3:
                switch (respostaMensagem) {
                    case 1:
                        System.out.println(new Portugues().sayHello());
                        break;
                    case 2:
                        System.out.println(new Portugues().sayYes());
                        break;
                    case 3:
                        System.out.println(new Portugues().sayNo());
                        break;
                    case 4:
                        System.out.println(new Portugues().sayGoodBye());
                        break;
                }
                break;
        }
    }
}
