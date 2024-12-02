import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l1, l2, l3;

        System.out.print("Digite o comprimento do primeiro lado: ");
        l1 = sc.nextDouble();

        System.out.print("Digite o comprimento do segundo lado: ");
        l2 = sc.nextDouble();

        System.out.print("Digite o comprimento do terceiro lado: ");
        l3 = sc.nextDouble();

        if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
            if (l1 == l2 && l2 == l3) {
                System.out.println("O triângulo é equilátero.");
            } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                System.out.println("O triângulo é isósceles.");
            } else {
                System.out.println("O triângulo é escaleno.");
            }
        } else {
            System.out.println("Os valores fornecidos não formam um triângulo válido.");
        }

        sc.close();
    }
}