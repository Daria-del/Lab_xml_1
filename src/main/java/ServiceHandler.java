import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ServiceHandler {
    private static final String path_xml_file = "src/main/resources/my_xml.xml";

    private XMLParser xmlParser;
    private File file ;

    public ServiceHandler() throws ParserConfigurationException, SAXException, IOException {
        this.xmlParser = new XMLParser();
        this.file = new File(path_xml_file);
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();

        parser.parse(file, xmlParser);
    }

    public List<Service> getServices() {
        return xmlParser.services;
    }

}
