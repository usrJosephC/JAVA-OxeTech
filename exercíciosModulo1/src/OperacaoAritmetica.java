import java.util.*;

public class OperacaoAritmetica {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double double1, double2, resultado;
    int int1;

    System.out.print("Digite um valor em Double: ");
    double1 = sc.nextDouble();

    int1 = (int) double1;

    System.out.print("Digite outro número real: ");
    double2 = sc.nextDouble();

    resultado = int1 + double2;

    System.out.printf("O resultado da soma entre %d e %.2f é: %.2f", int1, double2, resultado);

    sc.close();
  }
}
