/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Alquiler;
//import entidades.Embarcacion;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class ServicioAlquiler {
    Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Alquiler crearAlquiler(){
        Alquiler a = new Alquiler();
        
        System.out.println("Ingrese el nombre del cliente");
        a.setNombre(sc.next());
        System.out.println("Ingrese el documento del cliente");
        a.setDocCliente(sc.nextLong());
        System.out.println("Ingrese la cantidad de dias a alquilar");
        a.setDiasAlquiler(sc.nextInt());
        System.out.println("Ingrese la posicion del amarre");
        a.setPosicion(sc.nextInt());
        
        System.out.println("DATOS DEL FLOTANTE");
        
        ServicioEmbarcacion se = new ServicioEmbarcacion();
        a.setBarco(se.crearEmbarcacion());
        
        precioAlquiler(a);
        
        return a;
    }
    
    public void precioAlquiler(Alquiler a){
        System.out.println("El precio del alquiler es: $" + (a.getBarco().calcularModulo()*a.getDiasAlquiler() ));
    }
}
