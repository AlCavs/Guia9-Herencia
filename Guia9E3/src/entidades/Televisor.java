/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public class Televisor extends Electrodomestico{
    private int pulgadas;
    private boolean tdt;

    public Televisor() {
    }

    public Televisor(int pulgadas, boolean tda, String color, String consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.pulgadas = pulgadas;
        this.tdt = false;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isTdt() {
        return tdt;
    }

    public void setTdt(boolean tdt) {
        this.tdt = tdt;
    }

@Override
public void precioFinal(){
    super.comprobarColor(getColor());
    super.comprobarConsumoEnergetico(getConsumoEnergetico());
    super.precioFinal();
    
    if (pulgadas>40){
        setPrecio(getPrecio()*1.3);
    }
    if(tdt){
        setPrecio(getPrecio()+500);
    }
}

    @Override
    public String toString() {
       String antena;
        if(tdt){
            antena = "si";
        }else{
           antena = "no";
        }
        return "Televisor{" + "pulgadas=" + pulgadas + ", tdt=" + antena + ", color= " + getColor() + ", precio= $" + getPrecio() + ", consumoEnergetico= " + getConsumoEnergetico() + ", peso= " + getPeso() +"kg}";
    }
    
    
}
