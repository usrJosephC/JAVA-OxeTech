import java.util.*;

public class PularNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Digite um número entre 1 e 10: ");
        n = sc.nextInt();

        if (n < 1 || n > 10) {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 10.");
        } else {
            for (int i = 1; i <= 10; i++) {
                if (i == n) {
                  System.out.print(", ");
                    continue;
                }
                System.out.print(i);

                if (i < 10 && i + 1 != n) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}