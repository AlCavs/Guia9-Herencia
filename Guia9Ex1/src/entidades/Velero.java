/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public class Velero extends Embarcacion{
    private int mastiles;

    public Velero() {
    }

    public Velero(int mastiles) {
        
        this.mastiles = mastiles;
    }

  

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
     public void setPlus() {
        this.plus = mastiles;
    }

    @Override
    public int calcularModulo() {
        return (super.calcularModulo()+mastiles); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
     
     
    
}
