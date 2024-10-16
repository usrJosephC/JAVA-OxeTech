import java.util.*;
public class LerNumero {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Digite um número: ");
    numero = sc.nextInt();
    System.out.printf("Seu número é: %d", numero);

    sc.close();
  }
}
