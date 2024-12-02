import java.util.*;

public class VerificaNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n;

        System.out.print("Digite um número: ");
        n = sc.nextDouble();

        if (n > 0) {
            System.out.println("O número é positivo.");
        } else if (n < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        sc.close();
    }
}