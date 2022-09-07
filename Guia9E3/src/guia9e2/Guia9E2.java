/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9e2;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.ArrayList;
import servicios.ServicioElectrodomestico;

/**
 *
 * @author NiLe
 */
public class Guia9E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicioElectrodomestico se = new ServicioElectrodomestico();
//        System.out.println("Ingreso Lavadora 1");
//        Lavadora l = se.crearLavadora();
//        //   l.precioFinal();    
//        System.out.println("----------------");
//        System.out.println("Ingreso TV 1 ");
//        Televisor t = se.crearTelevisor();
//        // t.precioFinal();
//        System.out.println("----------------");
//        System.out.println("Ingreso Lavadora 2");
//        Lavadora la = se.crearLavadora();
//        //  la.precioFinal();       
//        System.out.println("----------------");
//        System.out.println("Ingreso TV 2 ");
//        Televisor te = se.crearTelevisor();
//        //  te.precioFinal();
        ArrayList<Electrodomestico> lista = new ArrayList();

        for (int i = 0; i < 2; i++) {
            System.out.println("Ingresa lavadora "+ (i+1));
            Lavadora l = se.crearLavadora();
            lista.add(l);
            System.out.println("Ingresa televisor "+ (i+1));        
            Televisor t = se.crearTelevisor();
            lista.add(t);
        }
        
        double suma = 0;
        
        for (Electrodomestico aux : lista) {
            aux.precioFinal();            
            System.out.println(aux.getPrecio());
            suma = suma + aux.getPrecio();
            System.out.println(aux);
        }
        
        System.out.println("La suma total de los electrodomesticos es: " + suma);

    }

}
