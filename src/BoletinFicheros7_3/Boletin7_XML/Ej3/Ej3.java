package BoletinFicheros7_3.Boletin7_XML.Ej3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Ej3 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej3\\desayuno.html");

            Element e = documento.getDocumentElement();

            NodeList platos = documento.getElementsByTagName("food");
            double precioBase = 5;
            System.out.println("platos con menos de 5 euros: ");
            for (int i = 0; i < platos.getLength(); i++) {
                Element plato = (Element) platos.item(i);
              String textoPrecio =  plato.getElementsByTagName("price")
                        .item(0)
                        .getTextContent()
                        .replaceAll(",", ".");

              double precio = Double.parseDouble(textoPrecio.substring(0, textoPrecio.length() -1));
              if (precio < precioBase ){
                  System.out.println(plato.getElementsByTagName("name").item(0).getTextContent());
              }
            }
            System.out.println("\n");

            platos = documento.getElementsByTagName("food");
            int caloriasBase = 500;
            System.out.println("platos con menos de 500 calorias: ");
            for (int i = 0; i < platos.getLength(); i++) {
                Element plato = (Element) platos.item(i);
                String textoCaloria =  plato.getElementsByTagName("calories")
                        .item(0)
                        .getTextContent()
                        .replaceAll(",", ".");

                int calorias = Integer.parseInt(textoCaloria);
                if (calorias < caloriasBase){
                    System.out.println(plato.getElementsByTagName("name").item(0).getTextContent());
                }
            }


        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error, lo siento No se ha encontrado el archivo");
        }
    }
}
