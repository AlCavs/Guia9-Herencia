/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public abstract class Embarcacion {
    protected String matricula;
    protected int eslora;
    protected int añoFabricacion;
    protected int modulo;
    protected int plus;

    
    
    public int getModulo() {
        return modulo;
    }   

    public Embarcacion() {
    }

    public Embarcacion(String matricula, int eslora, int añoFabricacion, int modulo, int plus) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.añoFabricacion = añoFabricacion;
        this.modulo = modulo;
        this.plus = plus;
    }

    public int getPlus() {
        return plus;
    }

    public void setPlus(int plus) {
        this.plus = plus;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
  public int calcularModulo(){
      modulo = (eslora*10);
      return modulo;
  }

}
