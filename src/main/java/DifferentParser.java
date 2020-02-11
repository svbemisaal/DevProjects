import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.Map;

public abstract class DifferentParser
{
            void print(Map<>) {
                System.out.println("hello");
            }

         abstract void  parser(String s) throws ParserConfigurationException, IOException, SAXException;
}
