import java.util.ArrayList;
/**
 * Simula de manera muy simple el manejo administrativo de un deporte.
 * 
 * @author Benjamin Bavera 
 * @version 0.1
 */
public class Deporte
{
    private String deporte;
    public ArrayList<Jugador> jugadores;
    private int presupuesto;
    
    /**
     * Crea un objeto Deporte llamado Ajedrez con un presupuesto de 1000 y dos jugadores: Benja y Lucas, ambos con 500 de sueldo.
     */
    public Deporte()
    {
        deporte = "Ajedrez";
        presupuesto = 1000;
        jugadores = new ArrayList();
        jugadores.add(new Jugador("Benja",500));
        jugadores.add(new Jugador("Lucas",500));
    }
    
    /**
     * Crea un objeto Deporte con el nombre indicado y presupuesto 0.
     * precondicion: deporte no debe ser null o vacio..
     * @param deporte: es el nombre del deporte.
     */
    public Deporte(String deporte)
    {
        this.deporte = deporte;
        this.presupuesto = 0;
        jugadores = new ArrayList();
    }
    
    public void addPresupuesto(int cantidad)
    {
        presupuesto = presupuesto + cantidad;
    }
    
    public int getPresupuesto()
    {
        return presupuesto;
    }
    
    public void addJugador(Jugador jugador)
    {
        jugadores.add(jugador);
    }
    
    public int sueldoTotal()
    {
        int sueldoTotal = 0;
        for (Jugador jugador : jugadores){
            sueldoTotal = sueldoTotal + jugador.getSueldo();
        }
        return sueldoTotal;
    }
    
    public void pagarSueldos()
    {
        int presupuestoRestante = 0;
        if (presupuesto >= sueldoTotal()){
            presupuesto = presupuesto - sueldoTotal();
            System.out.println("Los sueldos han sido pagados. Sobran " + presupuestoRestante);
        } else {
            System.out.println("El presupuesto no alcanza");
        }
    }
    
    public void listAllJugadores()
    {
        System.out.println(deporte);
        for (Jugador jugador : jugadores){
            System.out.println("Nombre: " + jugador.getNombre() + 
                                    ". Sueldo: " + jugador.getSueldo());
        }
        System.out.println("Sueldo total: " + sueldoTotal());
    }
    
    public boolean isNull()
    {
        return (jugadores == null);
    }
}
