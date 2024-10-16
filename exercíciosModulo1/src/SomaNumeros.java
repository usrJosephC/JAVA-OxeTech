import java.util.*;

public class SomaNumeros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double numero1, numero2, soma;

    System.out.printf("Digite o 1º número: ");
    numero1 = sc.nextDouble();

    System.out.print("Digite o 2º número: ");
    numero2 = sc.nextDouble();

    soma = numero1 + numero2;

    System.out.printf("A soma de %.2f e %.2f é: %.2f", numero1, numero2, soma);
  }
}
