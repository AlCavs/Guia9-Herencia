/*Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.*/
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