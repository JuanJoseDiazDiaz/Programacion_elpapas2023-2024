package RecuperacionFicheros2024;


import java.io.*;
import java.nio.file.Files;
import java.util.IllegalFormatCodePointException;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExamenRecuperacion {
    public static void main(String[] args) {
        File ficheroRuta = new File("C:\\Users\\Alumno\\IdeaProjects\\Ejercicios\\src\\RecuperacionFicheros2024\\files.txt");
        File ficheroPrueba = new File("C:\\Users\\Alumno\\IdeaProjects\\Ejercicios\\src\\RecuperacionFicheros2024\\prueba");

        try {
            validacionLinea(ficheroRuta);
            caracterEspecifico(ficheroRuta, ficheroPrueba);

        } catch (ErrorExamenException e) {
            System.out.println("Error " + e.getMessage());
        }
        informacionFichero(ficheroRuta, ficheroPrueba);
    }

    public static void validacionLinea(File ficheroRuta) throws ErrorExamenException {
        try (BufferedReader br1 = new BufferedReader(new FileReader(ficheroRuta))) {
            String linea;
            while ((linea = br1.readLine()) != null) {
                Pattern pattern = Pattern.compile("[\\?\\*\\$#]");
                Matcher matcher = pattern.matcher(linea.replace(",", " "));
                if (matcher.find()) {
                } else {
                    throw new ErrorExamenException("Error, el valor no es valido");
                }
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void caracterEspecifico(File ficheroRuta, File ficheroPrueba) throws ErrorExamenException {
        try (BufferedReader br2 = new BufferedReader(new FileReader(ficheroRuta))) {
            String linea;
            while ((linea = br2.readLine()) != null) {
                Pattern pattern = Pattern.compile("[C:\\\\\\/]");
                Matcher matcher = pattern.matcher(linea.replace(",", " "));
                File[] files = ficheroPrueba.listFiles();
                for (int i = 0; i < files.length; i++) {
                    while (matcher.find()) {
                        if (matcher.toMatchResult().toString().startsWith("?")) {
                            if (!files[i].exists()) {
                                throw new ErrorExamenException("Error, no existe");
                            }else {
                                System.out.println(files[i].getName() + " existe ");
                            }
                        }
                        if (matcher.toMatchResult().toString().startsWith("*")) {
                            if (Files.isRegularFile(files[i].toPath())) {
                                System.out.println(files[i].toPath().getFileName() + "su peso es: " + files[i].length() + " KB ");
                            }

                        }
                        if (matcher.toMatchResult().toString().startsWith("$")) {
                            if (files[i].isDirectory()) {
                                if (files[i].toString().endsWith(".jpg") || files[i].toString().endsWith(".avi") || files[i].toString().endsWith(".png")) {
                                    System.out.println("Es valido");
                                } else {
                                    throw new ErrorExamenException("No es valido por: " + files[i].getName() + " porque no lleva punto");
                                }
                            }

                        }
                        if (matcher.toMatchResult().toString().startsWith("#")) {
                            System.out.println("Comentario: " + linea);
                        }
                    }
                }

            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    public static void informacionFichero(File filePrueba, File fileRuta) {
        try (BufferedReader br3 = new BufferedReader(new FileReader(filePrueba))) {
            String linea;
            while ((linea = br3.readLine()) != null) {
               File[] files = fileRuta.listFiles();
               for (File file : files){
                   System.out.println(file.getName()+" " + file.length() +" "+ "KB" );
                   if (file.toString().endsWith(".txt")){
                       System.out.println(file.getName()+" " + file.length() +" "+ "KB" + br3.readLine() );
                       break;
                   }
                   break;
               }
            }

        } catch (IOException e) {
            System.out.println("Error"+ e.getMessage());
        }
    }


}
