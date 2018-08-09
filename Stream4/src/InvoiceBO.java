import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class InvoiceBO {
	public void  findAllRejectedPayments(String inputfilename,String outputfile) throws Exception{
		
		File file = new File(inputfilename);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		FileWriter writer = new FileWriter(outputfile);
		 
		String st;
		String[] temp = new String[7];
		while ((st = br.readLine()) != null){
			temp = st.split(",");			
			if("Rejected".equalsIgnoreCase(temp[6])){
				writer.write(temp[0]+","+
						temp[2]+","+
						temp[1]+","+
						temp[5]+","+
						temp[6]+"\n");
				}
		}		
		writer.flush();
		writer.close();
	}
}
