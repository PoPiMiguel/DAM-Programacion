import java.util.Arrays;

public class copiOf {
    public static void main(String[] args) {
        int[] origen = {1,2,34,5,6};
        //Añadimos un nuevo elemento al array
        origen = Arrays.copyOf(origen, origen.length + 1);
        origen[origen.length -1]=17;
        System.out.println(Arrays.toString(origen));
    }
}
