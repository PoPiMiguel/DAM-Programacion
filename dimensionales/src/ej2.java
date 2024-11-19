import java.util.Arrays;

public class ej2 {
    static final int NUMERO_FILAS = 5;
    static final int NUMERO_COLUMNAS = 5;
    public static void main(String[] args) {
        int matriz [][] = new int [NUMERO_FILAS] [NUMERO_COLUMNAS];

        for (int i = 0; i < NUMERO_FILAS; i++) {
            for (int j = 0; j < NUMERO_COLUMNAS; j++) {
                matriz[i][j] = 10 * (i + j) ;
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}