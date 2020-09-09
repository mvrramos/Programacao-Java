import java.util.Scanner;

public class Parametro1 {
    public static void main(String[] args) {
        String nome;
        Integer idade;

        Parametro1_1 ex = new Parametro1_1();
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        nome = sc.next();
        System.out.println("Qual a sua idade?");
        idade = sc.nextInt();

        ex.Usuario(nome, idade);
        sc.close();
    }
}