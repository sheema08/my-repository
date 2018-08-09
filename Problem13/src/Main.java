import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeMap;
public class Main {

    public static void main(String[] args) {
		// fill code here
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = null;
		System.out.println("Enter number of ports :");
		int count = sc.nextInt();
		String[] portInfo = new String[5];
		String[][] ports = new String[count][1];
		System.out.println("Enter port details :");
		String[] temp = new String[count];
		String t = "";
		for(int i=0;i < count;i++){
			t = sc.nextLine();
			
			if(t.isEmpty()){
				System.out.print("");
				i--;
			} else {
				temp[i] = t;
			}
		}
		
		for(int i=0;i < count;i++){
			portInfo = new String[5];
			int j = 0;
			st = new StringTokenizer(temp[i],"|");			
			while (st.hasMoreTokens()) {  
			    portInfo[j] = st.nextToken();  
			    j++;
			}			
			ports[i] = portInfo;
		}
			
		Map<Integer,String> onePort = new TreeMap<Integer,String>();
		boolean isOnePortPresent = false;
		Map<Integer,String> multiPort = new TreeMap<Integer,String>();
		boolean isMultiPortPresent = false;
		String[] splitPortInfo = new String[5];
		for(int i=0;i<count;i++){
			splitPortInfo = ports[i];
			
			if(("1".equals(splitPortInfo[2]) && "0".equals(splitPortInfo[3]) && "0".equals(splitPortInfo[4])) ||
					("0".equals(splitPortInfo[2]) && "1".equals(splitPortInfo[3]) && "0".equals(splitPortInfo[4])) ||
					("0".equals(splitPortInfo[2]) && "0".equals(splitPortInfo[3]) && "1".equals(splitPortInfo[4]))){
				onePort.put(Integer.parseInt(splitPortInfo[0]), splitPortInfo[1]);
				isOnePortPresent = true;
			} else {
				if(("1".equals(splitPortInfo[2]) && "1".equals(splitPortInfo[3]) && "0".equals(splitPortInfo[4])) ||
						("1".equals(splitPortInfo[2]) && "0".equals(splitPortInfo[3]) && "1".equals(splitPortInfo[4])) ||
						("0".equals(splitPortInfo[2]) && "1".equals(splitPortInfo[3]) && "1".equals(splitPortInfo[4])) ||
						("1".equals(splitPortInfo[2]) && "1".equals(splitPortInfo[3]) && "1".equals(splitPortInfo[4]))){
					multiPort.put(Integer.parseInt(splitPortInfo[0]), splitPortInfo[1]);
					isMultiPortPresent = true;
				}
			}
		}		
		
		System.out.println("One mode of transportation :");
		if(!isOnePortPresent){
			System.out.println("No such transportation available");
		} else {
			System.out.format("%-5s%s\n","Id","Name");
			for (Map.Entry<Integer,String> entry : onePort.entrySet()) 
				System.out.format("%-5s%s\n", entry.getKey(), entry.getValue());
		}
		
		System.out.println("More than one mode of transportation :");
		if(!isMultiPortPresent){
			System.out.println("No such transportation available");
		} else {
			System.out.format("%-5s%s\n","Id","Name");
			for (Map.Entry<Integer,String> entry : multiPort.entrySet()) 
				System.out.format("%-5s%s\n", entry.getKey(), entry.getValue());
		}
	}
}
