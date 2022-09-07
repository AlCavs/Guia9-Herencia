/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public final class Lavadora extends Electrodomestico{
    private int carga;

    public Lavadora(int carga, String color, String consumoEnergetico, double peso) {
        super(color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public Lavadora() {
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public void precioFinal(){
        super.comprobarConsumoEnergetico(getConsumoEnergetico());
        super.comprobarColor(getColor());
        super.precioFinal();
        
        if(carga>30){
            setPrecio(getPrecio()+500);
        }
    }
    
    @Override
    public String toString() {
        return "Lavadora{" + "capacidad de carga= " + carga + "kg, color= " + getColor() + ", precio= $" + getPrecio() + ", consumoEnergetico= " + getConsumoEnergetico() + ", peso= " + getPeso() +"kg}";

    }
    
}
