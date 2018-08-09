import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
public class Main {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Cargo> cargoList = new ArrayList<Cargo>();
        System.out.println("Enter the weight to filter:");
		//fill code here.
        float weight = Float.parseFloat(br.readLine());
        CargoDAO cargoDAO = new CargoDAO();
        cargoList = cargoDAO.filterCargoByWeight(weight);
        if(cargoList.size() == 0)
            System.out.println("No cargo found");
        else
        {
            System.out.format("%-15s %-25s %-15s %-15s %s\n", "Cargo id","Cargo name","Width","Height","Cargo weight");
            //fill code here.
            Cargo cargo = null;
            DecimalFormat df = new DecimalFormat("#.00");
            for(int i=0;i<cargoList.size();i++){
            	cargo = cargoList.get(i);
            	System.out.println(String.format("%-15s %-25s %-15s %-15s %s",
            			cargo.getId(), cargo.getName(), df.format(cargo.getWidth()), df.format(cargo.getHeight()), df.format(cargo.getWeight())));
            }
        }
    }
}
