package BoletinFicheros7_3.Boletin7_XML.ExamenSimpsons;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
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

            System.out.println("\nEstas son las frases: ");
            for (int i = 0; i < capitulos.getLength(); i++) {
                Element capitulo = (Element) capitulos.item(i);
                String sinopsis = capitulo.getElementsByTagName("sinopsis").item(0).getTextContent();
                if (sinopsis.length() > 156) {
                    System.out.println(capitulo.getElementsByTagName("sinopsis").item(0).getTextContent() + " \n");
                }

            }

            boolean siEsta = false;
            String nombreBart = null;
            String nombreLisa = null;
            for (int i = 0; i < capitulos.getLength(); i++) {
                Element capitulo = (Element) capitulos.item(i);
                if (capitulo.getElementsByTagName("sinopsis").item(0).getTextContent().contains("Bart") || capitulo.getElementsByTagName("sinopsis").item(0).getTextContent().contains("Lisa")) {
                    nombreBart = capitulo.getElementsByTagName("sinopsis").item(0).getTextContent().replaceAll("Bart", "*Bart*");
                    nombreLisa = capitulo.getElementsByTagName("sinopsis").item(0).getTextContent().replaceAll("Lisa", "*Lisa*");
                    siEsta = true;

                }
            }
            Element newElement = documento.createElement("capitulo");
            newElement.setAttribute("temporada", String.valueOf(capitulos.getLength() + 1));
            Element newSinopsis = documento.createElement("sinopsis");
            newSinopsis.setTextContent("Esto es una prueba donde aparece " + nombreBart + " y se acaba");
            newSinopsis.setTextContent("Esto es una prueba donde aparece " + nombreLisa + " y se acaba");


            File f = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\ExamenSimpsons\\Simpsons2.html");

            // 2º Creamos una nueva instancia del transformador a través de la fábrica de
            // transformadores.

            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            // 3º Establecemos algunas opciones de salida, como por ejemplo, la codificación
            // de salida.

            transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            // 4º Creamos el StreamResult, que intermediará entre el transformador y el
            // archivo de destino.

            StreamResult result = new StreamResult(f);

            // 5º Creamos el DOMSource, que intermediará entre el transformador y el árbol
            // DOM.

            DOMSource source = new DOMSource(documento);

            // 6º Realizamos la transformación.

            transformer.transform(source, result);


        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            throw new RuntimeException(e);
        }

    }
}
