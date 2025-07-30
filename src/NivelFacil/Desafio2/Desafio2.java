package NivelFacil.Desafio2;

import java.util.Scanner;

public class Desafio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int NUMERO_MAX = 10;
        Ninja[] ninjas = new Ninja[NUMERO_MAX];

        int ninjasCadastrados = 0;

        System.out.println("SISTEMA DE GESTÃO DE NINJAS");
        boolean controleSistema = true;
        while (controleSistema) {
            System.out.println("---------------------------------");
            System.out.println("Escola uma das opções abaixo:");
            System.out.println("1 - Add novo Ninja");
            System.out.println("2 - Listar todos os ninjas");
            System.out.println("3 - Sair do sistema");
            int opcao = sc.nextInt();

            //menu interativo
            switch (opcao) {
                case 1:
                    // logica para add um novo ninja
                    if (ninjasCadastrados < NUMERO_MAX ) {
                        System.out.println("Adicionando um ninja");
                        System.out.println("Informe o nome do Ninja");
                        ninjas[ninjasCadastrados] = new Ninja(sc.next());
                        System.out.println(ninjas[ninjasCadastrados].getNome() + " adicionado com sucesso");
                        ninjasCadastrados++;
                    } else {
                        System.out.println("A lista de ninjas está cheia");
                    }
                    break;
                case 2:
                    // logica para listar todos os ninjas
                    if (ninjasCadastrados > 0) {
                        System.out.println("----- Listando todos os ninjas -----");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println(ninjas[i].getNome());
                        }
                    } else {
                        System.out.println("NivelFacil.Array vazio");
                    }
                    break;
                case 3:
                    // logica para sair do sistema
                    System.out.println("Saindo do sistema...");
                    controleSistema = false;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        }
    }
}
