import java.util.ArrayList;
/**
 * Simula de manera muy simple el manejo administrativo de un deporte.
 * 
 * @author KulilinWP
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
     * precondicion: deporte no debe ser null o vacio.
     * @param deporte: es el nombre del deporte.
     */
    public Deporte(String deporte)
    {
        if (deporte == null) throw new IllegalArgumentException("deporte no debe ser null");
        if (deporte.length() == 0) throw new IllegalArgumentException("deporte no debe ser vacio");
        this.deporte = deporte;
        this.presupuesto = 0;
        jugadores = new ArrayList();
    }
    
    public void addPresupuesto(int monto)
    {
        presupuesto = presupuesto + monto;
    }
    
    /**
     * Retorna el presupuesto del deporte.
     */
    public int obtenerPresupuesto()
    {
        return presupuesto;
    }

    /**
     * Agrega un jugador a la lista en la ultima posicion.
     * Precondicion: jugador no debe ser null.
     * Postcondicion: jugador se encuentra en la ultima posicion de la lista.
     * @param jugador: es el jugador que queremos agregar.
     */
    public void addJugador(Jugador jugador)
    {
        if (jugador == null) throw new IllegalArgumentException("jugador no debe ser null");
        jugadores.add(jugador);
        assert jugador.equals(jugadores.get(jugadores.size()-1));
    }
    
     /**
     * Se paga el sueldo de todos los jugadores.
     * Al presupuesto se le resta el sueldo total.
     */
    public void pagarSueldos()
    {
        if (presupuesto - sueldoTotal() < 0) throw new IllegalStateException("El presupuesto no alcanza");
        presupuesto = presupuesto - sueldoTotal();
        System.out.println("Los sueldos han sido pagados. Sobran " + presupuesto);
    }
    
    /**
     * Retorna la suma de todos los sueldos de los jugadores.
     */
    private int sueldoTotal()
    {
        int sueldoTotal = 0;
        for (Jugador jugador : jugadores){
            sueldoTotal = sueldoTotal + jugador.getSueldo();
        }
        return sueldoTotal;
    }

    /**
     * Imprime la lista de todos los jugadores con sus respectivos sueldos solamente si no esta vacia.
     * precondicion: jugadores no debe ser vacia.
     */
    public void listAllJugadores()
    {
        if (jugadores.size() == 0) throw new IllegalStateException("No hay ningun jugador en la lista");
        System.out.println(deporte);
        for (Jugador jugador : jugadores){
            System.out.println("Nombre: " + jugador.getNombre() + 
                                    ". Sueldo: " + jugador.getSueldo());
        }
        System.out.println("Sueldo total: " + sueldoTotal());
    }
    
}
