public class impares {
    public static void main(String[] args) {
        //Declaraciones
        int[] numeros = {1, 3, 5, 7, 9};
        int[] impares = new int[10];
        int imparInicial = 1;
        for (int i = 0; i < impares.length; i++) {
            impares[i] = imparInicial;
            imparInicial = imparInicial + 2;
            System.out.println("El numero impar de la posicion "+ i + " es " + impares[i]);
        }
    }
}
