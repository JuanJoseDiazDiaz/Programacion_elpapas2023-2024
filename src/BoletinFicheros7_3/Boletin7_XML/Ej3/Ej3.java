package BoletinFicheros7_3.Boletin7_XML.Ej3;

import org.w3c.dom.Attr;
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
                String textoPrecio = plato.getElementsByTagName("price")
                        .item(0)
                        .getTextContent()
                        .replaceAll(",", ".");

                double precio = Double.parseDouble(textoPrecio.substring(0, textoPrecio.length() - 1));
                if (precio < precioBase) {
                    System.out.println(plato.getElementsByTagName("name").item(0).getTextContent());
                }
            }
            System.out.println("\n");

            platos = documento.getElementsByTagName("food");
            int caloriasBase = 500;
            System.out.println("platos con menos de 500 calorias: ");
            for (int i = 0; i < platos.getLength(); i++) {
                Element plato = (Element) platos.item(i);
                String textoCaloria = plato.getElementsByTagName("calories")
                        .item(0)
                        .getTextContent()
                        .replaceAll(",", ".");

                int calorias = Integer.parseInt(textoCaloria);
                if (calorias < caloriasBase) {
                    System.out.println(plato.getElementsByTagName("name").item(0).getTextContent());
                }
            }

            for (int i = 0; i < platos.getLength(); i++) {
                Element plato = (Element) platos.item(i);
                plato.setAttribute("id", String.valueOf(i + 1));
            }

            Element newElement = documento.createElement("food");
            newElement.setAttribute("id", String.valueOf(platos.getLength() + 1));
            Element newNombre = documento.createElement("name");
            newNombre.setTextContent("Churros bermu");
            newElement.appendChild(newNombre);
            Element newPrice = documento.createElement("price");
            newPrice.setTextContent("1,5 €");
            newElement.appendChild(newPrice);
            Element newCalories = documento.createElement("calories");
            newPrice.setTextContent("600");
            newElement.appendChild(newCalories);
            Element newDescription = documento.createElement("description");
            newPrice.setTextContent("Son unos churros increibles");
            newElement.appendChild(newDescription);

            documento.getDocumentElement().appendChild(newElement);

            // 1º Creamos una instancia de la clase File para acceder al archivo donde
            // guardaremos el XML.

            File f = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej3\\desayuno2.html");

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

            for (int i = 0; i < platos.getLength(); i++) {
                Element platoMaxCalories = (Element) platos.item(i);
                NodeList caloriesList = platoMaxCalories.getElementsByTagName("calories");

                if (caloriesList.getLength() > 0) { // Verifica si existe la etiqueta "calories"
                    String caloriesText = caloriesList.item(0).getTextContent();

                    if (!caloriesText.isEmpty()) { // Verifica si el contenido de "calories" no está vacío
                        int calories = Integer.parseInt(caloriesText);

                        if (calories > 500) {
                            platoMaxCalories.getParentNode().removeChild(platoMaxCalories);
                        }
                    }
                }
            }


            File file = new File(".\\src\\BoletinFicheros7_3\\Boletin7_XML\\Ej3\\desayuno2.html");

            // 2º Creamos una nueva instancia del transformador a través de la fábrica de
            // transformadores.

            Transformer transformers = TransformerFactory.newInstance().newTransformer();

            // 3º Establecemos algunas opciones de salida, como por ejemplo, la codificación
            // de salida.

            //transformer.setOutputProperty(OutputKeys.INDENT, "yes");

            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");

            // 4º Creamos el StreamResult, que intermediará entre el transformador y el
            // archivo de destino.

            StreamResult results = new StreamResult(f);

            // 5º Creamos el DOMSource, que intermediará entre el transformador y el árbol
            // DOM.

            DOMSource sources = new DOMSource(documento);

            // 6º Realizamos la transformación.

            transformer.transform(sources, result);




        } catch (ParserConfigurationException | SAXException | IOException | TransformerConfigurationException e) {
            System.out.println("Error, lo siento No se ha encontrado el archivo");
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}
