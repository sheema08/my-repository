import java.util.Comparator;

public class PortComparator implements Comparator<Port> {
	@Override
	public int compare(Port obj1, Port obj2) {
       String p1 = obj1.getCountry();
       String p2 = obj2.getCountry();

       return p1.compareTo(p2);
    }
}
