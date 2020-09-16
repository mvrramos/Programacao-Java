import java.util.Scanner;

public class DistanciaDoisPontos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float distancia, p1x, p1y, p2x, p2y;

        System.out.println("Primeiro, vamos começar com o 1º ponto");
        System.out.println("Digite a coordenada X do Ponto 1");
        p1x = sc.nextFloat();
        System.out.println("Digite a coordenada Y do Ponto 1");
        p1y = sc.nextFloat();
        System.out.println("Digite a coordenada X do Ponto 2");
        p2x = sc.nextFloat();
        System.out.println("Digite a coordenada Y do Ponto 2");
        p2y = sc.nextFloat();

        distancia = (float) Math.sqrt(Math.pow(p1x - p2x, 2) + Math.pow(p1y - p2y, 2));
        
        System.out.printf("A distancia entre os pontos (%f, %f) e (%f, %f), é: %f", p1x, p2x, p2x, p2y, distancia);
        sc.close();
    }
}
