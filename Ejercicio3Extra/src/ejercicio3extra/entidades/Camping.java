package ejercicio3extra.entidades;

/**
 *
 * @author Chuky
 */
public class Camping extends NoHoteles{
    private Integer capacidadCarpas;
    private Integer cantBanios;
    private boolean restaurant;

    public Camping() {
    }

    public Camping(Integer capacidadCarpas, Integer cantBanios, boolean restaurant, boolean privado, Double metros, String nombre, String direccion, String localidad, String gerente) {
        super(privado, metros, nombre, direccion, localidad, gerente);
        this.capacidadCarpas = capacidadCarpas;
        this.cantBanios = cantBanios;
        this.restaurant = restaurant;
    }

    public Integer getCapacidadCarpas() {
        return capacidadCarpas;
    }

    public void setCapacidadCarpas(Integer capacidadCarpas) {
        this.capacidadCarpas = capacidadCarpas;
    }

    public Integer getCantBanios() {
        return cantBanios;
    }

    public void setCantBanios(Integer cantBanios) {
        this.cantBanios = cantBanios;
    }

    public boolean isRestaurant() {
        return restaurant;
    }

    public void setRestaurant(boolean restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public String toString() {
        return super.toString()+"Camping{" + "capacidadCarpas=" + capacidadCarpas + ", cantBanios=" + cantBanios + ", restaurant=" + restaurant + '}';
    }
    
    
    
}
