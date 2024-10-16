import java.util.*;

public class IncrementoDecremento {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero;

    System.out.print("Digite um número inteiro: ");
    numero = sc.nextInt();
    System.out.println("Valor original é: " + numero);
    
    System.out.println("Incrementando...");
    System.out.println("Valor antes do incremento: " + numero);
    numero++;
    System.out.println("Valor depois do incremento: " + numero);
    
    System.out.println("Decrementando...");
    System.out.println("Valor antes do decremento: " + numero);
    numero--;
    System.out.println("Valor depois do decremento: " + numero);

    sc.close();
  }
}
