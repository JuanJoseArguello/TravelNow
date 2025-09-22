package model; 
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.util.ArrayList;

import model.Paquete;

public class CargarPaquetes {
    public static ArrayList<Paquete> loadPaquetes(String pathFile) {
        ArrayList<Paquete> paquetes = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(pathFile))) {
            String line;
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String idPaquete = parts[0];
                String destino = parts[1];
                double precio = Double.parseDouble(parts[2]);
                Byte cantDisponible = Byte.parseByte(parts[3]);
                paquetes.add(new Paquete(idPaquete,destino,precio,cantDisponible)); 
            }

        } catch (Exception e) {
            System.out.println("Error leyendo el archivo en cargarPaquetes: " + e.getMessage());
        }
        return paquetes;
    }
}