import java.util.*;

public class PesquisaClientes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int quantidadeVendas = 0;
        float totalVendasAVista = 0;
        float totalVendasCartao = 0;
        int idadeMaisJovem = Integer.MAX_VALUE;
        float maiorCompra = 0;
        float totalComprasAVista = 0;
        int quantidadeComprasAVista = 0;

        while (true) {
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Valor da compra: ");
            float valorCompra = scanner.nextFloat();
            System.out.print("Tipo de pagamento (C: cartão; V: à vista): ");
            char tipoPagamento = scanner.next().charAt(0);
            System.out.print("Continuar? (S/N): ");
            char continuar = scanner.next().charAt(0);

            quantidadeVendas++;

            if (tipoPagamento == 'V') {
                totalVendasAVista += valorCompra;
                totalComprasAVista += valorCompra;
                quantidadeComprasAVista++;
            } else if (tipoPagamento == 'C') {
                totalVendasCartao += valorCompra;
            }

            if (idade < idadeMaisJovem) {
                idadeMaisJovem = idade;
            }

            if (valorCompra > maiorCompra) {
                maiorCompra = valorCompra;
            }

            if (continuar == 'N') {
                break;
            }
        }

        float mediaComprasAVista = quantidadeComprasAVista > 0 ? totalComprasAVista / quantidadeComprasAVista : 0;

        System.out.printf("%d%n", quantidadeVendas);
        System.out.printf("%.2f%n", totalVendasAVista);
        System.out.printf("%.2f%n", totalVendasCartao);
        System.out.printf("%d%n", idadeMaisJovem == Integer.MAX_VALUE ? 0 : idadeMaisJovem);
        System.out.printf("%.2f%n", maiorCompra);
        System.out.printf("%.2f%n", mediaComprasAVista);

        scanner.close();
    }
}