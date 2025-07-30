package NivelFacil.Condicoes;
import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        /*
         * Scanner = É um jeito de trazer o usuario para dentro da aplicacao.
         * Objetivo: O usuario vai criar um ninja e vamos validar os dados
         * */

        // Abrir o Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do Ninja");
        String nomeDoNinja = sc.nextLine();
        System.out.println("nomeDoNinja = " + nomeDoNinja);

        System.out.println("Informe a idade do Ninja");
        int idade = sc.nextInt();
        System.out.println("idade = " + idade + "anos");

        if (idade >=18) {
            System.out.println("maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        // Fechar sempre o Scanner
        sc.close();
    }


}
