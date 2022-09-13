package ejercicio3extra.entidades;

/**
 *
 * @author Chuky
 */
public class Residencias extends NoHoteles{
    private Integer cantHabitaciones;
    private boolean descuento;
    private boolean campoDeportivo;

    public Residencias() {
    }

    public Residencias(Integer cantHabitaciones, boolean descuento, boolean campoDeportivo, boolean privado, Double metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.cantHabitaciones = cantHabitaciones;
        this.descuento = descuento;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getCantHabitaciones() {
        return cantHabitaciones;
    }

    public void setCantHabitaciones(Integer cantHabitaciones) {
        this.cantHabitaciones = cantHabitaciones;
    }

    public boolean isDescuento() {
        return descuento;
    }

    public void setDescuento(boolean descuento) {
        this.descuento = descuento;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    @Override
    public String toString() {
        return super.toString()+"Residencias{" + "cantHabitaciones=" + cantHabitaciones + ", descuento=" + descuento + ", campoDeportivo=" + campoDeportivo + '}';
    }
    
    
    
}
