import java.util.*;

public class ParImpar {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int numero;
        
        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é par.", numero);
        } else {
            System.out.printf("O número %d é ímpar.", numero);
        }

        sc.close();
    }
}
