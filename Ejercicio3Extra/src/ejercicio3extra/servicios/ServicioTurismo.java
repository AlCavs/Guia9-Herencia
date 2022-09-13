package ejercicio3extra.servicios;

import ejercicio3extra.entidades.Alojamiento;
import ejercicio3extra.entidades.Camping;
import ejercicio3extra.entidades.Hotel4;
import ejercicio3extra.entidades.Hotel5;
import ejercicio3extra.entidades.Hoteles;
import ejercicio3extra.entidades.NoHoteles;
import ejercicio3extra.entidades.Residencias;
import ejercicio3extra.entidades.Turismo;
import java.util.ArrayList;

public class ServicioTurismo {
    
    public void agregarAlojamiento(Turismo x){
        
        Hotel4 h1 = new Hotel4("b", "coma rico", 1, 1, 1, 1, 50d, "Hotelucho", "pro ahi cerca", "ChEhhmhhhhBaS", "Gramajitooo yulian");
        Hotel4 h2 = new Hotel4("a", "coma algo", 300, 20, 6, 4, 50d, "Hoteluchitoo", "alla lejos", "muy muy lejos", "un tipo");
        Hotel5 h3 = new Hotel5(5, 5, 10, "b", "comer", 50, 15, 5, 10, 50d, "Hostelito", "Calle de los enamorados", "San juan", "Macri");
        Camping c1 = new Camping(10, 2, true, true, 30d, "Fernando Chiquito", "Egg", "Egg x 2", "Ivo");
        Residencias r1 = new Residencias(3, true, true, false, 30d, "para viejos", "no importa", "cielo", "Dios");
        
        ArrayList<Hoteles> a = new ArrayList();
        ArrayList<NoHoteles> b = new ArrayList();
        a.add(h1);
        a.add(h2);
        a.add(h3);
        b.add(c1);
        b.add(r1);
        x.setListaHoteles(a);
        x.setListaNoHoteles(b);
        precioAgredo(x);

        
    }
    
    private void precioAgredo(Turismo x){
        for (Hoteles h : x.getListaHoteles()) {
            h.setPrecio(h.getPrecio()+(h.getCantidadHabitaciones()*h.getNumeroCamas()));
            if (h instanceof Hotel5) {
                Hotel5 aux = (Hotel5) h;
                
                if (aux.getCapacidadRestaurant()<30) {
                    h.setPrecio(h.getPrecio()+10);
                }else if(aux.getCapacidadRestaurant()>=30 && aux.getCapacidadRestaurant()<=50){
                    h.setPrecio(h.getPrecio()+30);
                }else{
                    h.setPrecio(h.getPrecio()+50);              
            }
                if(aux.getGimnasio().equalsIgnoreCase("a")){
                    h.setPrecio(h.getPrecio()+50);
                }else{
                    h.setPrecio(h.getPrecio()+30);
                }
                
                h.setPrecio(h.getPrecio()+(15*(aux.getCantLimo())));
        }
             if (h instanceof Hotel4) {
                Hotel4 aux = (Hotel4) h;
                if (aux.getCapacidadRestaurant()<30) {
                    h.setPrecio(h.getPrecio()+10);
                }else if(aux.getCapacidadRestaurant()>=30&&aux.getCapacidadRestaurant()<=50){
                    h.setPrecio(h.getPrecio()+30);
                }else{
                    h.setPrecio(h.getPrecio()+50);              
            }
                if(aux.getGimnasio().equalsIgnoreCase("a")){
                    h.setPrecio(h.getPrecio()+50);
                }else{
                    h.setPrecio(h.getPrecio()+30);
                }
            
             }
    }
    }    
    
    
    public void mostrarNoHoteles(Turismo x){
        System.out.println("Lista de restaurantes con camping y descuento con residencias");
        for (NoHoteles aux : x.getListaNoHoteles()) {
            if (aux instanceof Camping) {
                Camping c = (Camping) aux;
                
                if(c.isRestaurant()){
                    System.out.println(c);
                }
            }
            if (aux instanceof Residencias) {
                Residencias object = (Residencias) aux;
                if(object.isDescuento()){
                    System.out.println(object);
                }
            }
        }
    }
    public void mostrar(Turismo x){
        System.out.println("Lista  hoteles");
        for (Hoteles object : x.getListaHoteles()) {
            System.out.println(object);
        }
        System.out.println("Lista no hoteles");
        for (NoHoteles listaNoHotele : x.getListaNoHoteles()) {
            System.out.println(listaNoHotele);
        }
    }
}
