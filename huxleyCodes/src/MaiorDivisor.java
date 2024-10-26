import java.util.Scanner;

public class MaiorDivisor {
  
  public static int contarDivisores(int n) {
        int contagem = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                contagem++;
            }
        }
        return contagem;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        
        int numeroComMaisDivisores = A;
        int maxDivisores = contarDivisores(A);
        
        for (int i = A + 1; i <= B; i++) {
            int divisoresAtuais = contarDivisores(i);
            if (divisoresAtuais > maxDivisores) {
                maxDivisores = divisoresAtuais;
                numeroComMaisDivisores = i;
            }
        }
        
        System.out.println(numeroComMaisDivisores + " " + maxDivisores);
        
        scanner.close();
  }
}
