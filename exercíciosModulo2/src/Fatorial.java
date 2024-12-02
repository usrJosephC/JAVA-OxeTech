import java.util.*;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador;
        long fatorial;

        System.out.print("Digite um número inteiro não negativo: ");
        n = sc.nextInt();

        if (n < 0) {
            System.out.println("Fatorial não é definido para números negativos.");
        } else {
            fatorial = 1;
            contador = 1;

            while (contador <= n) {
                fatorial *= contador;
                contador++;
            }

            System.out.printf("O fatorial de %d é: %d", n, fatorial);
        }

        sc.close();
    }
}