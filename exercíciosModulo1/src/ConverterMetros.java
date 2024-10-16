import java.util.*;

public class ConverterMetros {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double metros, centimetros;

    System.out.print("Digite um valor em metros: ");
    metros = sc.nextDouble();

    centimetros = metros * 100;

    System.out.printf("O valor em centímetros é: %.2f cm%n", centimetros);

    sc.close();
  }
}
