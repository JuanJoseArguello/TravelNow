package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Reserva {
    
    private int idReserva; 
    private LocalDateTime fechaReserva; 
    private LocalDateTime fechaViaje; 
    private double costoTotal; 
    private Paquete paquete;
    private MetodoPago metodoPago; 

    public Reserva(int idReserva, Paquete paquete, MetodoPago metodoPago, Double costoTotal) {
        this.idReserva = idReserva;
        this.paquete = paquete; 
        this.fechaReserva = LocalDateTime.now();
        this.fechaViaje = fechaReserva.plusDays(8);
        this.costoTotal = costoTotal; 
    }

    public int getIdReserva() {
        return idReserva;
    }

    public LocalDateTime getFechaReserva() {
        return fechaReserva;
    }

    public LocalDateTime getFechaViaje() {
        return fechaViaje;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public Paquete getPaquete() {
        return paquete;
    }

    public MetodoPago getMetodoPago() {
        return metodoPago;
    } 

    

    
}
