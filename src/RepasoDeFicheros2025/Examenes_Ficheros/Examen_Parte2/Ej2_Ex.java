package RepasoDeFicheros2025.Examenes_Ficheros.Examen_Parte2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.nio.file.Files;

public class Ej2_Ex {
    public static void main(String[] args) throws ParserConfigurationException, IOException, SAXException {
        File simpsonXml = new File(".\\src\\RepasoDeFicheros2025\\Examenes_Ficheros\\Examen_Parte2\\simpsons.xml");

        // Crear un objeto DocumentBuilderFactory
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        // Crear un objeto DocumentBuilder
        DocumentBuilder builder = factory.newDocumentBuilder();

        // Parsear el archivo XML y obtener el documento
        Document document = builder.parse(simpsonXml);
        Ap1(document);
        System.out.println("\n");
        Ap2(document);
        Ap3(document);

    }
    public static void Ap1(Document document) {
        NodeList nodeListCapitulos = document.getElementsByTagName("capitulo");
        for (int i = 0; i < nodeListCapitulos.getLength(); i++) {
            Node nodeCapitulo = nodeListCapitulos.item(i);
            if (nodeCapitulo.getNodeType() == Node.ELEMENT_NODE) {
                Element elementCapitulo = (Element) nodeCapitulo;

                String fechaEmision = elementCapitulo.getElementsByTagName("fecha_emision").item(0).getTextContent();
                String tituloCapitulo = elementCapitulo.getElementsByTagName("nombre").item(0).getTextContent();

                System.out.println("Titulo: " + tituloCapitulo + " ,Fecha de Emision: " + fechaEmision);

            }
        }
    }
    public static void Ap2(Document document) {
        try {
            // Crear un nuevo documento XML para guardar los capítulos filtrados
            DocumentBuilderFactory factory2 = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder2 = factory2.newDocumentBuilder();
            Document nuevoDocumento = builder2.newDocument();

            // Crear el nodo raíz <simpsons> en el nuevo documento
            Element rootElement = nuevoDocumento.createElement("simpsons");
            nuevoDocumento.appendChild(rootElement);

            // Obtener todos los nodos <capitulo> del documento original
            NodeList nodeListCapitulos = document.getElementsByTagName("capitulo");

            // Recorrer todos los capítulos
            for (int i = 0; i < nodeListCapitulos.getLength(); i++) {
                Node nodeCapitulo = nodeListCapitulos.item(i);

                if (nodeCapitulo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementCapitulo = (Element) nodeCapitulo;

                    // Obtener la sinopsis
                    String sinopsis = elementCapitulo.getElementsByTagName("sinopsis").item(0).getTextContent();

                    // Filtrar por sinopsis con más de 30 palabras
                    if (sinopsis.split("\\s+").length > 30) {
                        // Crear un nuevo nodo <capitulo> en el nuevo documento
                        Element nuevoCapitulo = nuevoDocumento.createElement("capitulo");

                        // Copiar los atributos temporada y episodio
                        nuevoCapitulo.setAttribute("temporada", elementCapitulo.getAttribute("temporada"));
                        nuevoCapitulo.setAttribute("episodio", elementCapitulo.getAttribute("episodio"));

                        // Crear y agregar los subelementos <nombre>, <sinopsis> y <fecha_emision>
                        Element nombre = nuevoDocumento.createElement("nombre");
                        nombre.appendChild(nuevoDocumento.createTextNode(elementCapitulo.getElementsByTagName("nombre").item(0).getTextContent()));
                        nuevoCapitulo.appendChild(nombre);

                        Element sinopsisElement = nuevoDocumento.createElement("sinopsis");
                        sinopsisElement.appendChild(nuevoDocumento.createTextNode(sinopsis));
                        nuevoCapitulo.appendChild(sinopsisElement);

                        Element fechaEmision = nuevoDocumento.createElement("fecha_emision");
                        fechaEmision.appendChild(nuevoDocumento.createTextNode(elementCapitulo.getElementsByTagName("fecha_emision").item(0).getTextContent()));
                        nuevoCapitulo.appendChild(fechaEmision);

                        // Agregar el nuevo nodo <capitulo> al nodo raíz
                        rootElement.appendChild(nuevoCapitulo);
                    }
                }
            }

            // Crear un objeto Transformer para escribir el documento XML a un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Configurar el Transformer para agregar espacios y saltos de línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            // Usar DOMSource para representar el documento
            DOMSource source = new DOMSource(nuevoDocumento);

            // Crear el archivo de salida
            StreamResult result = new StreamResult(new File(".\\src\\RepasoDeFicheros2025\\Examenes_Ficheros\\Examen_Parte2\\Pruebas_Xml\\capitulos_filtrados.xml"));

            // Escribir el archivo XML
            transformer.transform(source, result);

            System.out.println("Archivo XML generado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void Ap3(Document document) {
        try {
            // Crear un nuevo documento XML para guardar los capítulos filtrados
            DocumentBuilderFactory factory3 = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder3 = factory3.newDocumentBuilder();
            Document nuevoDocumento = builder3.newDocument();

            // Crear el nodo raíz <simpsons> en el nuevo documento
            Element rootElement = nuevoDocumento.createElement("simpsons");
            nuevoDocumento.appendChild(rootElement);

            // Obtener todos los nodos <capitulo> del documento original
            NodeList nodeListCapitulos = document.getElementsByTagName("capitulo");

            // Recorrer todos los capítulos
            for (int i = 0; i < nodeListCapitulos.getLength(); i++) {
                Node nodeCapitulo = nodeListCapitulos.item(i);

                if (nodeCapitulo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementCapitulo = (Element) nodeCapitulo;

                    // Obtener la sinopsis
                    String sinopsis = elementCapitulo.getElementsByTagName("sinopsis").item(0).getTextContent();
                    // Filtrar por sinopsis con más de 30 palabras
                    if (sinopsis.contains("Homer") || sinopsis.contains("Marge") || sinopsis.contains("Bart") || sinopsis.contains("Lisa") || sinopsis.contains("Maggie")) {

                        // Crear un nuevo nodo <capitulo> en el nuevo documento
                        Element nuevoCapitulo = nuevoDocumento.createElement("capitulo");

                        // Copiar los atributos temporada y episodio
                        nuevoCapitulo.setAttribute("temporada", elementCapitulo.getAttribute("temporada"));
                        nuevoCapitulo.setAttribute("episodio", elementCapitulo.getAttribute("episodio"));

                        // Crear y agregar los subelementos <nombre>, <sinopsis> y <fecha_emision>
                        Element nombre = nuevoDocumento.createElement("nombre");
                        nombre.appendChild(nuevoDocumento.createTextNode(elementCapitulo.getElementsByTagName("nombre").item(0).getTextContent()));
                        nuevoCapitulo.appendChild(nombre);

                        Element sinopsisElement = nuevoDocumento.createElement("sinopsis");
                        sinopsisElement.appendChild(nuevoDocumento.createTextNode(elementCapitulo.getElementsByTagName("sinopsis").item(0).getTextContent().replaceAll("\\b(Homer|Marge|Bart|Lisa|Maggie)\\b", "**$1**")));
                        nuevoCapitulo.appendChild(sinopsisElement);

                        Element fechaEmision = nuevoDocumento.createElement("fecha_emision");
                        fechaEmision.appendChild(nuevoDocumento.createTextNode(elementCapitulo.getElementsByTagName("fecha_emision").item(0).getTextContent()));
                        nuevoCapitulo.appendChild(fechaEmision);

                        // Agregar el nuevo nodo <capitulo> al nodo raíz
                        rootElement.appendChild(nuevoCapitulo);
                    }
                }
            }

            // Crear un objeto Transformer para escribir el documento XML a un archivo
            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();

            // Configurar el Transformer para agregar espacios y saltos de línea
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

            // Usar DOMSource para representar el documento
            DOMSource source = new DOMSource(nuevoDocumento);

            // Crear el archivo de salida
            StreamResult result = new StreamResult(new File(".\\src\\RepasoDeFicheros2025\\Examenes_Ficheros\\Examen_Parte2\\Pruebas_Xml\\capitulos_filtrados_PorNombres.xml"));

            // Escribir el archivo XML
            transformer.transform(source, result);

            System.out.println("Archivo XML generado exitosamente.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
