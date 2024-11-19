//Esto ha sido importado automaticamente al escribir codigo
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //Práctrica, determinar si un numero es positivo o negativo
        System.out.println("Introduce un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El número " + numero + " es positivo");
        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo");
        } else if (numero == 0) {
            System.out.println("El número " + numero + " es zero");
        }
        //vamos a considerar numero positivo >= 0
        System.out.println("Esta zona lo muestra con el operador ternario (True o false)");
        String resultado = (numero < 0) ? "negativo" : "positivo";
        System.out.println(resultado);

    }
}