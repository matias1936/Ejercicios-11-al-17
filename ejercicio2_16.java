package ejerciciosdel11al17;
 import java.util.Scanner;

public class ejercicio2_16{ 

 
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Por favor ingrese un numero del 0 al 99: ");
        int num = sc.nextInt();
        if (10 <= num && num <=15) {
            switch (num) {
                case 10 -> System.out.println("Diez");
                    case 11 -> System.out.println("Once");
                    case 12 -> System.out.println("Doce");
                    case 13 -> System.out.println("Trece");
                    case 14 -> System.out.println("Catorce");
                    case 15 -> System.out.println("Quince");
                    
            }
        } else {
            int unidades = num % 10;
            int decenas = num / 10;
            switch (decenas) {
                case 0: 
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("Dieci");
                    break;
                    case 2:
                    System.out.println("Veinte");
                    break;
                    case 3:
                    System.out.println("Treinta");
                    break;
                    case 4:
                    System.out.println("Cuarenta");
                    break;
                    case 5:
                    System.out.println("Cincuenta");
                    break;
                    case 6:
                    System.out.println("Sesenta");
                    break;
                    case 7:
                    System.out.println("Setenta");
                    break;
                    case 8:
                    System.out.println("Ochenta");
                    break;
                    case 9:
                    System.out.println("Noventa");
                    break;
                    
            }
            if (decenas != 0 && decenas != 1
                    && unidades != 0) {
                System.out.println("y");
            }
               switch (unidades) {
                   case 0 -> {
                       if (decenas == 0 ) {
                           System.out.println("Cero");
                       }
                }
                   case 1 -> System.out.println("uno");
                   case 2 -> System.out.println("dos");
                   case 3 -> System.out.println("tres");
                   case 4 -> System.out.println("cuatro");
                   case 5 -> System.out.println("cinco");
                   case 6 -> System.out.println("seis");
                   case 7 -> System.out.println("siete");
                   case 8 -> System.out.println("ocho");
                   case 9 -> System.out.println("nueve");
               }
               } 
            }
        }