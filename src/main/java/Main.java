import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException{
        ServiceHandler serviceHandler = new ServiceHandler();

        List<Service> services = serviceHandler.getServices();

        for (Service service : services) {
            System.out.println(service.toString());
        }

        Comparator comparator = new ServiceComparator();
        Collections.sort(services, comparator);
        System.out.println("\nAfter sorting to price\n");
        for (Service service : services) {
            System.out.println(service.toString());
        }
    }
}
