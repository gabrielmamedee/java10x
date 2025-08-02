package NivelIntermediario.Desafio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean encerrarPrograma = false;
        int opcaoMenu;
        int NUMERO_MAX_NINJAS = 10;
        int indexNinjas = 0;

        Ninja[] ninjas = new Ninja[NUMERO_MAX_NINJAS];

        Scanner sc = new Scanner(System.in);

        System.out.println("GESTÃO DE NINJAS");

        while (!(encerrarPrograma)) {

            System.out.println("-------------------------");
            System.out.println("Escola uma das opções abaixo");
            System.out.println("1 - Cadastro de Ninjas");
            System.out.println("2 - Listagem de Ninjas");
            System.out.println("3 - Sair");

            opcaoMenu = sc.nextInt();

            switch (opcaoMenu) {
                case 1:
                    System.out.println("Acessando Cadastros");
                    if (indexNinjas < NUMERO_MAX_NINJAS) {

                        String nome, statusMissao, nivelDificuldade, missao, habilidadeEspecial;
                        int idade, tipoNinja;
                        boolean tipoUchiha;

                        System.out.println("Escolha o tipo do cadastro");
                        System.out.println(" 1 - Ninja");
                        System.out.println(" 2 - Uchiha");
                        tipoNinja = sc.nextInt();
                        tipoUchiha = (tipoNinja == 2);

                        System.out.println("Informe o nome do ninja");
                        sc.nextLine();
                        nome = sc.nextLine();
                        System.out.println("Informe a idade do ninja");
                        idade = sc.nextInt();
                        System.out.println("Informe a missao a ser coumprida");
                        sc.nextLine();
                        missao = sc.nextLine();
                        System.out.println("Informe o nivel de dificuldade da missao");
                        nivelDificuldade = sc.nextLine();
                        System.out.println("Informe o status da missao:");
                        statusMissao = sc.nextLine();

                        if (tipoUchiha) {
                            System.out.println("Informe a habilidade especial do ninja");
                            habilidadeEspecial = sc.nextLine();

                            ninjas[indexNinjas] = new Uchiha(
                                    nome,
                                    statusMissao,
                                    nivelDificuldade,
                                    missao,
                                    idade,
                                    habilidadeEspecial
                            );
                        } else {
                            ninjas[indexNinjas] = new Ninja(
                                    nome,
                                    statusMissao,
                                    nivelDificuldade,
                                    missao,
                                    idade
                            );
                        }

                        System.out.println("Ninja cadastrado com sucesso");
                        ninjas[indexNinjas].mostrarInformacoes();

                        indexNinjas++;
                    } else {
                        System.out.println("Não foi possivel iniciar o catadro, quantidade maxima de ninjas atingida!");
                    }
                    break;
                case 2:
                    System.out.println("Acessando Listagem");
                    if (indexNinjas > 0) {
                        for (int i = 0; i < indexNinjas; i++) {
                            System.out.println("**********************");
                            ninjas[i].mostrarInformacoes();
                            System.out.println("**********************");
                        }
                    } else {
                        System.out.println("Não foi possivel listar os ninjas, pois não existe cadastro...");
                    }
                    break;
                case 3:
                    encerrarPrograma = true;
                    System.out.println("Saindo ...");
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }
        }
    }
}
