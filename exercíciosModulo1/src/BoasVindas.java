import java.util.*;

public class BoasVindas {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String nome;

    System.out.print("Digite seu nome: ");
    nome = sc.nextLine();

    System.out.println("Bem-vindo(a), " + nome + "! :)");

    sc.close();
  }
}
