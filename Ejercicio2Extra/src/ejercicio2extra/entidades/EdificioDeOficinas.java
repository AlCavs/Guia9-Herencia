package ejercicio2extra.entidades;


public class EdificioDeOficinas extends Edificio{
    private Integer cantPersonas;
    private Integer cantPisos;
    private Integer cantOficinas;

    public EdificioDeOficinas() {
    }

    public EdificioDeOficinas(Integer cantPersonas, Integer cantPisos, Integer cantOficinas, Double ancho, Double alto, Double largo) {
        super(ancho, alto, largo);
        this.cantPersonas = cantPersonas;
        this.cantPisos = cantPisos;
        this.cantOficinas = cantOficinas;
    }

    public Integer getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(Integer cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public Integer getCantPisos() {
        return cantPisos;
    }

    public void setCantPisos(Integer cantPisos) {
        this.cantPisos = cantPisos;
    }

    public Integer getCantOficinas() {
        return cantOficinas;
    }

    public void setCantOficinas(Integer cantOficinas) {
        this.cantOficinas = cantOficinas;
    }

    @Override
    public double calcularSuperficie() {
         return (getAncho()*getLargo());
    }

    @Override
    public double calcularVolumnen() {
     return (getAncho()*getLargo()*getAncho());
    }
    
    

}
