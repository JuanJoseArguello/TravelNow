package model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Agencia {
    private ArrayList<Cliente> clientes= new ArrayList<>(); 
    private ArrayList<Paquete> paquetes; 
    private ArrayList<Reserva> reservas= new ArrayList<>(); 
    private static int idReserva=0; 


    public Agencia(){
        this.clientes = new ArrayList<>(); 
        this.reservas = new ArrayList<>(); 
        this.paquetes = CargarPaquetes.loadPaquetes("src/persistence/PaquetesDeViaje.txt"); 

    }
    //métodos: 
    public void registrarCliente(String nombre, String id, String correo, String teléfono){
        Cliente cliente = new Cliente(nombre,id, correo, teléfono); 
        clientes.add(cliente); 
        System.out.println("Cliente registrado");
    }

    public void mostrarPaquetesDisponibles(){
        for (Paquete p : paquetes) {
            if (p.getCantidadDisponible()>0) {
                System.out.println(p);
            }
        }
    }

    public void crearReserva(String idCliente, String idPaquete){
        idReserva +=1; 
        Reserva r = new Reserva(idReserva, getPaquete(idPaquete), null, getCliente(idCliente).calcularCostoTotal()); 
        getPaquete(idPaquete).descontarCant();

        EscribirReservas.escribirReservas("src/persistence/Reservas.txt", reservas);
        
    }


    public Paquete getPaquete(String idPaquete){
        for (Paquete p : paquetes) {
            if (p.getIdPaquete().equals(idPaquete)) {
                return p; 
            }
        }
        return null; 
    }  

    public Cliente getCliente(String idCliente){
        for (Cliente c : clientes) {
            if (c.getId().equals(idCliente)) {
                return c; 
            }
        }
        return null; 
    }    

    public void crearMetodoDePago(){

    }

}
