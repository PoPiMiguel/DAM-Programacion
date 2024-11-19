import java.util.Scanner;

public class clases {
    //private static final int LONGITUD_ARRAY = 5;

    public static void main(String[] args) {
        /*
        int[] enteros = new int[5];
        double[] dobles = new double[5];
        boolean[] logicos = new boolean[5];
        enteros[0] = 3;
        enteros[1] = 27;
        enteros[2] = 14;
        System.out.println(enteros);
        System.out.println(dobles);
        System.out.println(logicos);
        */
        double[] sueldos = {1300,2000,3210};
        //int[] numeros = new int[LONGITUD_ARRAY];
        Scanner sc = new Scanner(System.in);
      //  for (int i = 0; i < LONGITUD_ARRAY; i++) {
      //      System.out.println("Escribe el numero: ");
      //      numeros[i] = sc.nextInt();
     //   }
      //  for (int i = 0; i < LONGITUD_ARRAY; i++) {
     //       System.out.println("El numero en la posición " + i + " es: " + numeros[i]);
      //  }

        for (int i = 0; i < sueldos.length; i++){
            sueldos[i] = sueldos[i] + (0.1* sueldos[i]);
            System.out.println(sueldos[i]);
        }

    }
}