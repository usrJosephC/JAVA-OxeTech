import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, resultado;

        System.out.print("Digite um número para ver sua tabuada: ");
        n = sc.nextInt();

        System.out.printf("Tabuada do %d:", n);
        for (int i = 1; i <= 10; i++) {
            resultado = n * i;
            System.out.printf("%d x %d + %d%n", n, i, resultado);
        }

        sc.close();
    }
}