import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.LinkedHashMap;

public class Xmlparser implements DifferentParser
{

    public void parser(String s) throws ParserConfigurationException, IOException, org.xml.sax.SAXException
    {
        File file = new File (s);

        String str = null;
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();


        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(file);


            NodeList nListtnew= document.getElementsByTagName("PL_Signature");

            Element childdd  = (Element) nListtnew.item(0);
            NodeList nList = document.getElementsByTagName("Free_Variables");
            Element child  = (Element) nList.item(0);

            NodeList childList = child.getElementsByTagName("Variable");

        LinkedHashMap<String, CarIdentities> mapv=new LinkedHashMap<String, CarIdentities>();
        PopulateObjects obj2=new PopulateObjects();
        for(int i=0;i<childList.getLength();i++)
        {
            CarIdentities carIdentities = new CarIdentities();
            carIdentities.setPlsignature (childdd.getTextContent());

            str=childdd.getTextContent();
            Node attr = childList.item(i);
            mapv.put(attr.getAttributes().getNamedItem("Title").getNodeValue(),obj2.func(carIdentities,attr));
        }

                NodeList nListtt= document.getElementsByTagName("PL_Signature");
                Element childd  = (Element) nListtt.item(0);

                NodeList nListt = document.getElementsByTagName("J1939");
                Element childddd  = (Element) nListt.item(0);

                NodeList childdddList = childddd.getElementsByTagName("Variable");


        for(int i=0;i<childdddList.getLength();i++)
        {
            CarIdentities carIdentities = new CarIdentities();
            carIdentities.setPlsignature(childd.getTextContent());
            Node attrr = childdddList.item(i);

            CarIdentities caarIdentities=obj2.func(carIdentities,attrr);

            if(mapv.containsKey(attrr.getAttributes().getNamedItem("Title").getNodeValue()))
            {
                mapv.put(attrr.getAttributes().getNamedItem("Title").getNodeValue(),caarIdentities);
            }
        }
        FileHandler.writeoutput(mapv,str);
    }
}
