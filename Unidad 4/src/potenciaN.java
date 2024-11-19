import java.util.Scanner;

public class potenciaN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la base: ");
        int base = sc.nextInt();
        System.out.println("Dime el exponente: ");
        int exponente = sc.nextInt();
        int result = potencia(base, exponente);
        System.out.println("El resultado de la potencia del numero " + base + " elevado a "+ exponente + " es "+ result);
    }
    //Función Iterativa
    static int potencia(int base, int exponente) {
        int resultado = 1;
        for (int i = 0; i < exponente; i++) {
            resultado = resultado * base;
        }
        return resultado;
    }

    //Función recursiva
    static int potenciaRecursiva(int base, int exponente) {
        int resultado = base;
        int n = exponente;
        if (n == 1) {
            return resultado;
        } else {
            n--;
            resultado = base * potenciaRecursiva(resultado, n);
        }
        return resultado;
    }
}