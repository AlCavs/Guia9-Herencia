/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4.entidades;

import ejercicio4.interfaces.calculoFormas;


public class Rectangulo implements calculoFormas{
    private Double la1;
    private Double la2;

    public Rectangulo(Double la1, Double la2) {
        this.la1 = la1;
        this.la2 = la2;
    }
    
    

    @Override
    public Double calcularPerimetro() {
        return (la1+la2)*2;
    }

    @Override
    public Double calcularArea() {
       return la1*la2;
    }
}
