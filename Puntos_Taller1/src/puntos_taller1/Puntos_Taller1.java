
package puntos_taller1;

import java.util.Scanner;


public class Puntos_Taller1 {

    


    public static void main(String[] args) {
        
        Scanner entra= new Scanner(System.in);
        
        Persona p2= new Persona(); 
        Estudiantes e1= new Estudiantes();
        
        p2.setNombre(entra.nextLine());
        System.out.println(p2.nombre);
        e1.setNombre(entra.nextLine());
        System.out.println(e1.nombre);
    }
    
}
