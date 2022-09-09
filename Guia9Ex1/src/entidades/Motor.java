/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//import interfaces.calcularModulo;

/**
 *
 * @author NiLe
 */
public class Motor extends Embarcacion{
    private int potenciaCV;

    public Motor() {
    }
     
//
//    public Motor(int potenciaCV, String matricula, int eslora, int añoFabricacion, int modulo, int plus) {
//        super(matricula, eslora, añoFabricacion, modulo, plus);
//        this.potenciaCV = potenciaCV;
//    }

    public Motor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
        
    }


    public int getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }
    public void setPlus() {
        this.plus = potenciaCV;
    }

    @Override
    public String toString() {
        return "Motor{" + "potenciaCV=" + potenciaCV + " matricula "+getMatricula()+" }";
    }
    
    

    
    
//    @Override
//    public int modulo() {
//       return (getModulo()+ potenciaCV);
//    }

    @Override
    public int calcularModulo() {
        return (super.calcularModulo()+potenciaCV); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
    
}
