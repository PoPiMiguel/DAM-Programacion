import java.util.Arrays;

public class rotarTabla {
    static final int NUMERO_FILAS = 2;
    static final int NUMERO_COLUMNAS = 2;
    public static void main(String[] args) {
        int matriz [][] = new int [NUMERO_FILAS] [NUMERO_COLUMNAS];
        //Generamos numeros aleatorios
        for (int i = 0; i < NUMERO_FILAS; i++) {
            for (int j = 0; j < NUMERO_COLUMNAS; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
        int [][] girado =  new int[NUMERO_FILAS][NUMERO_COLUMNAS];
        int z = NUMERO_FILAS -1;
        int k = 0;
        for (int i = 0; i < NUMERO_FILAS; i++){

        }
        /*
        NO FUNCIONA
        for (int i = 0; i < NUMERO_FILAS; i++){
            for (int j = 0; j < NUMERO_COLUMNAS; j++){
                int columna=j;
                int fila = i;
                if (i==j){
                    columna++;
                    columna = (columna%2);
                    matriz[i][columna] = matriz[i][j];
                } else{
                    fila++;
                    fila = (fila%2);
                    matriz [fila][j]=matriz[i][j];
                }
            }
            System.out.println(Arrays.toString(matriz[i]));
        }
        */

    }

}