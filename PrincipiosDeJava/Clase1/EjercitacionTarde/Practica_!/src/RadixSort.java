import java.util.Arrays;
import java.util.Collections;

public class RadixSort {
    public static void main(String[] args) {
        // array de enteros
        int enteroArreglo[];
        enteroArreglo = new int[10];
        for (int x = 0; x < enteroArreglo.length; x++)
            enteroArreglo[x] = (int) (Math.random() * 200);

        // array de Strings
        String[] strArreglo = new String[enteroArreglo.length];
        for (int i = 0; i < enteroArreglo.length; i++) {
            strArreglo[i] = String.valueOf(enteroArreglo[i]);
        }
        System.out.println("arreglo generado"  + Arrays.toString(strArreglo));

        // encontrar el valor maximo



    }
}
