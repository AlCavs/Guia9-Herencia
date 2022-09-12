/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2extra.servicio;

import ejercicio2extra.entidades.Edificio;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    private final static Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ArrayList<Edificio> listitx = new ArrayList();

    public void Menu() {
        ServicioEdificio se = new ServicioEdificio();
        System.out.println("---------------B I E N V E N I D O S / A S ---------------");
        System.out.println("--------------- M  E N U ---------------");
        System.out.println("1- Cargargar los Edificios\n2- Mostrar el/la Superficie y el/la Volumen\n3- Mostrar Cantidad de Personas en oficina y el total del Edificio\n4- Mostrar cantidad de polideportivos Techados o/y/u/x no \n5- Salir ");
        System.out.println("Ingrese alguna opcion: ");
        String opc = sc.next();
        System.out.println("------------------------------");

        switch (opc) {
            case "1" -> {
                se.crearEdificio(listitx);
                Menu(); }
            case "2" -> {
                se.mostrar(listitx);
                Menu();
            }
            case"3"->{
                se.cantPersonas(listitx);
                Menu();
            }
            case"4"->{
                se.techado(listitx);
                Menu();
            }
            case"5"-> System.out.println("Gracias por tanto\nPerdon por tan poco");
            default-> {
                System.out.println("ES INVEZIL O SE CALLO DE LA CUNA? ELEGI BIENNNN BOLUDITO");
                Menu();
            }
                
            
                
        }
    }
}
