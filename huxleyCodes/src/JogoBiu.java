import java.util.*;

public class JogoBiu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a soma dos dados em cada rodada separados por ENTER:");
        int[] rodadas = new int[3];
        boolean valorInvalido = false;

        for (int i = 0; i < 3; i++) {
            rodadas[i] = sc.nextInt();
            if (rodadas[i] < 2 || rodadas[i] > 12) {
                valorInvalido = true;
            }
        }

        if (valorInvalido) {
            System.out.println("Valor invalido");
        }

        boolean perdeuPorDois = false;
        boolean ganhou = false;
        boolean todasPares = true;

        for (int soma : rodadas) {
            if (soma == 2) {
                perdeuPorDois = true;
                break;
            }

            if (soma >= 10) {
                ganhou = true;
            }

            if (soma % 2 != 0) {
                todasPares = false;
            }
        }

        if (perdeuPorDois) {
            System.out.println("Biu perdeu");
        } else if (ganhou) {
            System.out.println("Biu ganhou");
        } else if (!todasPares && !ganhou) {
            System.out.println("Biu perdeu");
        } else {
            System.out.println("Biu perdeu");
        }

        sc.close();
    }
}