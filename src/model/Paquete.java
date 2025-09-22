package model; 

public class Paquete {
    //atributos: 
    private String idPaquete; 
    private String destino; 
    private double precioBase; 
    private byte cantidadDisponible; 

    

    public Paquete(String idPaquete, String destino, double precioBase, byte cantidadDisponible) {
        this.idPaquete = idPaquete;
        this.destino = destino;
        this.precioBase = precioBase;
        this.cantidadDisponible = cantidadDisponible;
    }

    //métodos: 
    public void descontarDisponibilidad(){

    }
    
    @Override
    public String toString() {
        return "PaqueteDeViaje [idPaquete=" + idPaquete + ", destino=" + destino + ", precioBase=" + precioBase
                + ", cantidadDisponible=" + cantidadDisponible + "]";
    }

    public byte getCantidadDisponible() {
        return cantidadDisponible;
    }

    public String getIdPaquete() {
        return idPaquete;
    }

    public void descontarCant(){
        cantidadDisponible -= cantidadDisponible; 
    }

    public String getDestino() {
        return destino;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    

}
