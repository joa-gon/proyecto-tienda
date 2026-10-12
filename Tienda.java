/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectotienda;

/**
 *
 * @author Joaquinks
 */


public class Tienda {
    private String nombre;
    private double caja;

    public Tienda(String nombre, double cajaInicial) {
        this.nombre = nombre;
        this.caja = cajaInicial;
    }

    public void mostrarEstado() {
        System.out.println("Tienda: " + nombre + " | Caja: $" + caja);
    }

    public static void main(String[] args) {
        // Inicializamos la tienda con un proyecto de ejemplo
        Tienda miTienda = new Tienda("KS Digital", 15000.0);
        miTienda.mostrarEstado();
    }
}
