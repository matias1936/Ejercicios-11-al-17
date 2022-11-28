
package ejerciciosdel11al17;
 import java.util.Scanner;

public class ejercicio2_13{

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int hora,minuto,segundo;
       
       System.out.print("Ingrese la hora: ");
       hora = sc.nextInt();
       System.out.print("Ingrese los minutos: ");
       minuto = sc.nextInt();
       System.out.print("Ingrese los segundos: ");
       segundo = sc.nextInt();
       
       segundo++;
       
       if (segundo>59) {
           segundo = 0;
           minuto++;
           if (minuto >59) {
               minuto = 0;
               hora++;
               if (hora >23 ) {
                   hora = 0;
               }
               }
           }
       System.out.println ("La hora mas 1 segundo es: " + hora + ":" + minuto + ":" + segundo);
    
    }
}
