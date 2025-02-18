/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * @terbah salima
 */
public class Producto {
    public String n;
    public double p;
    public int s;

    public Producto(String nombre, double precio, int stock) {
        this.n = nombre;
        this.p = precio;
        this.s = stock;
    }

    public void mostrarInformacion() {
        System.out.println("Producto: " + n + " | Precio: " + p + " | Stock: " + s);
    }

    public void borrarDatos() {
        n = "";
        p = 0.0;
        s = 0;
    }
}