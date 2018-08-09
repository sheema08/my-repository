import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class PaymentDAO {


    
    
    void updatePaymentStatus(List<Cheque> chequeList) throws Exception {
        //fill the code
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	Cheque cheque = null;
    	for(int i =0;i<chequeList.size();i++){
    		cheque = chequeList.get(i);
    		String query = "update payment set status='"+cheque.getStatus()+"' where id="+cheque.getPayment().getId();
        	st.executeUpdate(query);
    	}
    	st.close();
    	con.close();
    }
    List<Payment> getAllPayments() throws Exception{
        //fill the code
    	List<Payment> paymentList = new ArrayList<Payment>();
    	
    	Connection con = DbConnection.getConnection();
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("select * from payment");
    	Payment payment = null;
    	
    	while(rs.next()){
    		payment = new Payment(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getDouble(4), rs.getString(5));
    		paymentList.add(payment);
    	}
    	
    	rs.close();
    	st.close();
    	con.close();
    	
    	return paymentList;
    }
}
