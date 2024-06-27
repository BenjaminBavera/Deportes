import java.util.ArrayList;

/**
 * Simula a un jugador y su salario.
 * 
 * @author KulilinWP
 * @version 0.1
 */
public class Jugador
{
    private String nombre;
    private int sueldo;
    
    /**
     * Crea un objeto Jugador con el nombre indicado y sueldo indicado.
     * precondicion: nombre no debe ser null o vacio y sueldo no debe ser menor que 0.
     * @param nombre: es el nombre del jugador.
     * @param sueldo: es el suelo del jugador.
     */
    public Jugador(String nombre, int sueldo)
   {
     if (nombre == null) throw new IllegalArgumentException("nombre no debe ser null");
     if (nombre.length() == 0) throw new IllegalArgumentException("nombre no debe ser vacio");
     if (sueldo < 0) throw new IllegalArgumentException("sueldo no debe ser menor que 0");   
     this.nombre = nombre;
     this.sueldo = sueldo;
    }  

    /**
     * Retorna el sueldo del jugador.
     */
    public int getSueldo()
    {
        return sueldo;
    }
    
    /**
    * Retorna el nombre del jugador. 
    */
    public String getNombre()
    {
        return nombre;
    }

    /**
    * Retorna true si un jugador es igual a otro.
    * Precondicion: otro no debe ser null
    * @param otro: es el jugador con el cual queremos comparar.
    */
    
    public boolean equals(Jugador otro)
    {
        if (otro == null) throw new IllegalArgumentException("otro no debe ser null");
        if (nombre == otro.nombre){
            if (sueldo == otro.sueldo){  
                return true;
            } 
            else {
                return false;
            }
        } else {
            return false;
        } 
    }
}
