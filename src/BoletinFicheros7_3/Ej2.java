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

            NodeList div = (NodeList) documento.getElementsByTagName("div").item(0);
            System.out.println("Numero de div de la pagWeb: " + div.getLength());

            NodeList divValores = (NodeList) documento.getElementsByTagName("id").item(0);
            System.out.println("Numero de div de la pagWeb: " + div.getLength());




        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println("Error de lectura o no ha sido encontrado");
        }
    }
}
