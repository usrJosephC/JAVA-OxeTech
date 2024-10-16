import java.util.*;
public class MediaVerificar {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero1, numero2, numero3;
    double media;

    System.out.print("Digite o 1º número: ");
    numero1 = sc.nextInt();

    System.out.print("Digite o 2º número: ");
    numero2 = sc.nextInt();

    System.out.print("Digite o 3º número: ");
    numero3 = sc.nextInt();

    media = (numero1 + numero2 + numero3) / 3;

    System.out.println("A média dos três números é: " + media);

    boolean maior50 = media > 50;
    System.out.println("A média é maior que 50? " + maior50);

    sc.close();
  }
}
