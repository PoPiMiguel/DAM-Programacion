import java.util.Arrays;

public class ej1 {
    static final int NUMERO_FILAS = 4;
    static final int NUMERO_COLUMNAS = 5;
    public static void main(String[] args) {
        int matriz [][] = new int [NUMERO_FILAS] [NUMERO_COLUMNAS];

        for (int i = 0; i < NUMERO_FILAS; i++){
            for (int j = 0; j < NUMERO_COLUMNAS; j++){
                matriz[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
}