import java.util.ArrayList;
/**
 * Simula a un jugador y su salario.
 * 
 * @author Benjamin Bavera
 * @version 0.1
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
