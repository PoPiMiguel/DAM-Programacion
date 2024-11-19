import java.util.Arrays;

public class comparaArrisesConEquals {
    public static void main(String[] args) {
        int [] num1 = {1,2,3,4,5};
        int [] num2 = {5,4,3,2,1};

        // Comparación con Equals
        if (Arrays.equals(num1,num2)){
            System.out.println("Comparación con equals: Arrays iguales");
        }
        else {
            System.out.println("Comparación con equals: Arrays diferentes");
        }


        //Comparación con ==
        if (num1==num2){
            System.out.println("Comparación con ==: Arrays iguales");
        }
        else {
            System.out.println("Comparación con ==: Arrays diferentes");
        }

    }
}
