import java.util.Scanner;

public class ejercicio_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidad = scanner.nextInt();
        int contador = 0;
        int num = 2;
        while(contador != cantidad) {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
            if (esPrimo) {
                contador++;
                System.out.println(num);
            }
            num++;
        }
    }

}
