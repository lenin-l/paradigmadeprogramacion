/*
* implemente un algoritmo que nos permita ingresar lainformacion en base al paper:
-requerimientos funcionales
-requerimientos no funcionales
-diseño orientado a objetos
-abstraccion
 */
package javaapplication14;

/**
 *
 * @author USUARIO
 */
import java.util.Scanner;
public class JavaApplication14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("\n\tIngrese el nombre de la Universidad");
        System.out.println("\n\tCarrera Ingeniería Automotriz");
        System.out.println("\nAlumno: Lenin Carrillo ");

        Scanner objeto=new Scanner (System.in);
        System.out.println("\tINGRESE SUS REQUERIMIENTOS FUNCIONALES");
        String requerimientos=objeto.nextLine();
        
        System.out.println("\tINGRESE SUS REQUERIMIENTOS NO FUNCIONALES");
        String requerimientosNo=objeto.nextLine();
        
        System.out.println("\tINGRESE SUS DISEñO ORIENTADO A OBJETOS");
        String objetos=objeto.nextLine();
      
        System.out.println("\tINGRESE ABSTRACCION");
        String requerimientos=objeto.nextLine();
        
        
    }
    
}
