package boletinString;

import java.util.Arrays;

public class StringIndexof {
    public static void main(String[] args) {
      String a = "voy a ver a mi abuela";
       int contador = 0;
       int lastIndex = 0;
       while (a.indexOf("a",lastIndex) != -1){
           if (lastIndex == 0 ){
               contador++;
           }
           else{
               if (a.charAt(lastIndex-1) == ' '){
                   contador++;
               }
           }
           lastIndex++;
       }
        System.out.println("en la frase  "+ a +" hay "+ contador +" palabras que empiezan por a");
    }
}
