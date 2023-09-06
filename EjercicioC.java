import java.util.Scanner;

public class EjercicioC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioAA, calificación, aumento = 0; 

        System.out.print("Ingresa el salario actual: ");
        salarioAA= sc.nextDouble();

        System.out.print("Ingresa la calificación de desempeño: ");
        calificación = sc.nextDouble();

        if(calificación==1){
            aumento = (salarioAA * 0.06);
        }else if(calificación == 2){
            aumento = (salarioAA * 0.04);
        }else if(calificación == 3){
            aumento = (salarioAA * 0.15);
        }else{
            System.out.println("Calificacion no registrada");
        }
    
        System.out.println("Su aumento es de: S/" + (salarioAA * 0.06) + " soles.");
        System.out.println("Su nuevo salario es de: S/" + (salarioAA + aumento) + " soles.");
    
        sc.close();
    }
}          
