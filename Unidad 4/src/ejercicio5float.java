import java.util.Scanner;

public class ejercicio5float {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime 2 números");
        float num1 = sc.nextFloat();
        float num2 = sc.nextFloat();
        System.out.println("El número mayor es " + mayor(num1, num2));

    }
    static float mayor(float num1, float num2){
        return Math.max(num1, num2);
    }
}
