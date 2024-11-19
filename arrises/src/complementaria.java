import java.util.Arrays;
import java.util.Scanner;

public class complementaria {
    public static void main(String[] args) {
        int longitud;
        int fin;
        System.out.println("Dime la longitud para el array: ");
        Scanner sc = new Scanner(System.in);
        longitud = sc.nextInt();
        System.out.println("Dime el final: ");
        fin = sc.nextInt();

        int[] numerosResultado = rellenaPares(longitud, fin);
        System.out.println(Arrays.toString(numerosResultado));
    }

    static int[] rellenaPares(int longitud, int fin) {
        int[] numeros = new int[longitud];
        /*int indice = 0;
        do {

            int numeroAleatorio = (int) (Math.random() * fin) + 1;

            if ((numeroAleatorio % 2) == 0) {
                numeros[indice] = numeroAleatorio;
                indice++;
            }
        } while (numeros[longitud - 1] != 0); */
        for (int i = 0; i < numeros.length;i++){
            int numeroRandom = (int) (Math.random() * (fin/2)) ;
            numeros[i]= numeroRandom*2;
        }
        return numeros;
    }


}
