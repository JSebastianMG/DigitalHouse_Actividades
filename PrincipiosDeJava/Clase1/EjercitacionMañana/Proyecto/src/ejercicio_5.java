
import java.util.Scanner;
import java.util.ArrayList;

public class ejercicio_5 {

    public static boolean esPrimo(int numero) {
        int contador = 2;
        boolean primo = true;
        while ((primo) && (contador != numero)) {
            if (numero % contador == 0)
                primo = false;
            contador++;
        }
        return primo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int limite_superior = (int) Math.pow(10, m);
        int limite_inferior = limite_superior - (90 * limite_superior) / 100;
        int printeados = 0;
        for (int i = limite_inferior; ; i++) {
            if (printeados == n) {
                break;
            }
            if (esPrimo(i)) {
                int contador = 0;
                String number = String.valueOf(i);
                String[] digitos = number.split("");
                String numero_igual = String.valueOf(d);
                for (int j = 0; j < digitos.length; j++) {
                    if (digitos[j].equals(numero_igual)) {
                        contador += 1;
                    }
                    if (contador == m) {
                        System.out.println(number);
                        printeados = printeados + 1;
                    }
                }
            }
        }
    }
}
