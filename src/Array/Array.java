package Array;

public class Array {
    public static void main(String[] args) {
        String[] ninja = new String[4];

        ninja[0] = "Naturo Uzumaki";
        ninja[1] = "Sakura Haruno";
        ninja[2] = "Sasuke Uchina";
        ninja[3] = "Hinata Hyuga";

        System.out.println(ninja[1]);

        for (String s : ninja) {
            System.out.println(s);
        }
    }
}
