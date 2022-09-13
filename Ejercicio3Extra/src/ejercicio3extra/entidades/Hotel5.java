
package ejercicio3extra.entidades;

public class Hotel5 extends Hotel4{
    private Integer cantSalones;
    private Integer cantSuites;
    private Integer cantLimo;

    public Hotel5() {
    }

    public Hotel5(Integer cantSalones, Integer cantSuites, Integer cantLimo, String gimnasio, String nombRestaurant, Integer capacidadRestaurant, Integer cantidadHabitaciones, Integer numeroCamas, Integer cantPisos, Double precio, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombRestaurant, capacidadRestaurant, cantidadHabitaciones, numeroCamas, cantPisos, precio, nombre, direccion, localidad, gerente);
        this.cantSalones = cantSalones;
        this.cantSuites = cantSuites;
        this.cantLimo = cantLimo;
    }

    public Integer getCantSalones() {
        return cantSalones;
    }

    public void setCantSalones(Integer cantSalones) {
        this.cantSalones = cantSalones;
    }

    public Integer getCantSuites() {
        return cantSuites;
    }

    public void setCantSuites(Integer cantSuites) {
        this.cantSuites = cantSuites;
    }

    public Integer getCantLimo() {
        return cantLimo;
    }

    public void setCantLimo(Integer cantLimo) {
        this.cantLimo = cantLimo;
    }

    @Override
    public String toString() {
        return super.toString()+"Hotel5{" + "cantSalones=" + cantSalones + ", cantSuites=" + cantSuites + ", cantLimo=" + cantLimo + '}';
    }
    
    
    
}
