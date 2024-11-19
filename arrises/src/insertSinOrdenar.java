import java.util.Arrays;

public class insertSinOrdenar {
    static final int LONGITUD_ARRAYS= 10;
    public static void main(String[] args) {
        int [] num = new int[LONGITUD_ARRAYS];
        int [] pares = new int[LONGITUD_ARRAYS];
        int [] impares = new int[LONGITUD_ARRAYS];
        int posicionPares=0;
        int posicionImpares=0;

        for (int i = 0; i< num.length;i++){
            num[i] = (int) (Math.random()*100)+1;
            if ((num[i]%2)==0){
                pares[posicionPares] = num[i];
                posicionPares++;
            }
            else {
                impares[posicionImpares]=num[i];
                posicionImpares++;
            }
        }
        Arrays.sort(num);
        pares = Arrays.copyOfRange(pares,0,posicionPares);
        impares = Arrays.copyOfRange(impares,0,posicionImpares);
        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(impares));
    }
}