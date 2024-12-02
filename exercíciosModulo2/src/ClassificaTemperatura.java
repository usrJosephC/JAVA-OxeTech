import java.util.Scanner;

public class ClassificaTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t;

        System.out.print("Digite a temperatura do ambiente (em °C): ");
        t = sc.nextDouble();

        if (t < 15) {
            System.out.println("Está frio.");
        } else if (t >= 15 && t <= 30) {
            System.out.println("Está agradável.");
        } else {
            System.out.println("Está quente.");
        }

        sc.close();
    }
}