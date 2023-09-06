import java.util.*;

public class EjercicioA {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Ingrese un numero a evaluar: ");

        try {
            long x = sc.nextLong();
            System.out.println(x + " puede ser almacenado en: ");

            if (x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){
                System.out.println("(*) byte");
            }
            if (x >= Short.MIN_VALUE && x<= Short.MAX_VALUE){
                System.out.println("(*) Short");
            }
            if (x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){
                System.out.println("(*) Int");
            }
            if (x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){
                System.out.println("(*) Long");
            }
        } 
        catch (Exception e) {
            System.out.println(sc.next() + " no puede ser almacenado en ningun lado");
        }
        
        sc.close();
    }
}
