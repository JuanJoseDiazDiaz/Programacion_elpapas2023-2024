package RepasoDeFicheros2025.Ej_Avanzado.Ej8;

import java.io.*;

public class DivideGanaras {
    public static void main(String[] args) {
        File archivoApp = new File(".\\src\\RepasoDeFicheros2025\\Ej_Avanzado\\Ej8\\Prueba\\archivoDividir.txt");
        divideLineas(archivoApp);
    }

    public static void divideLineas(File archivoApp) {
        try(BufferedReader bf = new BufferedReader(new FileReader(archivoApp))) {
            String linea;
            while ((linea = bf.readLine()) != null) {
                if (linea.endsWith(".")){
                    File newFile = new File(".\\src\\RepasoDeFicheros2025\\Ej_Avanzado\\Ej8\\Prueba\\archivoDividido.txt");
                    try(BufferedWriter bw = new BufferedWriter(new FileWriter(newFile))) {
                        bw.write(linea);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
