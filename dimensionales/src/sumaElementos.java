import java.util.Arrays;

public class sumaElementos {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6};
        int numGrupo = 3;

        int [] result = suma(numeros, numGrupo);
        System.out.println(Arrays.toString(result));
    }
    static int [] suma (int[]numeros, int numGrupo){
        int [] result = new int[numeros.length - numGrupo +1];

        if (numGrupo <= 0 || numeros.length < numGrupo){
            return new int[0];
        }

        for (int i = 0; i <= (numeros.length -numGrupo);i++){
            int suma = 0;
            for (int j = 0; j< numGrupo;j++){
                suma += numeros[i + j];
            }
            result[i]= suma;
        }

        return result;
    }
}