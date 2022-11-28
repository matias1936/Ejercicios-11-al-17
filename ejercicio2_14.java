package ejerciciosdel11al17;
 import java.util.Scanner;

public class ejercicio2_14{

 
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
       int diasdelmes=0;
       
        System.out.print("Introduzca el dia: ");
        int dia = sc.nextInt();
        System.out.println("Introduzca un mes del año: ");
        int mes= sc.nextInt();
        System.out.println("Introduzca el año: ");
        int año =sc.nextInt();

        if (mes == 2) {
            diasdelmes = 28;
        }
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasdelmes = 30;
            } 
                if (mes == 1 || mes ==3 || mes == 5 || mes == 7 || mes == 8 ||
                        mes == 10 || mes == 12) {
                    diasdelmes = 31;
                }
                
                       dia++;
       
       if (dia>diasdelmes) {
           dia = 1;
           mes++;
           if (mes > 12) {
              mes = 1;
               año++;
           }
       }
               if (año == 0 ) {
                   año = 1;
               }
               System.out.println(dia + "/" + mes + "/" + año);
           }
        
}
    