public class NumerosAteVinte {
    public static void main(String[] args) {
        
        for (int i = 1; i <= 20; i++) {
            if (i == 13) {
                System.out.println(", 13");
                break;
            }
            System.out.print(i);

            if (i < 12) {
                System.out.print(", ");
            }
        }

        System.out.println();
    }
}