/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inv2.prototype;

/**
 *
 * @author truez
 */
public abstract class TV implements Cloneable {

    private String marca;
    private int pulgadas;
    private String color;
    private double precio;

    public TV(String marca, int pulgadas, String color, double precio) {
        this.color = color;
        this.pulgadas = pulgadas;
        this.marca = marca; 
        this.precio = precio;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        String info;
        info = "Marca: " + this.marca;
        info += "\nPulgadas: " + this.pulgadas;
        info += "\nColor: " + this.color;
        info += "\nPrecio: " + this.precio;
        return info;
    }

}
