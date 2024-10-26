import java.util.*;

public class DesarmarBomba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String entrada, resultado;
        int conectados;

        entrada = sc.nextLine();
        String[] fios = entrada.split(" ");

        conectados = 0;
        for (String fio : fios) {
            if (!fio.equals("x")) {
                conectados++;
            }
        }

        resultado = "";
        if (conectados >= 4) {
            if (conectados == 4) {
                if (!fiosConectados(fios).contains("r")) {
                    resultado = cortarFio(fios, 1);
                } else if (fiosConectados(fios).get(conectados - 1).equals("b")) {
                    resultado = cortarFio(fios, conectados - 1);
                } else {
                    resultado = cortarFio(fios, 0);
                }
            } else if (conectados == 5) {
                if (fiosConectados(fios).get(0).equals("y") && fiosConectados(fios).get(1).equals("y")) {
                    resultado = cortarFio(fios, 0);
                } else {
                    resultado = cortarFio(fios, 1);
                }
            } else { // Para 6 fios
                if (fiosConectados(fios).stream().filter(f -> f.equals("g")).count() == 1) {
                    resultado = cortarFio(fios, conectados - 1);
                } else {
                    resultado = cortarFio(fios, 4);
                }
            }
        }

        System.out.println(resultado);
        
        sc.close();
  }
  
    private static List<String> fiosConectados(String[] fios) {
        List<String> conectados = new ArrayList<>();
        for (int i = 0; i < fios.length; i++) {
            if (!fios[i].equals("x")) {
                conectados.add(Character.toString((char) ('a' + i)));
            }
        }
        return conectados;
    }
    
    private static String cortarFio(String[] fios, int index) {
        for (int i = 0, count = 0; i < fios.length; i++) {
            if (!fios[i].equals("x")) {
                if (count == index) {
                    return "corta " + (char) ('a' + i);
                }
                count++;
            }
        }
        return "";
        
    }
}