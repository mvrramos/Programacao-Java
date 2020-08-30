package projeto1;

import java.util.Scanner;

public class scanner {
    public static void main(String[] args) {
        String nome;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o seu nome?");
        nome = sc.nextLine();
        System.out.println("Olá  "+nome);
        sc.close();
    }
}
