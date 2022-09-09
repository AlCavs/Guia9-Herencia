/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Embarcacion;
import entidades.Motor;
import entidades.Velero;
import entidades.Yate;
import java.util.Scanner;

/**
 *
 * @author NiLe
 */
public class ServicioEmbarcacion {

    Scanner sc = new Scanner(System.in).useDelimiter("\n");

    public Embarcacion crearEmbarcacion() {

        System.out.println("Ingrese el tipo de barco: \n1 - A motor\n2 - Velero\n3 - Yate de lujo");
        String op = sc.next();
        Embarcacion e = null;

        switch (op) {
            case "1":
                Motor m = new Motor();
                datos(m);
                System.out.println("Ingrese los caballos de vapor");
                m.setPotenciaCV(sc.nextInt());
                
                
                e = m;                
                break;
            case "2":
                Velero v = new Velero();
                datos(v);
                System.out.println("Ingrese la cantidad de mastiles");
                v.setMastiles(sc.nextInt());
                
                e = v;
                break;
            case "3":
                Yate y = new Yate();
                datos(y);
                System.out.println("Ingrese la potencia de los caballos de vapor");
                y.setPotenciaCV(sc.nextInt());
                System.out.println("Ingrese la cantidad de camarotes");
                y.setCamarotes(sc.nextInt());
                
                e = y;
                break;
            default:
                System.out.println("ERROR");
        }
        return e;
    }

    public void datos(Embarcacion e) {

        System.out.println("Ingrese la matricula del navío");
        e.setMatricula(sc.next());
        System.out.println("Ingrese la medida de la eslora");
        e.setEslora(sc.nextInt());
        System.out.println("Ingrese el año de fabricacion");
        e.setAñoFabricacion(sc.nextInt());
    }
}
