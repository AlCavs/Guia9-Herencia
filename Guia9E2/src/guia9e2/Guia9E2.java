/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9e2;

import entidades.Lavadora;
import entidades.Televisor;
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
        System.out.println("Ingreso Lavadora");
        Lavadora l = se.crearLavadora();       
        l.precioFinal();
        System.out.println(l);
        System.out.println("----------------");
        System.out.println("Ingreso TV");
        Televisor t = se.crearTelevisor();
        t.precioFinal();
        System.out.println(t);
    }
    
}
