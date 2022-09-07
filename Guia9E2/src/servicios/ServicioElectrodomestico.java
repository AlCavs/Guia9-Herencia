/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Electrodomestico;
import entidades.Lavadora;
import entidades.Televisor;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class ServicioElectrodomestico {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public void crearElectrodomestico(Electrodomestico e) {
        System.out.println("Ingrese el color del aparato");
        e.setColor(sc.next());
        System.out.println("Ingrese el tipo de consumo electrico entre A y F");
        e.setConsumoEnergetico(sc.next());
        System.out.println("Ingrese el peso del producto");
        e.setPeso(sc.nextDouble());

    }

    public Lavadora crearLavadora() {

        Lavadora l = new Lavadora();
        crearElectrodomestico(l);

        System.out.println("Ingrese la capacidad de carga de la lavadora");
        l.setCarga(sc.nextInt());

        return l;
    }
    public Televisor crearTelevisor(){
        
        Televisor t = new Televisor();
        crearElectrodomestico(t);
        
        System.out.println("Ingrese el tamaño en pulgadas del Televisor");
        t.setPulgadas(sc.nextInt());
        System.out.println("Tiene antena integrada para television abierta? 1 - Si 2 - No");
        int resp = sc.nextInt();
        
        switch (resp) {
            case 1:
                t.setTdt(true);
                break;
            case 2:
                t.setTdt(false);
                break;
            default:
                System.out.println("Ingresó una opcion incorrecta");
                
                break;
        }
        return t;
    }

}
