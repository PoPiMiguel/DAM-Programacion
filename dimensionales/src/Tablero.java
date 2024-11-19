import java.util.Arrays;
import java.util.Scanner;

public class Tablero {
    static final int NUMERO_FILAS = 8;
    static final int NUMERO_COLUMNAS = 8;
    static char[][] damero = new char[NUMERO_FILAS][NUMERO_COLUMNAS];

    public static void main(String[] args) {
        montarDamero(damero);
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la fila que ocupa la dama: ");
        int posFilaDama = sc.nextInt();
        System.out.println("Dime la columna que ocupa la dama");
        int posColumnaDama = sc.nextInt();
        pintarPosiblesPosicionesDama(posFilaDama, posColumnaDama, damero);
    }

    public static void montarDamero(char[][] damero) {
        for (int i = 0; i < NUMERO_FILAS; i++) {
            for (int j = 0; j < NUMERO_COLUMNAS; j++) {
                if (i % 2 == 0) {
                    if (j % 2 == 0) {
                        damero[i][j] = 'B';
                    } else {
                        damero[i][j] = 'N';
                    }
                } else {
                    if (j % 2 == 0) {
                        damero[i][j] = 'N';
                    } else {
                        damero[i][j] = 'B';
                    }
                }
            }
            System.out.println(Arrays.toString(damero[i]));
        }
    }

    static void pintarPosiblesPosicionesDama(int posFilaDama, int posColumnaDama, char[][] damero) {

    }
}