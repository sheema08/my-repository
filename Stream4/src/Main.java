
public class Main {
	public static void main(String[] args) throws Exception{
		
		InvoiceBO invoiceBO = new InvoiceBO();
		
		invoiceBO.findAllRejectedPayments("input.txt","output.txt");		  
	}
}
