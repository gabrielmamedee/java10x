package NivelFacil.Condicoes;

import java.util.Scanner;

public class EstudoSwitchCases {
    public static void main(String[] args) {

        /*
        * SwitchCase: Que servem para gerar casos especificos
        * Objetivo: Pedir pro usuario escolher entre os Ninjas
        * switchCase
        * */

        Scanner sc = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruna");

        int escolhaDoUsuario = sc.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Você escolheu Naruto Uzumaki");
                break;
            case 2:
                System.out.println("Você escolheu Sasuke Uchiha");
                break;
            case 3:
                System.out.println("Você escolheu Sakura Haruna");
                break;
            default:
                System.out.println("Opção invalida");
        }

        sc.close();
    }
}
