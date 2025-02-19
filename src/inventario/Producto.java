package inventario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Clase que representa un producto con nombre, precio y stock.
 * Proporciona métodos para acceder y modificar sus atributos.
 * 
 * @author Salima
 * @version 1.0
 * @since 2025
 */
public class Producto {
    private String nombre;
    private double precio;
    private int stock;
    
    /**
     * Método de fábrica para crear un producto.
     * 
     * @param nombre El nombre del producto.
     * @param precio El precio del producto.
     * @param stock La cantidad en stock del producto.
     * @return Un nuevo objeto de tipo Producto.
     */
public static Producto crearProducto(String nombre, double precio, int stock) {
    Producto producto = new Producto();
    producto.nombre = nombre;
    producto.precio = precio;
    producto.stock = stock;
    return producto;
}
    
    /**
     * Muestra la información del producto en la consola.
     */
    public void mostrarInformacion() {
        System.out.println("Producto: " + getNombre() + " | Precio: " + getPrecio() + " | Stock: " + getStock());
    }


    /**
     * Obtiene el nombre del producto.
     * 
     * @return Nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

     /**
     * Establece un nuevo nombre para el producto.
     * 
     * @param nombre Nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     * 
     * @return precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece un nuevo precio para el producto.
     * 
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

     /**
     * Obtiene la cantidad en stock del producto.
     * 
     * @return La cantidad en stock.
     */
    public int getStock() {
        return stock;
    }

    /**
     * Establece una nueva cantidad en stock para el producto.
     * 
     * @param stock La nueva cantidad en stock.
     */
    public void setStock(int stock) {
        this.stock = stock;
    }
}