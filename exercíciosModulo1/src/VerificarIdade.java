import java.util.*;

public class VerificarIdade {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade;

    System.out.print("Digite sua idade: ");
    idade = sc.nextInt();

    boolean idade16e18 = (idade >= 16 && idade <= 18);
    
    boolean idade65 = (idade > 65);
    System.out.println("A idade está entre 16 e 18? " + idade16e18);
    System.out.println("A idade é maior que 65? " + idade65);

  }
}
