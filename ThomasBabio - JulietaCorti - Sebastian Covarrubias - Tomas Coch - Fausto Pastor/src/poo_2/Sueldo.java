/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo_2;

import java.util.Scanner;

public class Sueldo {

    private double obraSocial;
    private double jubilacion;
    private double presentismo;
    private double asignacionFamiliar;
    private String cargo;
    private Empleado empleado;   
    
    public Sueldo(  double asignacionFamiliar, String cargo, Empleado empleado) {
        this.empleado = empleado;
        this.asignacionFamiliar = asignacionFamiliar;
        this.cargo = cargo;
        
    }

    public void emitir(){
        System.out.println("Sueldo neto: " + this.calcSueldoN());
        System.out.println("Sueldo basico: " + this.calcSueldoB());
        System.out.println("Obra social: " + obraSocial + "\n JubilaciÃ³n: " + jubilacion + "/n Presentismo: " + presentismo + "/n AsignaciÃ³n Familiar: " + asignacionFamiliar);
        System.out.println("");
    }
    
    public double calcSueldoB(){
        double sb = 0.0;
        if (cargo.equals("Panadero")){
            sb = 98000;
        }
        if (cargo.equals("Repostero")){
            sb = 110000;
        }
        if (cargo.equals("Vendedor")){
            sb = 70000;
        }
        return sb;
    }
    
    public double calcSueldoN(){
        
        String pres ;
        String obra ;
        int edad = 0;
        Scanner teclado = new Scanner(System.in);
        double sn = 0;
        this.jubilacion = (calcSueldoB() * 11 / 100);
        this.obraSocial = (calcSueldoB() * 3 / 100);
        this.presentismo = (calcSueldoB() * 10 / 100);
        double valH = 11.465;
        
        
        System.out.println("Ingrese la edad: ");
        edad = teclado.nextInt();
        if (edad > 60){
            sn = sn - this.jubilacion;
        }
        
        System.out.println("Posee obra social?: ");
        obra = teclado.next();
        if ("si".equalsIgnoreCase(obra)){
            sn = sn - this.obraSocial;
        }
        
        
        if (this.empleado.getCantHijos() > 0){
            sn = sn + (valH * this.empleado.getCantHijos());
        }
        
        System.out.println("Respetis el presentismo?: ");
        pres = teclado.next();
        if("si".equalsIgnoreCase(pres)){
            sn = sn + this.presentismo;
        }
        
        
        if("hombre".equals(this.empleado.getGenero())){
            plusHombre();
        }
        
        return sn;
        
    }
    
     public double plusHombre(){
         double plusRepostero = 0;
         
        if (cargo.equals("Repostero")){
        plusRepostero += 110000*10 / 100;
        }
        else{
            plusRepostero =0;
        }
        return plusRepostero;
     }
 
     
    
}