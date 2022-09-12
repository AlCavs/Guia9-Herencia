
package ejercicio2extra.entidades;

public class Polideportivo extends Edificio{
    private String nombre;
    private boolean techado;

    public Polideportivo() {
    }

    public Polideportivo(String nombre, boolean techado, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.nombre = nombre;
        this.techado = techado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isTechado() {
        return techado;
    }

    public void setTechado(boolean techado) {
        this.techado = techado;
    }

   

    @Override
    public double calcularSuperficie() {
        return (getAncho()*getLargo());
    }

    @Override
    public double calcularVolumnen() {
       return (getAncho()*getLargo()*getAlto());
    }
    
    
    
}
