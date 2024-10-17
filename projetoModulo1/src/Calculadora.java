import java.util.*;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        double num1, num2, somaDecimal, subtracaoDecimal, multiplicacaoDecimal, divisaoDecimal;
        int intNum1, intNum2, somaInteiro, subtracaoInteiro, multiplicacaoInteiro, divisaoInteiro;

        System.out.print("Digite seu nome: ");
        nome = sc.nextLine();
        System.out.printf("Bem-vindo, %s!%n", nome);

        System.out.print("Digite o primeiro número: ");
        num1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = sc.nextDouble();

        somaDecimal = somar(num1, num2);
        subtracaoDecimal = subtrair(num1, num2);
        multiplicacaoDecimal = multiplicar(num1, num2);
        divisaoDecimal = dividir(num1, num2);

        System.out.println("Calculando com valores decimais:");
        System.out.printf("Resultado da operação %.2f + %.2f: %.2f%n", num1, num2, somaDecimal);
        System.out.printf("Resultado da operação %.2f - %.2f: %.2f%n", num1, num2, subtracaoDecimal);
        System.out.printf("Resultado da operação %.2f * %.2f: %.2f%n", num1, num2, multiplicacaoDecimal);
        System.out.printf("Resultado da operação %.2f / %.2f: %.2f%n", num1, num2, divisaoDecimal);

        intNum1 = (int) num1;
        intNum2 = (int) num2;

        somaInteiro = somar(intNum1, intNum2);
        subtracaoInteiro = subtrair(intNum1, intNum2);
        multiplicacaoInteiro = multiplicar(intNum1, intNum2);
        divisaoInteiro = dividir(intNum1, intNum2);

        System.out.println("Calculando com valores inteiros:");
        System.out.printf("Resultado da operação %d + %d: %d%n", intNum1, intNum2, somaInteiro);
        System.out.printf("Resultado da operação %d - %d: %d%n", intNum1, intNum2, subtracaoInteiro);
        System.out.printf("Resultado da operação %d * %d: %d%n", intNum1, intNum2, multiplicacaoInteiro);
        System.out.printf("Resultado da operação %d / %d: %d%n", intNum1, intNum2, divisaoInteiro);

        sc.close();
    }

    public static double somar(double a, double b) {
        return a + b;
    }

    public static double subtrair(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return (b != 0) ? a / b : -1.0;
    }

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return (b != 0) ? a / b : -1;
    }
}
