import java.util.Scanner;

public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador,I,numero;

        System.out.print("Digite el numero para conocer si es primo: ");
        int numeroPrimo = scanner.nextInt();
        contador = 0;

        for(int i = 1; i <= numeroPrimo; i++) {
            if((numeroPrimo % i) == 0) {
                contador++;
            }
        }
        if(contador <= 2) {
            System.out.println(numeroPrimo +  " Es primo");
        }else{
            System.out.println(numeroPrimo + " No es primo");
        }
    }
}

