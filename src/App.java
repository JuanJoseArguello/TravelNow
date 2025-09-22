import java.time.LocalDateTime;
import java.util.Scanner;

import model.Agencia;

public class App {

    private static Agencia a = new Agencia(); 
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        String op = "";
        do {
            System.out.println("""
                    Selecciones una opción:
                    1. Registrar cliente
                    2. Ver paquetes de viaje disponibles
                    3. Crear una Reserva
                    4. Ver reservas de un cliente
                    5. Salir
                    """);
            op = sc.nextLine();
            switch (op) {
                case "1":
                    //regitrar cliente: 
                    System.out.println("Ingrese el nombre del cliente: ");
                    String nombre = sc.nextLine(); 
                    System.out.println("Ingrese el nombre del cliente: ");
                    String id = sc.nextLine(); 
                    System.out.println("Ingrese el nombre del cliente: ");
                    String correo = sc.nextLine(); 
                    System.out.println("Ingrese el nombre del cliente: ");
                    String telefono = sc.nextLine(); 
                    a.registrarCliente(nombre, id, correo, telefono);

                    break;

                case "2":
                    // mostrar paquetes disponibles: 
                    a.mostrarPaquetesDisponibles(); 
                    break;
                case "3":
                    // crear reserva: 
                    System.out.println("Ingrese el id del cliente: ");
                    String id1 = sc.nextLine(); 
                    System.out.println("Ingrese el id del paquete: ");
                    String idP = sc.nextLine(); 
                    a.crearReserva(id1, idP);
                    
                case "4":
                    // ver reservas cliente: 
                    break;
                case "5":
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (!op.equals("5"));

    }
}
