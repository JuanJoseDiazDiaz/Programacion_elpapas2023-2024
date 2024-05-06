package BoletinFicheros7_3.Boletin7_XML.ExamenSimpsons;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.stream.Stream;

public class Ej_Simpsons {
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\ExamenSimpsons\\Simpsons.html");

            Element e = documento.getDocumentElement();

            NodeList capitulos = documento.getElementsByTagName("capitulo");
            for (int i = 0; i < capitulos.getLength(); i++) {
                Element capitulo = (Element) capitulos.item(i);
                String fechaEmision = capitulo.getElementsByTagName("fecha_emision").item(0).getTextContent();
                if (fechaEmision.length() >= 4) {
                    int year = Integer.parseInt(fechaEmision.substring(fechaEmision.length() - 4));
                    if (year > 1992) {
                        System.out.println("\n" + capitulo.getElementsByTagName("nombre").item(0).getTextContent());
                        System.out.println(fechaEmision);
                    }
                }
            }

            for (int i = 0; i < capitulos.getLength();i++){
                Element capitulo = (Element) capitulos.item(i);
                String sinopsis = capitulo.getElementsByTagName("sinopsis").item(0).getTextContent();
                if (sinopsis.length() >= 4){
                    int recuentoLetra = Integer.parseInt(sinopsis.substring(sinopsis.length()));
                    if (recuentoLetra > 30){
                        System.out.println(sinopsis);
                    }

                }

            }


        } catch (ParserConfigurationException | IOException | SAXException e) {
            throw new RuntimeException(e);
        }

    }
}
