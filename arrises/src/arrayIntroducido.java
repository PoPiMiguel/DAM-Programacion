import java.util.Arrays;
import java.util.Scanner;

public class arrayIntroducido {
    public static void main(String[] args) {

        float sumaPositivos = 0;
        int cantNumPos = 0;
        float sumaNegativos = 0;
        int cantNumNeg = 0;
        int contadorCero = 0;
        //Pedimos el numero de elementos que va a tener el array
        System.out.println("Dime el numero del array: ");
        Scanner sc = new Scanner(System.in);
        int longitud = sc.nextInt();
        float[] numeros = new float[longitud];

        //Recorremos el array y pidiendo numeros
        for (int i = 0; i < longitud; i++) {
            System.out.println("Escribe el numero en la posicion " + i);
            numeros[i] = sc.nextFloat();
            //Si el item iesimo es mayor que 0
            if (numeros[i] > 0) {
                sumaPositivos += numeros[i];
                cantNumPos++;
            } else if (numeros[i] < 0) {
                sumaNegativos += numeros[i];
                cantNumNeg++;
            } else {
                contadorCero++;
            }
        }
        System.out.println("El array es: "+ Arrays.toString(numeros));
        float mediaPositivos = sumaPositivos / cantNumPos;
        float mediaNegativos = sumaNegativos / cantNumNeg;
        System.out.println("La media de los numeros positivos es: "+ mediaPositivos);
        System.out.println("La media de los numeros negativos es: "+ mediaNegativos);
        System.out.println("Has introducido "+ contadorCero + " ceros");

    }
}
