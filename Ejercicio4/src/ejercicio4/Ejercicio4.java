
package ejercicio4;

import ejercicio4.entidades.Circulo;
import ejercicio4.entidades.Rectangulo;

public class Ejercicio4 {

    public static void main(String[] args) {
        Circulo c1 = new Circulo(10d,5d);
        System.out.println("El area de circulo es: "+ c1.calcularArea());
        System.out.println("El perimetro de circulo es: "+ c1.calcularPerimetro());
        Rectangulo r1 = new Rectangulo(20d,10d);
        System.out.println("El area de rectangulo es: "+ r1.calcularArea());
        System.out.println("El perimetro de rectangulo es: "+ r1.calcularPerimetro());
    }
    
}
