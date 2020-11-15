import java.util.Comparator;

public class ServiceComparator implements Comparator<Service> {

    public int compare(Service service, Service service1) {
        return service.getCost() - service1.getCost();
    }
}
