public class tablas {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j < 11; j++) {
                int result = i * j;
                System.out.println(i + "x" + j + "=" + result);
            }
            System.out.println("");
        }
    }
}
