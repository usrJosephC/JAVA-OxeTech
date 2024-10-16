public class CalculoArea {
   public static double areaQuadrado(double lado) {
    return lado * lado; 
  }

public static double areaCirculo(double raio, boolean isCirculo) {
    return Math.PI * raio * raio; 
  }

public static void main(String[] args) {
    double ladoQuadrado = 5.0;
    double areaQuadrado = areaQuadrado(ladoQuadrado);
    System.out.printf("A área do quadrado com lado %.2f é: %.2f%n", ladoQuadrado, areaQuadrado);

    double raioCirculo = 3.0;
    double areaCirculo = areaCirculo(raioCirculo, true);
    System.out.printf("A área do círculo com raio %.2f é: %.2f%n", raioCirculo, areaCirculo);
  }
}

