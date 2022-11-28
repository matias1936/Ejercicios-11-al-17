
package ejerciciosdel11al17;
 import java.util.Scanner;

public class Notas{

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nota;
        System.out.println ("Ingrese la calificación.");
        nota = sc.nextInt();
        
        if (0 <= nota && nota < 5) {
            System.out.println("Insuficiente");
        } else if (nota==5) {
            System.out.println ("Suficiente");
        } else if (nota == 6) {
            
              System.out.println ("Bien");
                 } else if (nota==7 || nota == 8) {
                     
            System.out.println ("Notable");
             } else if (nota==9 || nota == 10) {
                     
            System.out.println ("Sobresaliente");
             } else {
                 System.out.println("La nota ingresada no es valida");
            
              
        }
        }
    
    }
    

