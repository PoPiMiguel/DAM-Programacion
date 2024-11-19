import java.util.Scanner;

public class numerosPedidos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime cuantos numeros quieres que tenga el array: ");
        int longitud = sc.nextInt();
        int mayor = 0;
        int [] numeros = new int[longitud];


        for (int i = 0; i<numeros.length;i++){
            System.out.println("Dime el numero " + i);
            numeros[i]= sc.nextInt();
        }
    }
}
