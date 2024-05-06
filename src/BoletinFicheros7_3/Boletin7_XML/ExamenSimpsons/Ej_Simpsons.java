package BoletinFicheros7_3.Boletin7_XML.ExamenSimpsons;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Ej_Simpsons {
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\ExamenSimpsons\\Simpsons.html");

            Element e = documento.getDocumentElement();

            NodeList capitulos = (NodeList) documento.getElementsByTagName("capitulo");
            for (int i = 0; i < capitulos.getLength(); i++){
                Element capitulo = (Element) capitulos.item(i);


            }

        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }

    }
}
