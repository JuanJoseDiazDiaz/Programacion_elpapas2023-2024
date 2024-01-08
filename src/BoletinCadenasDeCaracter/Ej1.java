package BoletinCadenasDeCaracter;

public class Ej1 {
    public static void main(String[] args) {
        String cadena = "Hola gente";
        char caract = 'o';
        System.out.println("en la cadena ("+cadena+") la letra o, se repite unas "+contarCadena(cadena, caract)+ " veces");
    }
    public static int contarCadena(String cadena, char a){
        int cont = 0;
        for (int i = 0 ; i < cadena.length(); i ++){
            if (cadena.toLowerCase().charAt(i) == Character.toLowerCase(a)){
                cont++;
            }
        }
        return cont;
    }
}
