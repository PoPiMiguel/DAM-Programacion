//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int i = 0;
        while (i  <= 10 ){
            i++;
            if (i %2  == 0 ){
                continue;
            }
            System.out.println("i vale " + i);
        }
    }
}