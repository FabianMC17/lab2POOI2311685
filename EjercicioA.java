import java.util.*;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese un numero a evaluar");

        try {
            long x=sc.nextLong();
            System.out.println(x + " puede ser almacenado en: ");
            



        } 
        catch (Exception e) {
            System.out.println(sc.next() + " no puede ser almacenado en ningun lado");
        }
        
        sc.close();
    }
}