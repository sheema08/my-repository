import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class PaymentBO {

	List<Cheque> readChequeDetails(String input) throws Exception {

		// fill the code
		List<Cheque> chequeList = new ArrayList<Cheque>();

		File file = new File(input);
		BufferedReader br = new BufferedReader(new FileReader(file));

		String st;
		Cheque cheque = null;
		String[] temp = new String[5];
		Payment payment = null;
		while ((st = br.readLine()) != null) {
			temp = st.split(",");
			payment = new Payment(Integer.parseInt(temp[3]), "", 0, 0.0, temp[4]);
			cheque = new Cheque(Integer.parseInt(temp[0]), temp[1], temp[2],
					payment, temp[4]);
			chequeList.add(cheque);
		}

		return chequeList;
	}

}
