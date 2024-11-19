//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {

        // Queremos hallar la potencia de 7 elevado a 4
        int base = 7;
        int exponente = 4;
        int veces = 1;
        int resultado = base;

        while (veces < exponente) {
            System.out.println(" En la interacción " + veces + " el resultado es: " + resultado);
            resultado = resultado * base;
            veces = veces +1;
        }
        System.out.println("El resultado de " + base + " elevado a " + exponente + " es: " + resultado);

    }
}
