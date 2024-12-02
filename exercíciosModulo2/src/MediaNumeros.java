import java.util.*;

public class MediaNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int soma = 0;
        int contador = 0;
        double media;

        do {
            System.out.print("Digite um número (0 para terminar): ");
            n = sc.nextInt();

            if (n != 0) {
                soma += n;
                contador++;
            }

        } while (n != 0);

        if (contador > 0) {
            media = (double) soma / contador;

            System.out.printf("A média dos números digitados é: %.2f", media);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close();
    }
}