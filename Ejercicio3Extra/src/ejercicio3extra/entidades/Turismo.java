
package ejercicio3extra.entidades;

import java.util.ArrayList;
import java.util.Comparator;

public class Turismo {             
    private ArrayList<Hoteles> listaHoteles;
    private ArrayList<NoHoteles> listaNoHoteles;

    public Turismo() {
    }

    public Turismo(ArrayList<Hoteles> listaHoteles, ArrayList<NoHoteles> listaNoHoteles) {
        this.listaHoteles = listaHoteles;
        this.listaNoHoteles = listaNoHoteles;
    }

    public ArrayList<Hoteles> getListaHoteles() {
        return listaHoteles;
    }

    public void setListaHoteles(ArrayList<Hoteles> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    public ArrayList<NoHoteles> getListaNoHoteles() {
        return listaNoHoteles;
    }

    public void setListaNoHoteles(ArrayList<NoHoteles> listaNoHoteles) {
        this.listaNoHoteles = listaNoHoteles;
    }

    public static Comparator<Hoteles> comparador = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles o1, Hoteles o2) {
            return o1.getPrecio().compareTo(o2.getPrecio());
        }
    };
}
