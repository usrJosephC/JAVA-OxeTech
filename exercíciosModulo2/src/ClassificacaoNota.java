import java.util.*;

public class ClassificacaoNota {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int categoria;
        double nota;
        
        System.out.print("Digite uma nota de 0 a 10: ");
        nota = sc.nextDouble();

        if (nota < 0 || nota > 10) {
            System.out.println("Nota inválida! A nota deve estar entre 0 e 10.");
        } else {
            if (nota >= 9) {
                categoria = 1;
            } else if (nota >= 7) {
                categoria = 2;
            } else if (nota >= 5) {
                categoria = 3;
            } else {
                categoria = 4;
            }

            switch (categoria) {
                case 1:
                    System.out.println("Classificação: A");
                    break;
                case 2:
                    System.out.println("Classificação: B");
                    break;
                case 3:
                    System.out.println("Classificação: C");
                    break;
                case 4:
                    System.out.println("Classificação: D");
                    break;
                default:
                    break;
            }
        }

        sc.close();
    }
}