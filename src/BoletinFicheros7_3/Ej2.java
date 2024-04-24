package BoletinFicheros7_3;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Ej2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(".\\src\\BoletinFicheros7_3\\web1.html");

            Element e = documento.getDocumentElement();

            Element titulo = (Element) e.getElementsByTagName("title").item(0);
            System.out.println("Este es el nombre del titulo de la pagWeb: " + titulo.getTextContent());

            NodeList div = documento.getElementsByTagName("div");
            System.out.println("Numero de div de la pagWeb: " + div.getLength());

            NodeList divValores = documento.getElementsByTagName("div");
            int contDivValores = 0;
            for (int i = 0; i < divValores.getLength(); i++){
                Element element = (Element) divValores.item(i);
                if (!element.getAttribute("id").isBlank()){
                    contDivValores++;
                }
            }
            System.out.println("Numero de div con valores de la pagWeb: " + contDivValores);

            NodeList imgValores = documento.getElementsByTagName("img");
            for (int i = 0; i < imgValores.getLength(); i++){
                Element element = (Element) imgValores.item(i);
                if (!element.getAttribute("alt").isBlank()){
                    System.out.println("El texto es el siguiente: " + element.getAttribute("alt"));
                }
            }

            NodeList todosLosDiv = documento.getElementsByTagName("div");
            for (int i = 0; i < todosLosDiv.getLength(); i++){
                Element element = (Element) todosLosDiv.item(i);
                if (element.getAttribute("class").equals("noticia")){
                   String titular = element.getElementsByTagName("h2").item(0).getTextContent();
                    System.out.println("Este es el titular de la noticia: "+ titular);
                    String textoAlT =((Element) element.getElementsByTagName("img").item(0)).getAttribute("alt");
                    System.out.println("Este es el texto alternativo de la imagen: "+ textoAlT);


                }

            }











        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error de lectura o no ha sido encontrado");
        }
    }
}
