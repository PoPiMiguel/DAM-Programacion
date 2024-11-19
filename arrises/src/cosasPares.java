import java.util.Scanner;

public class cosasPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[] = new int[5];
        int mayor = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Dime el numero " + i);
            numeros[i] = sc.nextInt();
            if (mayor < numeros[i]) {
                mayor = numeros[i];
            }
        }
        for (int i = numeros.length - 1; i >= 0; i--) {
            System.out.print(numeros[i] + " ");
        }
        //Este no vale

        /*
        StringBuilder sb = new StringBuilder(Arrays.toString(numeros)).reverse();
        System.out.println(sb);
        */
    }
}
