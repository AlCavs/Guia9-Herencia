/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public class Alquiler {
    private String nombre;
    private long docCliente;
    private int diasAlquiler;
    private int posicion;
    private Embarcacion barco;

    public Alquiler() {
    }

    public Alquiler(String nombre, long docCliente, int diasAlquiler, int posicion, Embarcacion barco) {
        this.nombre = nombre;
        this.docCliente = docCliente;
        this.diasAlquiler = diasAlquiler;
        this.posicion = posicion;
        this.barco = barco;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getDocCliente() {
        return docCliente;
    }

    public void setDocCliente(long docCliente) {
        this.docCliente = docCliente;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Embarcacion getBarco() {
        return barco;
    }

    public void setBarco(Embarcacion barco) {
        this.barco = barco;
    }
    
    
    
}
