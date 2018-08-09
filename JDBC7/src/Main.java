import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String ags[])throws Exception{
        // fill the missing code
    	PaymentBO paymentBO = new PaymentBO();
		List<Cheque> chequeList = new ArrayList<Cheque>();
		PaymentDAO paymentDAO = new PaymentDAO();
		
		chequeList = paymentBO.readChequeDetails("input.txt");
		
		List<Payment> paymentList = paymentDAO.getAllPayments();
        System.out.println("List of the Payment Details ");
        System.out.println(String.format("%-5s %-15s %-17s %-15s %s","Id", "User Name","Attempts","Amount","Status"));
        for(int i=0;i<paymentList.size();i++){
        	paymentList.get(i).setStatus("Pending");
        	System.out.println(paymentList.get(i));
        }
        
        paymentDAO.updatePaymentStatus(chequeList); 
        
        List<Payment> updatedPaymentList = new ArrayList<Payment>();
        updatedPaymentList = paymentDAO.getAllPayments();
        System.out.println("List of the Payment Details After Updation");
        System.out.println(String.format("%-5s %-15s %-17s %-15s %s","Id", "User Name","Attempts","Amount","Status"));
        for(int i=0;i<updatedPaymentList.size();i++){
        	System.out.println(updatedPaymentList.get(i));
        }
    }
    
    
}
