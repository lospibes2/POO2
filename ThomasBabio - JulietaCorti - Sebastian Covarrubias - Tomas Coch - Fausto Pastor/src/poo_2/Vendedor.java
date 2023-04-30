/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

/**
 *
 * @author julie
 */
public class  Vendedor extends Empleado {
    private double cantVendida;
    public Vendedor(String nombre, int cuit, String genero, String direccion, int telefono, int cantHijos, double cantVendida) {
        super(nombre, cuit, genero, direccion, telefono, cantHijos);
        this.cantVendida = cantVendida;
    
    }

    public double getCantVendida() {
        return cantVendida;
    }
    
}
