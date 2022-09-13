
package ejercicio3extra.entidades;

/**
 Hotel **** Cantidad de Habitaciones, Número de camas, Cantidad de Pisos, Gimnasio,
Nombre del Restaurante, Capacidad del Restaurante, Precio de las Habitaciones.
 */
public class Hotel4 extends Hoteles{
    protected String gimnasio;
    protected String nombRestaurant;
    protected Integer capacidadRestaurant;

    public Hotel4() {
    }

    public Hotel4(String gimnasio, String nombRestaurant, Integer capacidadRestaurant, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantPisos, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantPisos, precio, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombRestaurant = nombRestaurant;
        this.capacidadRestaurant = capacidadRestaurant;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public String getNombRestaurant() {
        return nombRestaurant;
    }

    public void setNombRestaurant(String nombRestaurant) {
        this.nombRestaurant = nombRestaurant;
    }

    public Integer getCapacidadRestaurant() {
        return capacidadRestaurant;
    }

    public void setCapacidadRestaurant(Integer capacidadRestaurant) {
        this.capacidadRestaurant = capacidadRestaurant;
    }
    

    @Override
    public String toString() {
        return super.toString()+"Hotel4{" + "gimnasio=" + gimnasio + ", nombRestaurant=" + nombRestaurant + ", capacidadRestaurant=" + capacidadRestaurant + '}';
    }
    
    
    
    
}
