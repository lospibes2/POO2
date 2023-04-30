package poo_2;


public class ReciboHaberes {
    private Empleado empleado;
    private Sueldo sueldo;
    
   
    
    public ReciboHaberes(Empleado empleado, Sueldo sueldo){
        this.empleado = empleado;
        this.sueldo = sueldo;
        
    }
    public void MostrarRecibo(){
        System.out.println("Empleado: " + this.empleado.mostrarDatos() + "\nSueldo: " + this.sueldo.calcSueldoN());
        
    }
 } 