import java.util.Arrays;
import java.util.Scanner;

public class apuesta {
    public static void main(String[] args) {
        int[] apuesta = new int[6];
        int[] ganadora = new int[6];
        System.out.println("Comparte los numeros de tu apuesta");
        for (int i = 0; i < ganadora.length;i++){
            Scanner sc = new Scanner(System.in);
            apuesta[i] = sc.nextInt();
        }
        for (int i = 0; i< ganadora.length;i++){
            ganadora[i] = (int) ((Math.random() *100)+1);
        }
        Arrays.sort(ganadora);
        int numAciertos = averiguaAciertos(apuesta, ganadora);
        System.out.println("Tu apuesta: " + Arrays.toString(apuesta));
        System.out.println("Primitiva: " + Arrays.toString(ganadora));
        System.out.println("Coincidencias: " + numAciertos);
    }

    static int averiguaAciertos(int[] apuestas, int[] ganadora){
        int numAciertos = 0;
        for (int i = 0; i< apuestas.length;i++){
            int posición = Arrays.binarySearch(ganadora, apuestas[i]);
            if (posición >= 0){
                numAciertos++;
            }
        }
        return numAciertos;
    }

/*
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Defino el array con mis apuestas
        int[] mias ={12,23,34,45,56,67};
        //Defino la combinación ganadora
        int[] ganador ={1,2,3,4,5,6};

        int numAciertos= averiguaAciertos(mias,ganador);
        System.out.println("Has acertado " + numAciertos + " números.");

    }
    static int averiguaAciertos (int[] apuesta, int[] combinacionGanadora){
        int numAciertos = 0;
        //Recorremos el array de apuestas y buscar en la combinación ganadora
        for (int i = 0; i< apuesta.length;i++){
            int posición = Arrays.binarySearch(combinacionGanadora, apuesta[i]);
            if (posición>=0){//Significa que el numero de mi apuesta está en la combinación ganadora
                numAciertos++;
            }
        }
        return numAciertos;

    }
 */
}