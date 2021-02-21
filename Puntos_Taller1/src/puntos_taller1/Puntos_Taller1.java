
package puntos_taller1;

import java.util.Scanner;


public class Puntos_Taller1 {

    


    public static void main(String[] args) {
        int opcion;
        Scanner entra= new Scanner(System.in);
        
        Empleados emp1= new Empleados();
        Estudiantes est1= new Estudiantes();
        
        System.out.println("\t Sistema de identidad universitario");
        System.out.println("Ingrese su cargo \n1.Empleado \n2Estudiante");
        opcion=entra.nextInt();
        switch (opcion){
            case 1:
                System.out.println("Ingrese su nombre: ");
                emp1.setNombre(entra.nextLine());
                System.out.println("Ingrese su fecha de nacimiento: ");
                emp1.setFecha(entra.nextLine());
                System.out.println("Ingrese su codigo: ");
                emp1.setCodigo(entra.nextLong());
                System.out.println("Ingrese su genero: ");
                emp1.setGenero(entra.nextLine());
                System.out.println("Ingrese su correo: ");
                emp1.setCorreo(entra.nextLine());
                System.out.println("Ingrese su salario: ");
                emp1.setSalario(entra.nextLong());
               
                
                System.out.println("\n\n\n\tLos datos que usted inglreso son:");
                System.out.println("Nombre: "+emp1.getNombre());
                System.out.println("Fecha de nacimiento: "+emp1.getFecha());
                System.out.println("Codigo: "+emp1.getCodigo());
                System.out.println("Genero:"+emp1.getGenero());
                System.out.println("Correo:"+emp1.getCorreo());
                System.out.println("Salario:"+emp1.getSalario());
                break;
            
            case 2:
                System.out.println("Ingrese su nombre: ");
                est1.setNombre(entra.nextLine());
                System.out.println("Ingrese su fecha de nacimiento: ");
                est1.setFecha(entra.nextLine());
                System.out.println("Ingrese su codigo: ");
                est1.setCodigo(entra.nextLong());
                System.out.println("Ingrese su genero: ");
                est1.setGenero(entra.nextLine());
                System.out.println("Ingrese su correo: ");
                est1.setCorreo(entra.nextLine());
                System.out.println("Ingrese su programa: ");
                est1.setPrograma(entra.nextLine());
                System.out.println("Ingrese su materia1: ");
                est1.setMateria1(entra.nextLine());
                System.out.println("Ingrese su materia2: ");
                est1.setMateria2(entra.nextLine());
                System.out.println("Ingrese su materia3: ");
                est1.setMateria3(entra.nextLine());
                System.out.println("Ingrese su materia4: ");
                est1.setMateria4(entra.nextLine());
                System.out.println("Ingrese su materia5: ");
                est1.setMateria5(entra.nextLine());
                
                
                System.out.println("Los datos que usted inglreso son:");
                System.out.println("Nombre: "+est1.getNombre());
                System.out.println("Fecha de nacimiento: "+est1.getFecha());
                System.out.println("Codigo: "+est1.getCodigo());
                System.out.println("Genero:"+est1.getGenero());
                System.out.println("Correo:"+est1.getCorreo());
                System.out.println("Programa:"+est1.getPrograma());
                System.out.println("Materia 1:"+est1.getMateria1());
                System.out.println("Materia 2:"+est1.getMateria2());
                System.out.println("Materia 3:"+est1.getMateria3());
                System.out.println("Materia 4:"+est1.getMateria4());
                System.out.println("Materia 5:"+est1.getMateria5());
                break;
        }
        
        
   
    }
    
}
