package inventario;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
/**
 * Clase que gestiona el inventario de productos.
 * Permite agregar productos y mostrarlos en pantalla.
 * 
 * @author Salima
 * @version 1.0
 * @since 2025
 */
public class Inventario {
    public ArrayList<Producto> listaProductos;

    
    /**
     * Constructor de la clase Inventario.
     * Inicializa la lista de productos.
     */
    public Inventario() {
        listaProductos = new ArrayList<>();
    }
    
    /**
     * Agrega un producto al inventario.
     * 
     * @param p El producto a agregar.
     */
    public void agregar(Producto p) {
        listaProductos.add(p);
    }
    
    /**
     * Muestra la lista de productos en el inventario.
     */
    public void mostrar() {
        for (int i = 0; i < listaProductos.size(); i++) {
            listaProductos.get(i).mostrarInformacion();
        }
    }
    
     /**
     * Método principal que ejecuta el programa y prueba el inventario.
     * 
     * @param args Argumentos de línea de comandos (no utilizados).
     */

    public static void main(String[] args) {
        Inventario inventario = new Inventario();
        Producto p1 = Producto.crearProducto("Laptop", 1200.99, 10);
        Producto p2 = Producto.crearProducto("Mouse", 25.50, 50);
        
        inventario.agregar(p1);
        inventario.agregar(p2);
        
        System.out.println("Inventario de productos:");
        inventario.mostrar();


    }
}