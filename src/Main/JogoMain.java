package Main;

import java.util.Scanner;
import java.util.ArrayList;

public class JogoMain {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int[] meuArray;
        //ALOCA MEMÓRIA PARA 7 INTEIROS
        meuArray = new int[8];

        //INICIALIZA O PRIMEIRO ELEMENTO
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 5;
        meuArray[5] = 6;
        meuArray[6] = 7;
        meuArray[7] = 8;

        //System.out.println(" Coloque a sequencia de Numeros na Ordem Correta:\n"+meuArray[0]+" --- "+meuArray[1] +"");

        //Sequencia de numeros para o usuario visualizar
        System.out.println("Coloque a sequencia de Numeros na Ordem Correta: \n "+meuArray[0]+" ---  " +meuArray[2] + " \n " +meuArray[3]+"   "  +meuArray[4]+  "  "+meuArray [5]+"\n "+meuArray[7]+"   "  +meuArray[6] +"  "+meuArray[1]);

        System.out.println("Digite 1 Para SIM ou 2 PARA Não Para Mover a Posição dos Numeros");

        System.out.println("\nDeseja Mover o Numero 2 para a posição B ?");
        int escolha = ler.nextInt();

        if (escolha == 1) {
            System.out.println("Escolha certa, posição do Numero 2 Alterada \n "+meuArray[0]+"   "+meuArray[1] +"  "+meuArray[2] +"\n "+meuArray[3]+"   "  +meuArray[4]+  "  " +meuArray [5]+"\n "+meuArray[7]+"   " +meuArray[6]);


        }  else {
            System.out.println("Escolha Errada, Por Favor Tente Novamente ");

        }

        System.out.println("Deseja Mover o Numero  7 para a posição G ? \n Escolha 1 para Sim ou 2 Para Não");
        int escolha2 = ler.nextInt();

        if (escolha2 == 1) {
            System.out.println("Escolha certa, posição do numero Alterada  \n"+meuArray[0]+"   "+meuArray[1] +"   " +meuArray[2] +"\n "+meuArray[3]+"   "  +meuArray[4]+  "  " +meuArray [5]+"\n "+meuArray[6]+"   " +meuArray[7]);

        }  else {
            System.out.println("Escolha errada, Tente novamente");

        }

        if (escolha2 == 1) {
            System.out.printf("Parabéns Você Ganhou \n "+meuArray[0]+"   "+meuArray[1] +"  "+meuArray[2] +"\n "+meuArray[3]+"   "  +meuArray[4]+  "  " +meuArray [5]+"\n "+meuArray[6]+"   " +meuArray[7]);
        }

    }

}