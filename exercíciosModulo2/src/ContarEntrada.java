import java.util.Scanner;

public class ContarEntrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador;

        System.out.print("Digite um número: ");
        n = sc.nextInt();

        contador = 0;

        while (contador <= n) {
            System.out.print(contador);

            if (contador < n) {
                System.out.print(", ");
            }

            contador++;
        }

        System.out.println();

        sc.close();
    }
}