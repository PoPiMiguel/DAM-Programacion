import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu nombre");
        String nombre1 = sc.nextLine();

        escribeMiNombre(nombre1);
        escribeMiNombre(nombre1);
        escribeMiNombre(nombre1);
        escribeMiNombre(nombre1);



    }
    static void escribeMiNombre(String nombre1){
        System.out.println(nombre1);
    }

}