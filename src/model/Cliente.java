package model;

import java.util.ArrayList;

public class Cliente{

    //atributos: 
    private String id; 
    private String nombre; 
    private String correo; 
    private String telefono;
    private ArrayList<Reserva> reservas; 

    //constructor: 
    public Cliente(String nombre, String id, String correo, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
    }


    //métodos: 

    public String getId() {
        return id;
    } 

    public double calcularCostoTotal(){
        double costoTotal=0; 
        for (Reserva r : reservas) {
            costoTotal += r.getPaquete().getPrecioBase(); 
        }
        return costoTotal; 
    }
    
    

    
    
}