import java.util.Scanner;

public class ejercicio_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int contador = 0;
        for (int i = m + 1; ; i++){
            if (i % m == 0) {
                contador++;
                System.out.println(i);
            }
            if (contador == n) {
                break;
            }
        }
    }
}
