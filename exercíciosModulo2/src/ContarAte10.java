public class ContarAte10 {
  public static void main(String[] args) {
      for (int i = 1; i <= 10; i++) {
          System.out.print(i);

          if (i < 10) {
              System.out.print(", ");
          }
      }
      System.out.println();
  }
}