
package puntos_taller1;


public class Persona {
    
    
    private String nombre;
    private String fecha;
    private long codigo;       
    private String genero;       
    private String correo;               

   
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha=fecha;
    }
    
    public long getCodigo(){
        return codigo;
    }
    
    public void setCodigo(long codigo){
        this.codigo=codigo;
    }
    
    public String getGenero(){
        return genero;
    }
    
    public void setGenero(String genero){
        this.genero=genero;
    }
    
    public String getCorreo(){
        return correo;
    }
    
    public void setCorreo(String correo){
        this.correo=correo;
    }
    
    
}
