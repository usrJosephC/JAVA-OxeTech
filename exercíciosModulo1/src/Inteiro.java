import java.util.*;

public class Inteiro {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float decimal;
    int inteira;

    System.out.print("Digite um número decimal: ");
    decimal = sc.nextFloat();

    inteira = (int) decimal;

    System.out.printf("A parte inteira do número é: %d", inteira);

    sc.close();
  }
}
