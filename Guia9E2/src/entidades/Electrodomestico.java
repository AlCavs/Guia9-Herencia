/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author NiLe
 */
public class Electrodomestico {

    protected String color;
    protected double precio = 1000;
    protected String consumoEnergetico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(String color, String consumoEnergetico, double peso) {
        this.color = color;
        
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
      
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    protected void comprobarConsumoEnergetico(String letra) {

        if (!letra.equalsIgnoreCase("A") && !letra.equalsIgnoreCase("B") && !letra.equalsIgnoreCase("C") && !letra.equalsIgnoreCase("D") && !letra.equalsIgnoreCase("E") && !letra.equalsIgnoreCase("F")) {
            setConsumoEnergetico("F");
        } else {
            setConsumoEnergetico(letra.toUpperCase());
        }

    }

    protected void comprobarColor(String color) {

        if (!color.equalsIgnoreCase("blanco") && !color.equalsIgnoreCase("negro") && !color.equalsIgnoreCase("gris") && !color.equalsIgnoreCase("azul") && !color.equalsIgnoreCase("rojo")) {
            setColor("Blanco");
        } else {
            setColor(color);
        }
    }

    public void precioFinal() {

        String op = getConsumoEnergetico().toUpperCase();

        Double aux = getPeso();

        switch (op) {
            case "A":
                setPrecio(getPrecio() + 1000);
                break;
            case "B":
                setPrecio(getPrecio() + 800);
                break;
            case "C":
                setPrecio(getPrecio() + 600);
                break;
            case "D":
                setPrecio(getPrecio() + 500);
                break;
            case "E":
                setPrecio(getPrecio() + 300);

                break;
            case "F":
                setPrecio(getPrecio() + 100);

                break;

            default:
                System.out.println("Indice de consumo inexistente");
                throw new AssertionError();
        }
        if (aux >= 1 && aux <= 19) {
            setPrecio(getPrecio() + 100);
        } else if (aux >= 20 && aux <= 49) {
            setPrecio(getPrecio() + 500);
        } else if (aux >= 50 && aux <= 79) {
            setPrecio(getPrecio() + 800);
        } else {
            setPrecio(getPrecio() + 1000);
        }

    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "color=" + color + ", precio=" + precio + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso + '}';
    }

}
