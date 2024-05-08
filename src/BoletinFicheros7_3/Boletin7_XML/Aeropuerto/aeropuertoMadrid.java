package Aeropuerto;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.util.jar.JarEntry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class aeropuertoMadrid {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document documento = db.parse(".\\src\\Aeropuerto\\aeropuerto.html");

            Element e = documento.getDocumentElement();

            Element newElement = documento.createElement("vuelo");
            Element newId = documento.createElement("id");
            newId.setTextContent(":");
            newElement.appendChild(newId);
            Element newCodigo = documento.createElement("codigo");
            newCodigo.setTextContent(":");
            newElement.appendChild(newCodigo);
            Element newcompania = documento.createElement("compania");
            newcompania.setTextContent(":");
            newElement.appendChild(newcompania);
            Element newhora_salida = documento.createElement("hora_salida");
            newhora_salida.setTextContent(":");
            newElement.appendChild(newhora_salida);

            documento.getDocumentElement().appendChild(newElement);

            // 1º Creamos una instancia de la clase File para acceder al archivo donde
            // guardaremos el XML.

            File f = new File(".\\src\\Aeropuerto\\aeropuerto2.html");

            // 2º Creamos una nueva instancia del transformador a través de la fábrica de
            // transformadores.

            Transformer transformer = TransformerFactory.newInstance().newTransformer();

            // 3º Establecemos algunas opciones de salida, como por ejemplo, la codificación
            // de salida.

            //transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            // 4º Creamos el StreamResult, que intermediará entre el transformador y el
            // archivo de destino.

            StreamResult result = new StreamResult(f);

            // 5º Creamos el DOMSource, que intermediará entre el transformador y el árbol
            // DOM.

            DOMSource source = new DOMSource(documento);

            // 6º Realizamos la transformación.

            transformer.transform(source, result);

            NodeList vuelos = documento.getElementsByTagName("vuelo");

            // Recorrer los nodos de vuelo y hacer los cambios necesarios
            for (int i = 0; i < vuelos.getLength(); i++) {
                Node vuelo = vuelos.item(i);
                if (vuelo.getNodeType() == Node.ELEMENT_NODE) {
                    Element elemento = (Element) vuelo;
                    String idOriginal = elemento.getElementsByTagName("id").item(0).getTextContent();
                    String aerolinea = null;
                    if (idOriginal.length() >= 3) {
                        aerolinea = idOriginal.substring(0, 3);
                        // Resto del código
                    }
                    String vueloNumero;
                    if (idOriginal.length() >= 6) {
                        vueloNumero = idOriginal.substring(3, 6);
                    } else {
                        vueloNumero = ""; // o podrías manejarlo de otra manera según tu lógica
                    }


                    String pais = idOriginal.substring(6, Math.min(9, idOriginal.length()));
                    String continente = idOriginal.substring(6, Math.min(8, idOriginal.length()));
                    String nuevoId = aerolinea + vueloNumero + pais + continente;

                    // Crear el nuevo nodo de identificador con el formato especificado
                    Element nuevoIdElemento = documento.createElement("id");
                    nuevoIdElemento.appendChild(documento.createTextNode(nuevoId));
                    // Reemplazar el nodo de identificador original con el nuevo nodo
                    elemento.replaceChild(nuevoIdElemento, elemento.getElementsByTagName("id").item(0));
                    // Eliminar el nodo de compañía
                    elemento.removeChild(elemento.getElementsByTagName("compania").item(0));


                }
            }
            File file = new File(".\\src\\Aeropuerto\\aeropuerto3.html");

            // 2º Creamos una nueva instancia del transformador a través de la fábrica de
            // transformadores.

            Transformer transformers = TransformerFactory.newInstance().newTransformer();

            // 3º Establecemos algunas opciones de salida, como por ejemplo, la codificación
            // de salida.

            //transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformers.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            // 4º Creamos el StreamResult, que intermediará entre el transformador y el
            // archivo de destino.

            StreamResult results = new StreamResult(file);

            // 5º Creamos el DOMSource, que intermediará entre el transformador y el árbol
            // DOM.

            DOMSource sources = new DOMSource(documento);

            // 6º Realizamos la transformación.

            transformer.transform(sources, results);

        } catch (ParserConfigurationException | IOException | TransformerException | SAXException e) {
            throw new RuntimeException(e);
        }
    }
}
