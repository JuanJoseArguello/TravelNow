package model;
import java.io.*;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class EscribirReservas {

    public static void escribirReservas(String filePath, ArrayList<Reserva> reservas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("IdReserva,fechaReserva,fechaVaije,costoTotal,idPaquete,IdmetodoPago\n");
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
            for (Reserva r : reservas) {
                String line = r.getIdReserva() + "," + // nombre cliente
                        r.getFechaReserva().format(formatter) + "," + // fecha entrada
                        r.getFechaViaje().format(formatter) + "," + // fecah salida
                        r.getCostoTotal()+","+
                        r.getPaquete().getIdPaquete(); 
                        r.getMetodoPago().getIdPago(); 
                bw.write(line + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
