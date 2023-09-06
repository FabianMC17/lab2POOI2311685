import java.util.*;

public class EjercicioB {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Ingrese un numero: ");
        int n = scanner.nextInt();

        if(n % 2 == 0){
            if(n >= 2 && n <= 5){
                System.out.println("Sol");
            } else if(n >= 6 && n <= 20){
                System.out.println("Tierra");
            } else if(n > 20){
                System.out.println("Galaxia");
            }
        } else{
            System.out.println("Luna");
        }

    }
}
