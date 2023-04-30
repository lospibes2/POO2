
package poo_2;

import java.util.Scanner;


public class Ejecutable {

   static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
    String nombre, direccion, genero, cargo;
    int cuit, telefono, cantHijos;
    
        
        System.out.println("Ingrese el nombre del empleado: ");
        nombre = teclado.next();
        System.out.println("Ingrese el CUIT: ");
        cuit = teclado.nextInt();
        System.out.println("Ingrese el genero: ");
        genero = teclado.next();
        System.out.println("Ingrese la direccion: ");
        direccion = teclado.next();
        System.out.println("Ingrese el telefono: ");
        telefono = teclado.nextInt();
        System.out.println("Ingrese la cantidad de hijos: ");
        cantHijos = teclado.nextInt();
        System.out.println("Ingrese el caro: ");
        cargo = teclado.next();
        AsignacionFamiliar asignacionFamiliar = new AsignacionFamiliar(cantHijos);
        Empleado empleado = new Empleado(nombre, cuit, genero, direccion, telefono, cantHijos);
        Sueldo sueldo = new Sueldo(asignacionFamiliar.getAf(), cargo, empleado);
        ReciboHaberes reciboHaberes = new ReciboHaberes(empleado, sueldo);
        reciboHaberes.MostrarRecibo();
    }
    
}
