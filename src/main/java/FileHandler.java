import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.*;
import java.util.*;

//
    public class FileHandler
{

    public void inputtaken()
    {
        try
        {


            String s;
            RandomAccessFile file = new RandomAccessFile("/Users/shubham.varshney/Documents/path.txt", "r");
             String s;


            Xmlparser xmlparser = new Xmlparser();
            while ((s = file.readLine()) != null)
            {

                System.out.print(s);
                String extension = "";

                int i = s.lastIndexOf('.');

                if (i >= 0)
                {
                    extension = s.substring(i+1);
                }
                if(extension.equals("xml"))
                {
                    //xmlparser = new Xmlparser();
                    xmlparser.parser(s);
                }
//                else if(extension.equals("xml")) {
//
//                }
                System.out.print(extension);
            }
        }

        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (SAXException e)
        {
            e.printStackTrace();
        }
        catch (ParserConfigurationException e)
        {
            e.printStackTrace();
        }
    }


    public  static void  writeoutput(LinkedHashMap<String,CarIdentities> mapv,String str) throws IOException
    {
        Iterator it = mapv.entrySet().iterator();
        ObjectMapper ob = new ObjectMapper();

        String json ="";

        while(it.hasNext())
        {
            Map.Entry mape = (Map.Entry)it.next();
            CarIdentities ce = (CarIdentities)mape.getValue();
             try
             {
                 json=json+(ob.writeValueAsString(ce));
                         json+='\n';
             }
             catch (JsonProcessingException e)
             {
                e.printStackTrace();
             }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }

            try
            {

                FileWriter file = new FileWriter("/Users/shubham.varshney/Documents"+"/"+str+".txt");

                file.write(json);
                file.flush();
                file.close();
            }

            catch (IOException e)
            {
                e.printStackTrace();
            }
    }
}


