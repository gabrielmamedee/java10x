package Array;

public class Array {
    public static void main(String[] args) {

        //Arrays são tipo referencia!
        // String inicializa como null
        String[] ninja = new String[4];

        ninja[0] = "Naturo Uzumaki";
        ninja[1] = "Sakura Haruno";
        ninja[2] = "Sasuke Uchina";
        ninja[3] = "Hinata Hyuga";

        System.out.println(ninja[1]);

        // Redeclarando o ARRAY
        ninja = new String[7];
        ninja[0] = "Hashirama";
        ninja[1] = "Tobirama";
        ninja[2] = "Hiruzen";
        ninja[3] = "Minato";
        ninja[4] = "Tsunade";
        ninja[5] = "Kakashi";
        ninja[6] = "Naruto";
        System.out.println(ninja[2]);

        // Int inicializa com 0
        int[] idade = new int[2];

        // Boolean inicializa com FALSE
        boolean[] verdadeiroOuFalso = new boolean[2];

        // Double inicializa com 0.0
        double[] flutuantes = new double[1];

        for (String s : ninja) {
            System.out.println(s);
        }
    }
}
