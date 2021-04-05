
package calificaciones;

import java.util.Scanner;
public class Calificaciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        String nombre;
        int cal1, cal2, cal3, cal4, cal5, promedio;
        
        System.out.println("Ingrese el nombre del alumno");
        nombre = entrada.nextLine();
        
        System.out.println("Ingresa la primera calificacion del alumno:");
        cal1 = entrada.nextInt();
        
        System.out.println("Ingresa laH segunda calificacion del alumno:");
        cal2 = entrada.nextInt();
        
        System.out.println("Ingresa la tercera calificacion del alumno:");
        cal3 = entrada.nextInt();
        
        System.out.println("Ingresa la cuarta calificacion del alumno:");
        cal4 = entrada.nextInt();
        
        System.out.println("Ingresa la quinta calificacion del alumno:");
        cal5 = entrada.nextInt();
        
        promedio = (cal1+cal2+cal3+cal4+cal5) / 5;
        
        System.out.println("Nombre del estudiante: " +nombre);
        
        System.out.println("Calificación 1: " +cal1);
        
        System.out.println("Calficacion 2: " +cal2);
        
        System.out.println("Calficacion 3: " +cal3);
        
        System.out.println("Calficacion 4: " +cal4);
        
        System.out.println("Calficacion 5: " +cal5);
        
        System.out.println("Promedio: " +promedio);
        
        if (promedio <= 50) {
            System.out.println("Calificación: F"); 
        }
        
        if ((promedio > 51) && (promedio <= 60)) {
            System.out.println("Calificación: E"); 
        }
        
        if ((promedio > 61) && (promedio <= 70)) {
            System.out.println("Calificación: D"); 
        }
        
        if ((promedio > 71) && (promedio <= 80)) {
            System.out.println("Calificación: C"); 
        }
        
         if ((promedio > 81) && (promedio <= 90)) {
            System.out.println("Calificación: B"); 
        }
        
          if ((promedio > 91) && (promedio <= 100)) {
            System.out.println("Calificación: A"); 
        }
    }
    
}
