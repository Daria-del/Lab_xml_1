import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

public class XMLParser extends DefaultHandler {

    List<Service> services = new ArrayList<>();

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("Name")) {
            Service service = new Service();
            service.setName(attributes.getValue("name"));
            services.add(service);
        }
        if (qName.equals("Cost")) {
            getLatService(services).setCost(Integer.parseInt(attributes.getValue("count")));
        }
    }


    public Service getLatService(List<Service> services){
        return services.get(services.size() - 1);
    }

}
