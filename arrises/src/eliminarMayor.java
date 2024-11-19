import java.util.Arrays;
import java.util.Scanner;

public class eliminarMayor {
    static final int LONGITUD_ARRAYS= 5;
    public static void main(String[] args) {
        int [] num = new int[LONGITUD_ARRAYS];
        //Generamos num aleatorios
        for (int i = 0; i< num.length;i++) {
            num[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Escribe el valor: ");
        Scanner sc = new Scanner(System.in);
        int numMax = sc.nextInt();
        int [] sinMayores = eliminarMayores (num,numMax);
        System.out.println("El array generado es: ");
        System.out.println(Arrays.toString(num));
        System.out.println("El array sin números mayores a "+ numMax + " es:");
        System.out.println(Arrays.toString(sinMayores));

    }
    static int [] eliminarMayores(int[] num, int numMax){
        int []result = new int[num.length];
        int posicion = 0;
        for (int i = 0; i < LONGITUD_ARRAYS; i++){
            if (num[i] < numMax){
                result[posicion] = num[i];
                posicion++;
            }
        }
        //Arrays.sort(result);
        //result = Arrays.copyOfRange(result,LONGITUD_ARRAYS - posicion,LONGITUD_ARRAYS);
        result = Arrays.copyOf(result, posicion);
        return result;
    }
}
