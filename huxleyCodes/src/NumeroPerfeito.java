import java.util.*;

public class NumeroPerfeito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            if (ehPerfeito(X)) {
                System.out.println(X + " eh perfeito");
            } else {
                System.out.println(X + " nao eh perfeito");
            }
        }
        
        sc.close();
    }
    
    private static boolean ehPerfeito(int numero) {
        int somaDivisores = 0;
        
        for (int i = 1; i < numero; i++) {
            if (numero % i == 0) {
                somaDivisores += i;
            }
        }
        
        return somaDivisores == numero;
    }
}