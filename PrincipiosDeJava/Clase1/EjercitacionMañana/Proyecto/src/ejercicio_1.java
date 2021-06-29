import java.util.*;

public class ejercicio_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroLimite = scanner.nextInt();
        for (int i = 0; i <= numeroLimite; i += 1) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}



