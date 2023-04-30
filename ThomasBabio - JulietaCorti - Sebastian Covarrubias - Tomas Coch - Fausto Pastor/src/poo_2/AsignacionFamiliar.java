
package poo_2;


public class AsignacionFamiliar {
    private int cantHijos;
    private double valorH = 11.465;

    public AsignacionFamiliar(int cantHijos) {
        this.cantHijos = cantHijos;
    }
    public double getAf(){
        return cantHijos * valorH;
    } 

    public int getCantHijos() {
        return cantHijos;
    }

    public double getValorH() {
        return valorH;
    }

    public void setCantHijos(int cantHijos) {
        this.cantHijos = cantHijos;
    }

    public void setValorH(double valorH) {
        this.valorH = valorH;
    }
  

    
    
    
}
