public class ejercicio1 {
    public static void main(String[] args) {
        int[] numeros = {1,3,5,7,9};
        System.out.println((numeros[1]));

        //Así establecemos la longitud, indicamos que va a tener 9 elementos
        int [] edades = new int[27];
        for (int i = 0; i<numeros.length; i++){
            System.out.println("El número de la posición " + i + " es " + numeros[i]);
        }
    }
}