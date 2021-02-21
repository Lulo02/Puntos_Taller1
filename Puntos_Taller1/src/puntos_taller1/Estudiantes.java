
package puntos_taller1;

public class Estudiantes extends Persona{
  
    protected String programa;
    protected String materia1;

    
     public String getPrograma(){
        return programa;
    }
    
    public void setPrograma(String programa){
        this.programa=programa;
    }
    
     public String getMateria1(){
        return materia1;
    }
    
    public void setMateria1(String materia1){
        this.materia1=materia1;
    }

}
