package poo_2;

public class Empleado{

    private String nombre;
    private int cuit;
    private String genero;
    private String direccion;
    private int telefono;
    private int cantHijos;
    

    public String getNombre() {
        return nombre;
    }

    public int getCuit() {
        return cuit;
    }

    public String getGenero() {
        return genero;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public int getCantHijos() {
        return cantHijos;
    }

   

    public Empleado(String nombre, int cuit, String genero, String direccion, int telefono, int cantHijos) {
        this.nombre = nombre;
        this.cuit = cuit;
        this.genero = genero;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cantHijos = cantHijos;
  
       
    }


   

    public String mostrarDatos(){
        return"nombre: " + nombre + "\nCUIT: " + cuit + "\nGenero: " + genero + "\nDireccion: " + direccion + "\nTelefono: " + telefono + "\nCantidad de hijos: " + cantHijos;
    }
}