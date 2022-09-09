/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public class Yate extends Embarcacion{
    private int potenciaCV;
    private int camarotes;

    public Yate() {
    }

    public Yate(int potenciaCV, int camarotes, String matricula, int eslora, int añoFabricacion, int modulo, int plus) {
        super(matricula, eslora, añoFabricacion, modulo, plus);
        this.potenciaCV = potenciaCV;
        this.camarotes = camarotes;
    }


  
    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }
     public void setPlus() {
        this.plus = potenciaCV;
    }

    @Override
    public int calcularModulo() {
        return (super.calcularModulo()+potenciaCV+camarotes); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
}
