import java.util.ArrayList;
/**
 * Simula un club (de nombre AABN) En el cual hay deportes y jugadores.
 * 
 * @author KulilinWP 
 * @version 0.1
 */
public class AABN
{
    private ArrayList<Deporte> deportes;
    private int presupuestoTotal;
    
    /**
     * Crea un objeto AABN con el presupuesto indicado.
     * precondicion: presupuesto debe ser positivo.
     * postcondicion: presupuesoTotal es igual que presupuesto
     * @param presupuesto: es el presupueso inicial del club.
     */
    public AABN(int presupuesto)
    {
        if (presupuesto < 0) throw new IllegalArgumentException("Presupuesto no puede ser negativo");
        deportes = new ArrayList();
        presupuestoTotal = presupuesto;
        assert presupuestoTotal == presupuesto;
    }
    
    /**
     * Aumenta el presupuesto del deporte seleccionado
     * Precondicion: cantidad tiene que ser positiva y no puede darse mas presupuesto del presupuesto total.
     * Postcondicion: dismininuye el presupuesto total.
     * @param deporte: es el deporte al cual le damos presupuesto.
     * @param cantidad: es la cantidad de presupuesto que queremos dar.
     */
    public void darPresupuesto(Deporte deporte, int cantidad)
    {
        if (cantidad < 0) throw new IllegalArgumentException("cantidad no puede ser menor a 0");
        if (cantidad > presupuestoTotal) throw new IllegalArgumentException("cantidad no puede ser mayor que el presupuestoTotal");
        int presupuestoAnterior = presupuestoTotal;
        deporte.addPresupuesto(cantidad);
        presupuestoTotal = presupuestoTotal - cantidad;
        assert presupuestoAnterior > presupuestoTotal;
    }
    
    /**
     * Añade un deporte a la lista.
     * precondicion: deporte no debe ser null.
     * postcondicion: se agrega deporte a la lista.
     * @param deporte: es el deporte que queremos añadir.
     */
    public void addDeporte(Deporte deporte)
    {
        if (deporte == null) throw new IllegalArgumentException("Deporte no debe ser null.");
        deportes.add(deporte);
        assert deportes.contains(deporte);
    }
    
    /**
     * Aumenta el presupuesto del club.
     * precondicion: presupuesto tiene que ser mayor que 0.
     * postcondicion: presupuestoAnterior es menor que presupuestoTotal.
     * @param presupuesto: es el presupuesto que queremos añadir.
     */
    public void addPresupuesto(int presupuesto)
    {
        if (presupuesto <= 0) throw new IllegalArgumentException("presupuesto debe ser mayor a 0.");
        int presupuestoAnterior = presupuestoTotal;
        presupuestoTotal = presupuestoTotal + presupuesto;
        assert(presupuestoAnterior < presupuestoTotal);
    }
    
    /**
     * Imprime los detalles de cada deporte.
     * La lista deporte que sea null no sera impresa.
     * Precondicion: la lista deportes no debe estar vacia.
     */
    public void listAllDeportes()
    {
        if (deportes.size() == 0) throw new IllegalStateException("No hay ningun deporte en la lista");
        for (Deporte deporte : deportes){
            if (!deporte.isNull()){
                Deporte imprimirDeporte = deporte;
                deporte.listAllJugadores();
            }
        }
    }
}    
