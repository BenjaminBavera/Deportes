import java.util.ArrayList;
/**
 * Write a description of class Jugadores here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jugador
{
    private String nombre;
    private int sueldo;
   
   public Jugador(String nombre, int sueldo)
   {
     this.nombre = nombre;
     this.sueldo = sueldo;
    }  
    
    public int getSueldo()
    {
        return sueldo;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    
    public boolean equals(Jugador otro)
    {
        if (nombre == otro.nombre){
            if (sueldo == otro.sueldo){            
             } return true;
        } else {
            return false;
        } 
    }
}
