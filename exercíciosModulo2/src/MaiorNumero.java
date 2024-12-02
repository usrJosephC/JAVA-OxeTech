import java.util.*;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, maiorNumero;

        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();

        System.out.print("Digite o terceiro número: ");
        n3 = sc.nextDouble();

        maiorNumero = n1;

        if (n2 > maiorNumero) {
            maiorNumero = n2;
        } 
        
        if (n3 > maiorNumero) {
            maiorNumero = n3;
        }
        System.out.printf("O maior número é: %.2f", maiorNumero);

        sc.close();
    }
}